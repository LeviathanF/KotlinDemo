package demo7.c7_5

import java.beans.PropertyEditorManager
import java.lang.reflect.Type
import kotlin.properties.Delegates
import kotlin.reflect.KParameter
import kotlin.reflect.KProperty

/**
 * 委托属性的基本操作
 */
class Foo {
    var p :String by Delegate()
}

class Delegate{
    operator fun getValue(thisRef: Any?,prop:KProperty<*>):String{
        return "$thisRef,这里委托了 ${prop.name} 属性"
    }

    operator fun setValue(thisRef: Any?,prop: KProperty<*>,value:String){
       println("$thisRef 的 ${prop.name} 的属性被赋值为 $value")
    }
}

fun main(args: Array<String>) {
    var t = Foo()
    t.p = "a"
//    println(t.p)
//
//    t.p = "b"
//    println(t.p)
}