package demo2.c2_2

//class Person(val name:String,var isMarried:Boolean){
//}

class Person(name: String, isMarried: Boolean) {
    var name:String = name
    var isMarried:Boolean = isMarried
}
fun main(args: Array<String>) {
    val p = Person("person",true)
    println(p.name)
    println(p.isMarried)
}