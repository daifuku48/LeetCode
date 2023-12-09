data class Person(val name: String, val age: Int)


fun main(args: Array<String>) {
    val person1 = Person("Alice", 30)
    val person2 = Person("Alice", 30)

    println(person1.hashCode()) // Хеш-код person1
    println(person2.hashCode())
}