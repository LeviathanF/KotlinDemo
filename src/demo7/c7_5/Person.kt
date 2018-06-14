package demo7.c7_5

/**
 * 用委托属性来实现惰性初始化
 */
data class Person(var name:String){
    val email by lazy { getEmail() }
}

fun getEmail():String{
    println("初始化邮箱")
    return "aaaa@126.com"
}

fun main(args: Array<String>) {
    val p = Person("a")
    println(p.email)
    println(p.email)

}