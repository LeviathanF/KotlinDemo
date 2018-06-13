package demo

fun main(args: Array<String>) {
//    println("hello world")
    for (i in args.indices){
        println("Argument $i is : ${args[i]}")
    }
}