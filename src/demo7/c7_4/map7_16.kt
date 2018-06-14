package demo7.c7_4

/**
 * 7.16用解构声明来遍历 map
 */
fun printEntries(map:Map<String,String>){
    for ((key,value) in map){
        println("$key:$value")
    }
}

fun main(args: Array<String>) {
    val m = mapOf<String,String>("a" to "a","b" to "b","c" to  "c")
    printEntries(m)
}