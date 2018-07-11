package demo2.c2_1

fun main(args: Array<String>) {
    println("Hello world")
    println(max(5,14))
    println("Hello ${if (args.size>0) args[0] else "someone"}")
}

//fun max(a:Int,b:Int):Int{
//    return if (a>b) a else b
//}

/**
 * 表达式体函数
 */
fun max(a:Int,b:Int) = if (a>b) a else b