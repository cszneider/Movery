package br.feevale.movery.utils;

import android.util.Patterns;
import android.widget.TextView;

/**
 * Created by dagneserodrigo on 6/15/17.
 */

public class Validate {

    public static boolean email(TextView widget) {
        String email = widget.getText().toString();
        boolean emailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches();
        return !empty(widget) && emailValid;
    }

    public static boolean password(TextView widget) {
        return !empty(widget);
    }

    private static boolean empty(TextView widget) {
        return widget.getText().toString().isEmpty();
    }
}
