package demo8.c8_2

import java.util.concurrent.locks.Lock

/**
 * 内联函数测试Demo
 */

inline fun <T> synchronized(lock: Lock,action:()->T):T{
    lock.lock()
    try {
        return action()
    }finally {
        return action()
    }
}

fun main(args: Array<String>) {

}