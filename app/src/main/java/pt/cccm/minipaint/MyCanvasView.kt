package pt.cccm.minipaint

import android.content.Context
import android.view.View
import androidx.core.content.res.ResourcesCompat

class MyCanvasView (context: Context): View(context) {

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
    }
}