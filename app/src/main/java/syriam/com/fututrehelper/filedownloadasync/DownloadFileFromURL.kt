package syriam.com.fututrehelper.filedownloadasync

import android.app.ProgressDialog
import android.graphics.drawable.Drawable
import android.os.AsyncTask
import android.os.Environment
import android.util.Log
import android.widget.ProgressBar

import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.net.URL
import java.net.URLConnection

/**
 * @author Gold Yon War
 * @version 1.0
 * @since 18/5/2018
 */
class DownloadFileFromUrl(internal var mProgressDialog: ProgressDialog) : AsyncTask<String, String, String>() {

    /**
     * Before starting background thread
     * Show Progress Bar Dialog
     */
    override fun onPreExecute() {
        super.onPreExecute()
        //  showDialog(progress_bar_type);
        //  mProgressDialog.show();
    }

    /**
     * Downloading file in background thread
     */
    override fun doInBackground(vararg f_url: String): String? {
        var count: Int
        try {
            val url = URL(f_url[0])
            val conection = url.openConnection()
            conection.connect()
            // getting file length
            val lenghtOfFile = conection.contentLength

            // input stream to read file - with 8k buffer
            val input = BufferedInputStream(url.openStream(), 8192)

            // Output stream to write file
            val output = FileOutputStream("/sdcard/downloadedfile.jpg")

            val data = ByteArray(1024)

            var total: Long = 0
            do {
                count = input.read(data)
                if (count == -1) {
                    break
                }
                total += count.toLong()
                // publishing the progress....
                // After this onProgressUpdate will be called
                publishProgress("" + (total * 100 / lenghtOfFile).toInt())

                // writing data to file
                output.write(data, 0, count)
            } while (count != -1)



            // flushing output
            output.flush()

            // closing streams
            output.close()
            input.close()

        } catch (e: Exception) {
            Log.e("Error: ", e.message)
        }

        return null
    }

    /**
     * Updating progress bar
     */
    override fun onProgressUpdate(vararg progress: String) {
        // setting progress percentage
        //  pDialog.setProgress(Integer.parseInt(progress[0]));
    }

    /**
     * After completing background task
     * Dismiss the progress dialog
     */
    override fun onPostExecute(file_url: String) {
        // dismiss the dialog after the file was downloaded
        // dismissDialog(progress_bar_type);

        // Displaying downloaded image into image view
        // Reading image path from sdcard
        val imagePath = Environment.getExternalStorageDirectory().toString() + "/downloadedfile.jpg"
        // setting downloaded into image view
        // my_image.setImageDrawable(Drawable.createFromPath(imagePath));
    }

}