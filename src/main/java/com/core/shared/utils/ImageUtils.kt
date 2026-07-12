package com.core.shared.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import java.io.File
import java.io.FileOutputStream
import java.io.IOException


object ImageUtils {

    @Throws(IOException::class)
    fun compressImageFromUri(context: Context, uri: Uri, fileName: String): File {
        val bitmap = getBitmapFromUri(context, uri)
        return compressImage(context, bitmap, fileName)
    }

    @Throws(IOException::class)
    private fun getBitmapFromUri(context: Context, uri: Uri): Bitmap {
        val inputStream = context.contentResolver.openInputStream(uri)
        return BitmapFactory.decodeStream(inputStream)
    }

    @Throws(IOException::class)
    private fun compressImage(context: Context, bitmap: Bitmap, fileName: String): File {
        val file = File(context.cacheDir.path, fileName)
        val fileOutputStream = FileOutputStream(file)
        bitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream)
        fileOutputStream.close()
        return file
    }


}