package syriam.com.fututrehelper.networkListener

/**************************************************************************************************
 * Copyright 2017 Syriam Technologies International, Ltd.                                         *
 **************************************************************************************************/
import android.content.Context
import android.net.NetworkInfo
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager


/**
 * @author Gold Yon War
 * @version 1.0
 * @since 6/29/2018
 */
fun isOnline(context: Context): Boolean {
    val netInfo = (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo
    return netInfo != null && netInfo.isConnectedOrConnecting
}