class Estudiante
{
    var nombre = ""
    var edad = 0

    fun estudiar()
    {
        println("$nombre esta estudiando...")
    }
}

class Asignatura(private val nombre: String, private val precio: Double)
{
    fun getnombre():String
    {
        return "La asignatura se llama: $nombre"
    }

    fun getPrecio(): Double
    {
        return precio
    }
}

fun main()
{
    val estudiante = Estudiante()

    estudiante.nombre = "Harry Potter"
    estudiante.edad = 40

    estudiante.estudiar()

    estudiante.nombre = "Manuel Chamorro"
    estudiante.edad = 20
    estudiante.estudiar()

    val poo = Asignatura("POO", 250.0)
}