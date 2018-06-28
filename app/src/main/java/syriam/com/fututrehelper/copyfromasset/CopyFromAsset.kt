package syriam.com.fututrehelper.copyfromasset

import android.content.res.AssetManager
import android.os.Environment
import android.util.Log
import java.io.File
import java.io.FileOutputStream

/**
 * @author Gold Yon War
 * @version 1.0
 * @since 21/5/2018
 */
object CopyFromAsset {

    fun copy(assetManager: AssetManager,mSourceFolderName: String,mOutputFolderName:String) {
          val assetFiles = assetManager.list(mSourceFolderName)
          assetFiles.forEach {
              Log.e("mm", it);
          }
          assetFiles.forEach {
              val inputStream = assetManager.open(mSourceFolderName+File.pathSeparator + it)
              val Folder = File(Environment.getExternalStorageDirectory().absolutePath + "/syriam")
              if (!Folder.exists()) {
                  Folder.mkdir()
              }
              val outputStream = FileOutputStream(File(Environment.getExternalStorageDirectory().absolutePath + "/syriam/", it))

              try {
                  inputStream.copyTo(outputStream, DEFAULT_BUFFER_SIZE)
              } finally {
                  inputStream.close()
                  outputStream.flush()
                  outputStream.close()
              }
          }

      }
}
