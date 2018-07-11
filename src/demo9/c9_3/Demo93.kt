package demo9.c9_3

fun printContent(list:List<Any>){
    println(list.joinToString())
}

fun addAnswer(list:MutableList<Any>){
    list.add(42)
}

fun main(args: Array<String>) {
    val list = mutableListOf("abc","a","b","c")
    println(NAME)
//    printContent(list)
}