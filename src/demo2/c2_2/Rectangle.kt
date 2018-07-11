package demo2.c2_2

class Rectangle(val height:Int,val width:Int){
    val isSquare:Boolean
    get() {
        return height==width
    }
}

fun main(args: Array<String>) {
    val r = Rectangle(10,10)
    println(r.isSquare)
}