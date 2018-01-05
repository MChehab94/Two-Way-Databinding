package mchehab.com.twowaydatabinding;

import android.databinding.InverseMethod;

/**
 * Created by muhammadchehab on 1/5/18.
 */

public class Converter {

    @InverseMethod("toInt")
    public static String toString(int value) {
        return "" + value;
    }

    public static int toInt(String value) {
        return Integer.parseInt(value);
    }
}