class computer{
    var brand=""
    var price=0
    var specs=""
}

fun main(args: Array<String>) {
    val myObj=computer()
    myObj.brand="Hewlett pack"
    myObj.price=50000
    myObj.specs="core i7 512 ssd 16gb Ram"
    println("My laptop is ${myObj.brand} ad it is ${myObj.specs} and it costs ksh.${myObj.price} ")
}