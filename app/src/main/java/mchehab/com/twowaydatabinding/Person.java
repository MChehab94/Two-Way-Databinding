package mchehab.com.twowaydatabinding;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

/**
 * Created by muhammadchehab on 1/5/18.
 */

public class Person implements Observable{

    private PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        firstName = lastName = "";
        age = 0;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        propertyChangeRegistry.notifyChange(this, BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        propertyChangeRegistry.notifyChange(this, BR.lastName);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        propertyChangeRegistry.notifyChange(this, BR.age);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        propertyChangeRegistry.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        propertyChangeRegistry.remove(callback);
    }
}