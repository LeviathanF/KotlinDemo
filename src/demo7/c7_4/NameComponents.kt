package demo7.c7_4

/**
 * 7.14 使用解构声明来返由多个值
 */
data class NameComponents(val name:String,val extension:String)

fun splitFileName(fileName:String):NameComponents{
//    原始版本
//    val result = fileName.split(".",limit = 2)
//    return NameComponents(result[0],result[1])

//    使用解构声明返回
    val (name,extension) = fileName.split(".",limit = 2)
    return NameComponents(name,extension)
}

fun main(args: Array<String>) {
    val t = "a.txt"
    println(splitFileName(t))
}