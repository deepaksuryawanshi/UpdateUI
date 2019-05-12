package com.updateui

import android.os.AsyncTask
import android.os.Handler
import android.widget.TextView

class AsyncTaskFirst(var textView: TextView, var handler: Handler) : AsyncTask<Void, Void, String>() {

    var count: Int = 0

    override fun doInBackground(vararg params: Void?): String? {
        updateUI()
        return null
    }

    private fun updateUI() {
        handler.postDelayed({
            textView.text = "" + count++
            updateUI()
        }, 1000)
    }


}