open class Animal(val name:String){
    open fun makesound(){
        println("$name makes a sound")
    }
}
class  Cat(name: String):Animal(name){
    override fun makesound() {
        println("$name meows")
    }
}
class Dog(name: String):Animal(name){
    override fun makesound() {
        println("$name barks")
    }
}
class Donkey(name: String):Animal(name){
    override fun makesound() {
        println("$name brays")
    }
}

fun main(args: Array<String>) {
    val dog=Dog(name = "Bosco")
    val cat=Cat(name = "Paka")
    val donkey=Donkey(name = "Punda")

    dog.makesound()
    cat.makesound()
    donkey.makesound()
}