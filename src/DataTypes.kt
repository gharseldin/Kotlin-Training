
fun main(args: Array<String>){
    // exploring Kotlin data types
    var name: String = "Amr"
    println(name)
    name = "Gharseldin"
    println(name)

    var number:Int
    number = 277
    println(number)

    var gender: Char
    gender = 'M'

    println(gender)

    var isMale: Boolean
    isMale = true
    val aDecimal: Float = 1.9F
    var percentage: Double = 76.9

    println("My name is " + name + " Gender = " + gender)
    println("My name is $name and Gender is $gender")

    var str = "This is a sample string"
    println(str.length)
    println("The length of ths string is ${str.length}")
    println("This is some operation ${aDecimal * percentage}")

}