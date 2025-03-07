// class Person {
//     var name: String = ""
//     var age: Int = 0

//     fun introduce() {
//         println("My name is $name, and I am $age years old.")
//     }
//  }
//  fun main() {
//     val person = Person()
//     person.name = "Alice"
//     person.age = 25
//     person.introduce()
// }

// class Person 
//     (var name: String, var age:Int){
//     fun introduce() {
//         println("My name is $name , and I am $age years old")
//     }
// }
fun main() {
// val person = Person("Bob", 30)
// person.introduce()

// class Person(var name:String, var age: Int) {
//     constructor(name:String):this(name, 0)

//     fun introduce () {
//         println("My name is $name . and I am $age years old.")
//     }
// }
// val person1 = Person("Dave", 40)
// val person2 = Person("Eve")

// person1.introduce()
// person2.introduce()

class Person {
    var name: String = ""
    get() = field.uppercase()
    set(value) {
        field = value.trim()
    }
}

val person = Person()
person.name = " Alice "
println(person.name)

}
