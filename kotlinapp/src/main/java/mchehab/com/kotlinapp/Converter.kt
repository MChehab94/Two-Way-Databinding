package mchehab.com.kotlinapp

import android.databinding.InverseMethod

/**
 * Created by muhammadchehab on 1/5/18.
 */
class Converter{
    @InverseMethod("toInt")
    fun toString(value: Int): String {
        return "" + value
    }

    fun toInt(value: String): Int {
        return Integer.parseInt(value)
    }
}