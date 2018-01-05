package mchehab.com.kotlinapp

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import mchehab.com.kotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val person = Person()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.person = person
        binding.mainActivity = this
        binding.converter = Converter()
    }

    fun onButtonClick(view: View) {
        person.firstName = "first name"
        person.lastName = "last name"
        person.age = 23
    }
}
