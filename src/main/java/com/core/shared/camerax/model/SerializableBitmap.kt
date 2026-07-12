package com.core.shared.camerax.model

import android.graphics.Bitmap
import java.io.Serializable


data class SerializableBitmap(@Transient val bitmap: Bitmap) : Serializable