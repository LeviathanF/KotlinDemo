package demo7.c7_5

import java.beans.PropertyChangeListener
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * 属性委托监听
 */
class PersonC(var name:String,age:Int,salary:Int):PropertyChangeAware(){
//    原始版本
//    var age:Int = age
//    set(newValue) {
//        val oldValue = field
//        field = newValue
//        changeSupport.firePropertyChange("age",oldValue,newValue)
//    }
//
//    var salary:Int = salary
//    set(newValue) {
//        val oldValue = field
//        field = newValue
//        changeSupport.firePropertyChange("salary",oldValue,newValue)
//    }

//    外部委托版本
//    var age:Int by ObservableProperty(age,changeSupport)
//    var salary:Int by ObservableProperty(salary,changeSupport)

//    内部创建委托版本
    private val observer = {
        prop:KProperty<*>,oldValue:Int,newValue:Int ->
        changeSupport.firePropertyChange(prop.name,oldValue,newValue)
    }
    var age:Int by Delegates.observable(age,observer)
    var salary:Int by Delegates.observable(salary,observer)
}

fun main(args: Array<String>) {
    val p = PersonC("a",18,100)
    p.addPropertChangeListener(PropertyChangeListener {
        evt ->  println("${evt.propertyName} from ${evt.oldValue} to ${evt.newValue}")
    })
    p.age = 19
    p.salary = 200

}