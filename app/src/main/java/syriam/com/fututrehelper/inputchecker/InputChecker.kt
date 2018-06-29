package syriam.com.fututrehelper.inputchecker

import android.util.Patterns

/**************************************************************************************************
 * Copyright 2017 Syriam Technologies International, Ltd.                                         *
 **************************************************************************************************/
/**
 * @author Gold Yon War
 * @version 1.0
 * @since 6/29/2018
 */

fun isValidEmail(email: CharSequence): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(email).matches()
}

fun isValidPhone(phone: CharSequence): Boolean {
    return Patterns.PHONE.matcher(phone).matches()
}