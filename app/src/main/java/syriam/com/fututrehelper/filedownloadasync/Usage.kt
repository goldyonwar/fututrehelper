package syriam.com.fututrehelper.filedownloadasync

import android.app.ProgressDialog
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
        val mProgressDialog = ProgressDialog(this@Usage)
        val downloadFileFromURL = DownloadFileFromUrl(mProgressDialog)
        downloadFileFromURL.execute("https://raw.githubusercontent.com/goldyonwar/api/master/api/Movie/a/1.png")
    }
}
