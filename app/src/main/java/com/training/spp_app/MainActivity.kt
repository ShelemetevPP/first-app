package com.training.spp_app

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.contentValuesOf
import androidx.core.util.rangeTo

private const val TAG = "MY_LOG"
private const val VALUE = "Value"

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "На языке, тебе невнятном")
        Log . d (TAG, "Стихи прощальные пишу")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Но в заблуждении приятном")
        Log.d(TAG, "Вниманья твоего прошу:")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Мой друг, доколе не увяну,")
        Log.d(TAG, "В разлуке чувство погубя,")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Боготворить не перестану")
        Log.d(TAG, "Тебя, мой друг, одну тебя.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "На чуждые черты взирая,")
        Log.d(TAG, "Верь только сердцу моему,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Как прежде верила ему,")
        Log.d(TAG, "Его страстей не понимая.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }
}



