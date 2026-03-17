package example

fun evaluarNota(nota: Int)
{
    when (nota)
    {
        in 0..69 -> println("$nota Aprendizaje Inicial")
        in 70..79 -> println("$nota Aprendizaje Basico")
        in 80..89 -> println("$nota Aprendizaje Sastifactorio")
        in 90..100 -> println("$nota Aprendizaje Avanzado")
        else -> println("Nota invalida")
    }
}

fun main(args: Array<String>)
{
    println("Dani posse una nota: ${evaluarNota(67)}")
}