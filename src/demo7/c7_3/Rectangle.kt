package demo7.c7_3

import demo7.c7_1.Point
import java.time.LocalDate

/**
 * 测试重写in运算符
 */
data class Rectangle(val upperLeft:Point,val lowerRight:Point){
    /**
     * 重写 in 运算符 测试传入的点是否在矩形中
     */
    operator fun contains(point: Point):Boolean{
        return point.x in upperLeft.x until lowerRight.x &&
                point.y in lowerRight.y until upperLeft.y
    }
}

operator fun ClosedRange<LocalDate>.iterator():Iterator<LocalDate> =
        object:Iterator<LocalDate>{
            var current = start
            override fun hasNext() =
                    current <= endInclusive

            override fun next() = current.apply{
                current.plusDays(1)
            }
        }

fun main(args: Array<String>) {
    val rectangle = Rectangle(Point(0, 50), Point(50, 0))
    println(Point(10,10) in rectangle)
    println(Point(100,10) in rectangle)

    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusDays(2) in vacation)

    for (day in vacation){
        println(day)
    }
}