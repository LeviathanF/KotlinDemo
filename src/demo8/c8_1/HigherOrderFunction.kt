package demo8.c8_1

import javafx.util.Builder

/**
 * 高阶函数demo
 */

fun twoAndThree(operation:(Int,Int)->Int){
    val result = operation(2,3)
    println("$result")
}

fun String.filter(predicate:(Char)->Boolean):String{
    val sb = StringBuilder()
    for (index in 0 until length){
        val element = get(index)
        if (predicate(element))
            sb.append(element)
    }
    return sb.toString()
}

fun <T> Collection<T>.joinToString(
        separator:String=" ",
        prefix:String = "{",
        postfix:String = "}",
        transform:(T) ->String = {it.toString()}
):String{
    val sb = StringBuilder(prefix)
    for ((index,element) in withIndex()){
        if (index>0) sb.append(separator)
        sb.append(transform(element))
    }
    sb.append(postfix)
    return sb.toString()
}

fun main(args: Array<String>) {
    twoAndThree { a, b -> a+b  }
    twoAndThree { a, b -> a*b }

    println("abce".filter { it in 'a'..'z' })

    val list = listOf("a","b","c")
    println(list.joinToString (separator = ",",transform ={ it->it.toUpperCase() }))
}