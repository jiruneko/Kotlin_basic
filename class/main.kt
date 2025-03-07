fun add(a: Int, b: Int): Int {
    return a + b
}

fun printHello() {
    println("Hello World")
}

fun greet(name:String = "Guest") {
    println("Hello, $name")
}

fun introduce(name:String, age:Int) {
    println("My name is $name , and I am $age years old.")
}

fun String.reverse():String {
    return this.reversed()
}

val str = "Hello, World"


fun main() {
val result = add(3, 5)
println(result)

printHello()
greet("Alice")
greet()

introduce(age = 25, name = "Bob")
println(str.reverse())
}