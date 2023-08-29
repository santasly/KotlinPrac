fun main(args: Array<String>) {
    var ch='a'
    val num1=12
    when (ch){
        'a' -> println("a IS A Vowel")
        'e' -> println("e IS A Vowel")
        'i' -> println("i IS A Vowel")
        'o' -> println("o IS A Vowel")
        'u' -> println("u IS A Vowel")

        else -> println("&ch is a consonant")

    }


    when (num1){
        in 1..9 -> println("Its a single Digit no")
        in 10..99 -> println("Its a double Digit no")
        in 100..999 -> println("Its a triple Digit no")
        else -> println("Has more than three Digits")
    }
}