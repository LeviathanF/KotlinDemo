package demo7.c7_2

data class EqualPoint(var x:Int,var y:Int){
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is EqualPoint) return false
        return other.x == x && other.y == y
    }
}

fun main(args: Array<String>) {
    var p1 = EqualPoint(1,1)
    var p2 = EqualPoint(2,2)

    println(p1.equals(p2))
}