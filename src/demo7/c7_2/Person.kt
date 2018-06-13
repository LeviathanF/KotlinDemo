package demo7.c7_2

data class Person(var firstName:String,var lastName:String):Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this,other,
                Person::firstName,Person::lastName)
    }

    /**
     * 重写下标符
     */
    operator fun get(position:Int):String{
        return when(position){
            0 -> firstName
            1 -> lastName
            else -> throw IndexOutOfBoundsException("Invalid coordinate $position")
        }
    }

    /**
     * 重写下标符
     */
    operator fun set(index:Int,value:String){
        when (index){
            0 -> firstName = value
            1 -> lastName = value
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }
}

fun main(args: Array<String>) {
    var p1 = Person("a","a")
    var p2 = Person("b","b")
    println(p1<p2)

    println(p1[0])

    p1[0] = "c"

    println(p1)
}