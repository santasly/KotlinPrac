class People(val name:String,val age:Int, val gender:String){
    fun Jitambulishe(){
        println("Hi, my name is $name, I am a $age years old $gender")
    }
//    member function to have a birthday
    fun haveBirthday(){
//    age
        println("$name is $gender, and just turned $age years")
    }

}

fun main(args: Array<String>) {
    //  create an instance (objects) of the class
    val watu=People( "John", 45, "male")
    val watu2=People("Mary", 56, "female")
    val watu3=People("hanna", 67, "female")

    watu.Jitambulishe()
    watu.haveBirthday()
    watu2.Jitambulishe()
    watu2.haveBirthday()
    watu3.Jitambulishe()
    watu3.haveBirthday()
}