interface Calculadora
{
    fun sumar(num1: Int, num2: Int): Int

    fun max(num1: Int, num2: Int): Int

    fun min(num1: Int, num2: Int): Int
}

class MisCalc: Calculadora{
    override fun sumar(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun max(num1: Int, num2: Int): Int {
        if (num1 > num2) return num1
        return num2
    }

    override fun min(num1: Int, num2: Int): Int {
        if (num1 < num2) return num1
        return num2
    }
}

fun main(args: Array<String>)
{
    val calc = MisCalc()
    println(calc.sumar(10, 20))
    println(calc.max(10, 20))
    println(calc.min(10, 20))
}