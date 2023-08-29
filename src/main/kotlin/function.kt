fun syl(){
    println("This is a user defined function")
}
fun main(args: Array<String>) {
    syl()
    arith()
}
 fun  arith(){
     var num1=10
     var num2=20
     println("The sum of $num1 and $num2 is : ${num1+num2} ")
     println("The product of $num1 and $num2 is : ${num1*num2} ")
     println("The modulus of $num1 and $num2 is : ${num1%num2} ")
     println("The difference of $num1 and $num2 is : ${num1-num2} ")
 }