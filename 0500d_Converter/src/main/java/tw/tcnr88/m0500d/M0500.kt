package tw.tcnr88.m0500d

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.text.DecimalFormat

class M0500 : AppCompatActivity() {
    private var e001: EditText? = null
    private var b001: Button? = null
    private var t003: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0500)
        setupViewcomponent()
    }

    private fun setupViewcomponent() { //
        e001 = findViewById<View>(R.id.m0500_e001) as EditText
        b001 = findViewById<View>(R.id.m0500_b001) as Button
        t003 = findViewById<View>(R.id.m0500_t003) as TextView
        b001!!.setOnClickListener(b001On)
    }

    private val b001On = View.OnClickListener()
    {
        val pondsFormat = DecimalFormat("0.00000")
//        val ans = pondsFormat.format(e001.getText().toString().toFloat() * 2.20462262
//        )
        var ans = pondsFormat.format(e001!!.text.toString().toFloat() * 2.20462262)
        t003!!.text = ans
    }
}