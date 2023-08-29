fun  getfullname(firstname:String,lastname:String=""):String{

    return if (lastname.isNotEmpty()){
        "$firstname $lastname"
    }else{
        firstname
    }
}

fun  scoreCalc(correctanswer:Int, totalquestions:Int):Int{
    return (correctanswer*100)/totalquestions

}


fun main(args: Array<String>) {
    // lambda function
    val sum ={num1:Int,num2:Int -> num1+num2}

    println("20+7 :${sum(20,7)}")
    val stud1=getfullname("Sylvia","Mogotu")
    println(stud1)
    val correctanswer=8
    val totalquestions=10
    val score=scoreCalc(correctanswer,totalquestions)
    println("your score is : $score%")
}

