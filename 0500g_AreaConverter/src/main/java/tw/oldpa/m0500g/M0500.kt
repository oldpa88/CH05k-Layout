package tw.oldpa.m0500g

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class M0500 : AppCompatActivity() {
    //宣告變數
    private var e001: EditText? = null
    private var b001: Button? = null
    private var t001: TextView? = null
    private var t002: TextView? = null
    private var t003: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0500)
        setupViewcomponent()
    }

    //
    private fun setupViewcomponent() {
        //連接R.java配置檔
        e001 = findViewById<View>(R.id.m0500_e001) as EditText //
        b001 = findViewById<View>(R.id.m0500_b001) as Button //按鈕
        t001 = findViewById<View>(R.id.m0500_t003) as TextView
        t002 = findViewById<View>(R.id.m0500_t006) as TextView
        t003 = findViewById<View>(R.id.m0500_t007) as TextView //
        //宣告傾聽
        b001!!.setOnClickListener(b001ON)
    }

    private val b001ON = View.OnClickListener {
        val poundsFormat = DecimalFormat("0.0000")
        val outcome = poundsFormat.format(e001!!.text.toString().toFloat() * 0.00034)
        t001!!.text = outcome
        val outcome1 = poundsFormat.format(e001!!.text.toString().toFloat() * 3.31)
        t002!!.text = outcome1
        val outcome2 = poundsFormat.format(e001!!.text.toString().toFloat() * 0.0331)
        t003!!.text = outcome2
    }
}