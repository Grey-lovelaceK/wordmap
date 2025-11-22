package com.desafiolatam.listadodetiendas.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.desafiolatam.listadodetiendas.R
import com.desafiolatam.listadodetiendas.databinding.ActivityStoreDetailBinding
import com.desafiolatam.listadodetiendas.model.Store

class StoreDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStoreDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStoreDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras?.getBundle("BUNDLE")
        val store = bundle?.getParcelable<Store>("STORE")

        if (store != null) {
            Log.i("INFORMATION", store.name)
        }

        binding.run {
            store?.run {
                textViewStoreName.text = name
                textViewStoreAddress.text = address

                textViewStoreAddress.setOnClickListener {
                    try {
                        val mapsUrl = "https://www.google.com/maps/search/?api=1&query=${Uri.encode(address)}"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(mapsUrl))
                        startActivity(intent)
                    } catch (e: Exception) {
                        Toast.makeText(
                            this@StoreDetailActivity,
                            "Error al abrir mapa: ${e.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                        Log.e("MAP_ERROR", "Error: ${e.message}")
                    }
                }


                textViewStoreName.setOnClickListener {
                    val intent = Intent.makeMainSelectorActivity(
                        Intent.ACTION_MAIN,
                        Intent.CATEGORY_APP_EMAIL
                    )
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(Intent.createChooser(intent, "Email"))
                }

                textViewStoreOfficeHours.text = officeHours
                textViewStoreHistory.text = history

                Glide.with(applicationContext)
                    .load(photo)
                    .centerCrop()
                    .error(R.drawable.baseline_error_outline_24)
                    .into(imageViewStore)
            }
            backButton.setOnClickListener {
                finish()
            }
        }
    }
}