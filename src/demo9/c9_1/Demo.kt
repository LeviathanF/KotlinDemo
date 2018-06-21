package demo9.c9_1

fun <T:Comparable<T>> max(first:T,second:T):T{
    return if (first>second) first else second
}

fun <T> ensureTrailingPeriod(seq:T) where T:CharSequence,T:Appendable{
    if (!seq.endsWith("."))
        seq.append(".")
}

fun main(args: Array<String>) {
    println(max(1,2))
    val t = StringBuilder("hello world")
    ensureTrailingPeriod(t)
    println(t)
}