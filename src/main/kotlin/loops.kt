fun main(args: Array<String>) {
    // for loops
    for (i in 5..15){
        println("My Loops:$i")
    }
    var myarr= arrayOf("Eric","John","Clare")
    for (names in myarr){
        println("Student:$names")
    }
    //do..while
    var num2=20
    do{
        println("Loop : &num2")
        num2+=2
    }while (num2<=110)
}