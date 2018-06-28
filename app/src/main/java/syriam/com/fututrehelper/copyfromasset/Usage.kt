package syriam.com.fututrehelper.copyfromasset

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author Gold Yon War
 * @version 1.0
 * @since 21/5/2018
 */
class Usage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        copyFromAssets(assets,"gpx","gpx")
    }
}
