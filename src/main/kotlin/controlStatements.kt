fun main(args: Array<String>) {

    var num = 5
    if (num > 10) {
        println("The nun is greater")
    } else {
        println("The nun is less")

    }
    // if..elseif else statement
    val nambari = 89
    if (nambari < 0) {
        println("Its a negative number")
    } else if (nambari > 0 && nambari < 10)
        println("its a one digit number")
    else if (nambari >= 10 && nambari < 100)
        println("Its is a two digits number")
    else
        println("it has three or more digits")

//check marks
    val score = 200
    if ( score<0){
        println("wrong data")}
    else if (score<40)
        println("Fail")
    else if (score>40 && score<60)
        println("pass")
    else if (score>60 && score<70)
        println("Credit")
    else if (score>70 && score<=100)
        println("Distinction")
    else
        println("wrong data")
}
