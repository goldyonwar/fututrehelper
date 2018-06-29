package syriam.com.fututrehelper.copyfromasset
/**************************************************************************************************
 * Copyright 2017 Syriam Technologies International, Ltd.                                         *
 **************************************************************************************************/
import android.content.res.AssetManager
import android.os.Environment
import java.io.File
import java.io.FileOutputStream

/**
 * @author Gold Yon War
 * @version 1.0
 * @since 6/11/2018
 */
fun copyFromAssets(assetManager: AssetManager, mSourceFolderName: String, mOutputFolderName: String) {
    val assetFiles = assetManager.list(mSourceFolderName)
    assetFiles.forEach {
        val inputStream = assetManager.open(mSourceFolderName + File.separator + it)
        val Folder = File(Environment.getExternalStorageDirectory().absolutePath + File.separator + mOutputFolderName)
        if (!Folder.exists()) {
            Folder.mkdir()
        }
        val outputStream = FileOutputStream(File(Environment.getExternalStorageDirectory().absolutePath + File.separator + mOutputFolderName + File.separator, it))

        try {
            inputStream.copyTo(outputStream, DEFAULT_BUFFER_SIZE)
        } finally {
            inputStream.close()
            outputStream.flush()
            outputStream.close()
        }
    }
}