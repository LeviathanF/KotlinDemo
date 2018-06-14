package demo7.c7_5

/**
 * 委托map
 */
class DelegateMap(){
    private val map = hashMapOf<String,String>()

    fun setAttribute(key:String,value:String){
        map[key] = value
    }

    fun getAttribute(key:String):String?{
        return map.get(key)
    }
}

fun main(args: Array<String>) {
    val map = DelegateMap()
    map.setAttribute("a","a")
    println(map.getAttribute("a"))
}