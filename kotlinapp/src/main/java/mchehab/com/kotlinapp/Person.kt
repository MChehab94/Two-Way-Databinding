package mchehab.com.kotlinapp

import android.databinding.Bindable
import android.databinding.Observable
import android.databinding.PropertyChangeRegistry

/**
 * Created by muhammadchehab on 1/5/18.
 */
class Person : Observable {

    private val propertyChangeRegistry = PropertyChangeRegistry()

    var firstName: String = ""
        @Bindable get
        set(value) {
            field = value
            propertyChangeRegistry.notifyChange(this, BR.firstName)
        }
    var lastName: String = ""
        @Bindable get
        set(value) {
            field = value
            propertyChangeRegistry.notifyChange(this, BR.lastName)
        }
    var age: Int = 0
        @Bindable get
        set(value) {
            field = value
            propertyChangeRegistry.notifyChange(this, BR.age)
        }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        propertyChangeRegistry.remove(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        propertyChangeRegistry.add(callback)
    }
}