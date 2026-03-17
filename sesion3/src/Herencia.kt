open class Persona(
    private var nombre: String = "",
    private var apellido: String = "",
)
{
    fun saludar(): String
    {
        return "Hola mi nombre es " + "$nombre $apellido, mucho gusto"
    }
}

class Empleado(nombre: String,
               apellido: String,
                var rol: String
                ) : Persona(nombre, apellido) {}

fun main(args: Array<String>)
{
    val empleado = Empleado("Jose", "Garcia", "Docente")
    println(empleado.saludar())
}