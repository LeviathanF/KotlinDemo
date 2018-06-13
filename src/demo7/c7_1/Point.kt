package demo7.c7_1

/**
 * 重载算数运算符
 */
data class Point(val x:Int,val y:Int){
    /**
     * 重载+运算符
     */
    operator fun plus(other:Point):Point{
        return Point(x+other.x,y+other.y)
    }

    /**
     * 重载*运算符
     */
    operator fun times(double:Double):Point{
        return Point((x*double).toInt(),(y*double).toInt())
    }

    /**
     * 重载-运算符
     */
    operator fun unaryMinus():Point{
        return Point(-x,-y)
    }

    /**
     * 重载运算符 --
     */
    operator fun dec():Point{
        return Point(x-1,y-1)
    }
}

/**
 * 重载基本类型的*运算符
 */
operator fun Char.times(count:Int):String{
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    var p1 = Point(1,1)
    var p2 = Point(1,1)
    println((p1+p2))
    println(p1*3.5)
    println(-p1)
    println(--p1)
    println('s'*10)
}