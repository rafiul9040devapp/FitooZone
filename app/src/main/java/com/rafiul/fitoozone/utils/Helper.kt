package com.rafiul.fitoozone.utils


import android.os.Handler
import android.os.Looper


private const val HALT_TIME = 2000L
fun Looper.postDelayed(delayMillis: Long = HALT_TIME, action: () -> Unit) {
    Handler(this).postDelayed(action, delayMillis)
}
