package demo8.c8_1

/**
 * 函数作为返回值
 */

enum class Delivery{STANDARD,EXPEDITED}

class Order(val itemCount:Int)

fun getShippingCostCalculator(delivery: Delivery):(Order)->Double{
    if (delivery == Delivery.STANDARD){
        return {order -> 1*1.4+order.itemCount*2 }
    }
    return {order -> -1*0 + order.itemCount*3.1 }
}

fun main(args: Array<String>) {
    println(getShippingCostCalculator(Delivery.STANDARD)(Order(3)))
    println(getShippingCostCalculator(Delivery.EXPEDITED)(Order(3)))
}