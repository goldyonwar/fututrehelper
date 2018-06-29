package syriam.com.fututrehelper

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import syriam.com.fututrehelper.getColor.mGetColor
import syriam.com.fututrehelper.inputchecker.isValidPhone
import kotlin.math.log

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mGetColor(applicationContext,R.color.colorAccent)
    }
}
