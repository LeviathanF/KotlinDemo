package demo2.c2_3

enum class Color(val r:Int,val g:Int,val b:Int){
    RED(255,0,0),
    ORANGE(255,165,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    VIOLET (238,130,238);

    fun rgb() = (r*256+g)*256+b
}

fun getMnenmonic(color: Color) =
        when(color){
            Color.RED -> "red"
            Color.ORANGE -> "orange"
            Color.YELLOW -> "yellow"
            Color.GREEN -> "green"
            Color.BLUE -> "blue"
            Color.VIOLET -> "violet"
        }

fun getWramth(color: Color) =
        when(color){
            Color.RED,Color.ORANGE,Color.YELLOW ->"warm"
            Color.GREEN -> "neutral"
            Color.BLUE,Color.VIOLET -> "cold"
        }

fun mix(color1:Color,color2:Color) =
        when(setOf(color1,color2)){
            setOf(Color.RED,Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW,Color.BLUE) -> Color.GREEN
            else -> throw Exception("Dirty color")
        }

fun main(args: Array<String>) {
//    println(Color.BLUE.rgb())
//    println(getMnenmonic(Color.RED))
//    println(getWramth(Color.RED))
    println(getMnenmonic(mix(Color.RED,Color.YELLOW)))
}