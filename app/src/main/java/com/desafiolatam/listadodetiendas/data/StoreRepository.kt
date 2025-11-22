package com.desafiolatam.listadodetiendas.data

import com.desafiolatam.listadodetiendas.model.Store
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class StoreRepository {

    private var listStore = listOf<Store>()

    suspend fun getStoreList(): Flow<List<Store>> {

        val response = withContext(Dispatchers.IO) {
            for (i in 0 .. 9){
                delay(100L)
            }

            listOf(
                Store(
                    id = 1,
                    name = "Museo del Louvre",
                    address = "Rue de Rivoli, 75001 Paris, France",
                    officeHours = "Lunes a Domingo desde las 9:00 a las 18:00, Martes cerrado",
                    photo = "https://images.pexels.com/photos/2675061/pexels-photo-2675061.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "El Museo del Louvre es el museo de arte más visitado del mundo. Ubicado en el antiguo palacio real de Francia, alberga obras maestras como la Mona Lisa y la Venus de Milo. Fue inaugurado como museo público en 1793 durante la Revolución Francesa. Su emblemática pirámide de cristal fue añadida en 1989 y se ha convertido en un símbolo arquitectónico de París."
                ),
                Store(
                    id = 2,
                    name = "Torre Eiffel Souvenirs",
                    address = "Champ de Mars, 5 Avenue Anatole France, 75007 Paris, France",
                    officeHours = "Lunes a Domingo desde las 9:30 a las 23:45",
                    photo = "https://images.pexels.com/photos/338515/pexels-photo-338515.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda de souvenirs ubicada a los pies del monumento más icónico de Francia. La Torre Eiffel fue construida entre 1887 y 1889 para la Exposición Universal de París. Diseñada por Gustave Eiffel, inicialmente fue criticada pero ahora es el símbolo indiscutible de París. Con 330 metros de altura, recibe más de 7 millones de visitantes al año."
                ),
                Store(
                    id = 3,
                    name = "Sagrada Familia Store",
                    address = "Carrer de Mallorca, 401, 08013 Barcelona, Spain",
                    officeHours = "Lunes a Domingo desde las 9:00 a las 20:00",
                    photo = "https://images.pexels.com/photos/819764/pexels-photo-819764.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda oficial de la basílica más famosa de Barcelona. La Sagrada Familia es la obra maestra inacabada de Antoni Gaudí, comenzada en 1882 y aún en construcción. Su diseño modernista único combina elementos góticos con formas naturales innovadoras. Fue declarada Patrimonio de la Humanidad por la UNESCO en 2005 y es el monumento más visitado de España."
                ),
                Store(
                    id = 4,
                    name = "Estatua de la Libertad Gift Shop",
                    address = "Liberty Island, New York, NY 10004, United States",
                    officeHours = "Lunes a Domingo desde las 9:30 a las 17:00",
                    photo = "https://images.pexels.com/photos/64271/queen-of-liberty-statue-of-liberty-new-york-liberty-statue-64271.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda de regalos en Liberty Island. La Estatua de la Libertad fue un regalo de Francia a Estados Unidos, inaugurada en 1886. Diseñada por Frédéric Auguste Bartholdi, la estatua representa a Libertas, la diosa romana de la libertad. Con su antorcha en alto y su corona de siete puntas, simboliza la libertad y la bienvenida a los inmigrantes."
                ),
                Store(
                    id = 5,
                    name = "Machu Picchu Artesanías",
                    address = "Machu Picchu, Aguas Calientes, Cusco, Peru",
                    officeHours = "Lunes a Domingo desde las 6:00 a las 17:30",
                    photo = "https://images.pexels.com/photos/2356045/pexels-photo-2356045.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda de artesanías cerca de la ciudadela inca más famosa del mundo. Machu Picchu fue construida en el siglo XV por el emperador inca Pachacútec y abandonada tras la conquista española. Redescubierta en 1911 por Hiram Bingham, esta maravilla arqueológica está ubicada a 2430 metros sobre el nivel del mar. Es Patrimonio de la Humanidad y una de las Siete Maravillas del Mundo Moderno."
                ),
                Store(
                    id = 6,
                    name = "Cristo Redentor Tienda",
                    address = "Parque Nacional da Tijuca, Alto da Boa Vista, Rio de Janeiro, Brazil",
                    officeHours = "Lunes a Domingo desde las 8:00 a las 19:00",
                    photo = "https://images.pexels.com/photos/2868242/pexels-photo-2868242.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda oficial ubicada en el Cerro del Corcovado. El Cristo Redentor es una estatua art déco de Jesús de 30 metros de altura, inaugurada en 1931. Obra del escultor francés Paul Landowski y del ingeniero brasileño Heitor da Silva Costa, se ha convertido en el símbolo más reconocible de Río de Janeiro y de Brasil, ofreciendo vistas panorámicas impresionantes de la ciudad."
                ),
                Store(
                    id = 7,
                    name = "Taj Mahal Emporium",
                    address = "Dharmapuri, Forest Colony, Tajganj, Agra, Uttar Pradesh 282001, India",
                    officeHours = "Sábado a Jueves desde las 6:00 a las 19:00, Viernes cerrado",
                    photo = "https://images.pexels.com/photos/1603650/pexels-photo-1603650.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda de productos locales cerca del mausoleo más famoso del mundo. El Taj Mahal fue construido entre 1632 y 1653 por orden del emperador mogol Shah Jahan en memoria de su esposa favorita, Mumtaz Mahal. Este símbolo del amor eterno es considerado una joya de la arquitectura mogola y combina elementos de las tradiciones arquitectónicas persa, otomana, india e islámica."
                ),
                Store(
                    id = 8,
                    name = "Sydney Opera House Store",
                    address = "Bennelong Point, Sydney NSW 2000, Australia",
                    officeHours = "Lunes a Domingo desde las 9:00 a las 20:30",
                    photo = "https://images.pexels.com/photos/995765/pexels-photo-995765.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda oficial del icónico edificio de Sídney. La Ópera de Sídney fue diseñada por el arquitecto danés Jørn Utzon e inaugurada en 1973 por la Reina Isabel II. Su diseño único de velas blancas es uno de los edificios más fotografiados del mundo. Es sede de más de 1500 presentaciones anuales y fue declarada Patrimonio de la Humanidad en 2007."
                ),
                Store(
                    id = 9,
                    name = "Acrópolis Museum Shop",
                    address = "Dionysiou Areopagitou 15, Athina 117 42, Greece",
                    officeHours = "Lunes a Domingo desde las 8:00 a las 20:00",
                    photo = "https://images.pexels.com/photos/951531/pexels-photo-951531.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda del museo junto a la antigua ciudadela. La Acrópolis de Atenas es una antigua ciudadela ubicada sobre una formación rocosa que domina la ciudad de Atenas. Construida principalmente en el siglo V a.C., alberga el Partenón, templo dedicado a la diosa Atenea. Es el símbolo más importante de la antigua Grecia y representa el apogeo de la civilización y cultura helénica."
                ),
                Store(
                    id = 10,
                    name = "Petra Heritage Shop",
                    address = "Wadi Musa, Ma'an Governorate, Jordan",
                    officeHours = "Lunes a Domingo desde las 6:00 a las 18:00",
                    photo = "https://images.pexels.com/photos/4350099/pexels-photo-4350099.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    history = "Tienda de artesanías beduinas en la ciudad rosa del desierto. Petra fue la capital del reino nabateo desde el siglo VI a.C. hasta el siglo I d.C. Famosa por sus edificios tallados directamente en la roca de arenisca rosada, como el Tesoro (Al-Khazneh). Redescubierta en 1812 por el explorador suizo Johann Ludwig Burckhardt, es una de las Siete Maravillas del Mundo Moderno."
                ),
            )
        }
        listStore = response

        return flowOf(response)
    }

    suspend fun getStoreById(id: Int) : StateFlow<Store?> {
        val data: MutableStateFlow<Store?> = MutableStateFlow(null)
        getStoreList().collect() {
                list -> val store = list.find {
            it.id == id
        }
            data.value = store
        }
        return data
    }
}