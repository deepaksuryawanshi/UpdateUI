package com.updateui

import android.os.Handler
import android.widget.TextView

fun TextView.start()= AsyncTaskFirst(this, Handler()).execute()
