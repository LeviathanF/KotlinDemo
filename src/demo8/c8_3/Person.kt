package demo8.c8_3

/**
 * 使用标签返回
 */
class Person(val name:String,val age:Int)

fun lookForAlice(list:Collection<Person>){
    list.forEach lable@{
        if (it.name.equals("Alice")){
            println("find Alice")
            return@lable
        }
        println("not found Alice")
    }
}

fun lookForAlice2(list:Collection<Person>){
    list.forEach{
        if (it.name.equals("Alice")){
            println("find Alice")
            return@forEach
        }
        println("not found Alice")
    }
}

fun main(args: Array<String>) {
    val list = listOf(Person("Alice",15))
    lookForAlice(list)
    lookForAlice2(list)
}