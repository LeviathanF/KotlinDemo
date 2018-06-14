package demo7.c7_4

/**
 * 结构函数
 */
class Point(var x:Int?,var y:Int?){
    operator fun component1() = x
    operator fun component2() = y
}

fun main(args: Array<String>) {
    val (x,y) = Point(1,2)
    println("$x $y")
}