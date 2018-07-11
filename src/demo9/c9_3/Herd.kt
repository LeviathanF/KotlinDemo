package demo9.c9_3

import java.util.function.Function
const val NAME = "aaaa"
open class Animal(open val name: String){
    open fun feed(){
        println("${name} had feed")
    }
}

class Herd<Animal>(val animals:Array<Animal>){
    val size:Int get() = animals.size
    operator fun get(i:Int):Animal{
        return animals[i]
    }
}

fun feedAll(animals: Herd<Animal>){
    for (i in 0 until animals.size){
        animals[i].feed()
    }
}

class Cat(override val name: String):Animal(name){
//    override fun feed() {
//        println("cat ${name} had feed")
//    }
}

fun takeCareOfCats(cats:Herd<Cat>){
    for (i in 0 until cats.size){
        cats[i].feed()
    }
}

fun <T:Animal> show(list:List<T>){}
fun <T:Animal> show(list:Array<T>){}

fun main(args: Array<String>) {
    val animals = listOf(Animal("a"),Animal("b"),Animal("c"))
//    val herd = Herd(animals)
//    feedAll(herd)
    val cats = arrayOf(Cat("a"),Cat("b"),Cat("c"))
    show(cats)
    val herd = Herd(cats)
    takeCareOfCats(herd)
}