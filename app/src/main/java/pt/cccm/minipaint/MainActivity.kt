package pt.cccm.minipaint

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.annotation.RequiresApi
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvasView = MyCanvasView(this)
        window?.run{
            WindowCompat.setDecorFitsSystemWindows(this, false)
        }
        myCanvasView.contentDescription= getString(R.string.canvasContentDescription)
        setContentView(myCanvasView)
    }
}