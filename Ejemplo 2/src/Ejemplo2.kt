import javax.swing.JOptionPane

fun main()
{
    val num1 = JOptionPane.showInputDialog(null,"Dame un numero").toInt()
    val num2 = JOptionPane.showInputDialog(null,"Dame otro numero").toInt()

    val calc = Calculadora()

    val suma = calc.sumar(num1, num2)
    JOptionPane.showMessageDialog(null, "Resultado $suma")

    if (num2 != 0) {
        val div = calc.divi(num1.toInt(), num2.toInt())
        JOptionPane.showMessageDialog(null, "Resultado $div")
    }
    else{
        JOptionPane.showMessageDialog(null, "Nose puede dividir entre 0")
    }

    var msn = ""
    for(num in num1 <= .. <= num2){
        msn += num.toString()
    }
    JOptionPane.showMessageDialog(null, "msn")
}