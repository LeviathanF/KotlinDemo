package demo2.c2_3

interface Expr
class Num(val value:Int):Expr
class Sum(val leftExpr:Expr,val rightExpr:Expr):Expr

fun eval(e:Expr):Int{
    if (e is Num){
        return e.value
    }
    if (e is Sum) {
        return eval(e.leftExpr)+ eval(e.rightExpr)
    }
    throw IllegalAccessException(" e is not extend Expr")
}

fun main(args: Array<String>) {
    println(eval(Sum(Num(1),Sum(Num(1),Num(1)))))
}