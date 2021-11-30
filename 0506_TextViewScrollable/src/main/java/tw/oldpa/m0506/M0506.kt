package tw.oldpa.m0506

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import tw.oldpa.m0506.R
import android.text.method.ScrollingMovementMethod
import android.view.View

class M0506 : AppCompatActivity() {
    private var msg: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0506)
        setupViewComponent()
    }

    private fun setupViewComponent() {
        msg = findViewById<View>(R.id.m0506_msg) as TextView
        msg!!.movementMethod = ScrollingMovementMethod.getInstance()
    }
}