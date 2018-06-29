package syriam.com.fututrehelper.inputchecker

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Usage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isValidEmail("gjk")) {
        }

        if (isValidPhone("+659866")) {

        }
    }
}