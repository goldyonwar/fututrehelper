package syriam.com.fututrehelper.getColor

/**************************************************************************************************
 * Copyright 2017 Syriam Technologies International, Ltd.                                         *
 **************************************************************************************************/
import android.content.Context
import android.support.v4.content.ContextCompat
import android.os.Build
import syriam.com.fututrehelper.BaseActivity


/**
 * @author Gold Yon War
 * @version 1.0
 * @since 6/29/2018
 */
fun mGetColor(context: Context, id: Int): Int {
    return ContextCompat.getColor(context, id)
}