package demo10.c10_1

data class Person(
        @JsonName("test") val name:String,
        @JsonExclude val age:Int)

fun main(args: Array<String>) {
    val p = Person("a",16)
    println(p)
}