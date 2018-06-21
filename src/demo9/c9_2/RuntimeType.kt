package demo9.c9_2

import java.lang.IllegalArgumentException

/**
 * 运行时泛型
 */
fun printSum(c:Collection<*>){
    val list  = c as? List<Int>
    ?:throw IllegalArgumentException("can't cast List<Int>")
    println(list.sum())
}

inline fun <reified T> isA(value:Any) = value is T

fun main(args: Array<String>) {
    val list = listOf(1,2,3)
    val set = setOf(1,2,3)
//    val list = listOf("1","2","3")
    printSum(list)

    val items = listOf("a",2,"c")
    println(items.filterIsInstance<String>())

    println(isA<String>("a"))
}