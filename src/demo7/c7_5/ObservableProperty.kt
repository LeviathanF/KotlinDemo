package demo7.c7_5

import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

/**
 * ObservableProperty 作为属性委托
 */
class ObservableProperty(var propValue:Int,val changeSupport:PropertyChangeSupport){
    operator fun getValue(p:PersonC,prop:KProperty<*>):Int = propValue

    operator fun setValue(p: PersonC,prop: KProperty<*>,newValue:Int){
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name,oldValue,newValue)
    }
}