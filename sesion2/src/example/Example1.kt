package example

fun main(args: Array<String>)
{
    val age : Int = 20
    val name : String = "Manuel"
    val salary : Double = 1250.0
    val isSingle : Boolean = false
    println("Nombre $name tiene $age.")
    println("Posee un de $ $salary semanal.")
    if(isSingle)
        println("Feliz.")
    else
        println("Feliz, pero solo con una.")
    println("$name a tenido estas novias ")
    for(i in 1..10 step 2)
    {
        println("Novia # $i")
    }

    println("Esperando a la indicada.")
    for (i in 10 downTo 1 step 2)
    {
        println("La indicada $i")
    }

    println("Lo siento en esta vida te toca ser ingeniero")
}