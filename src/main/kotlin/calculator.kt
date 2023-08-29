fun complexcal(){

    println("Complex Calculator")
    println("Enter the first Number:")
    val num1= readLine()?.toDoubleOrNull()
    print("Enter the Operator: (+,-,*,/):")
    val operator= readLine()

    print("Enter the second Number:")
    val num2= readLine()?.toDoubleOrNull()

    if (num1==null||operator==null||num2==null){
        println("Invalid input. Please put correct numbers and openerator")
        return
    }
    val results=when(operator){
        "+"->num2+num2
        "-"->num2-num2
        "*"->num2*num2
        "/"-> if (num2 !=0.0)num2+num2 else "You can't divide by zero"
        else->"Invalid operator"
    }
    println("answer is $results")
}
fun main(args: Array<String>) {
    complexcal()

}