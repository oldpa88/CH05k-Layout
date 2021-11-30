package tw.oldpa.m0503

import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import tw.oldpa.m0503.R

class M0503 : AppCompatActivity() {
    // ---------宣告變數------------
    private var chb01: CheckBox? = null
    private var chb02: CheckBox? = null
    private var chb03: CheckBox? = null
    private var chb04: CheckBox? = null
    private var btn01: Button? = null
    private var txt01: TextView? = null

    // ------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0503)
        setupViewcomponent()
    }

    //
    private fun setupViewcomponent() {
        chb01 = findViewById<View>(R.id.m0503_chb01) as CheckBox
        chb02 = findViewById<View>(R.id.m0503_chb02) as CheckBox
        chb03 = findViewById<View>(R.id.m0503_chb03) as CheckBox
        chb04 = findViewById<View>(R.id.m0503_chb04) as CheckBox
        btn01 = findViewById<View>(R.id.m0503_btn01) as Button
        txt01 = findViewById<View>(R.id.m0503_txt001) as TextView
        // 設定 button 按鍵的事件
        btn01!!.setOnClickListener(btn01OnClick)
    }

    private val btn01OnClick = View.OnClickListener {
        var ans01 = getString(R.string.m0503_txt01)
        if (chb01!!.isChecked) ans01 += chb01!!.text.toString() + " "
        if (chb02!!.isChecked) ans01 += chb02!!.text.toString() + " "
        if (chb03!!.isChecked) ans01 += chb03!!.text.toString() + " "
        if (chb04!!.isChecked) ans01 += chb04!!.text.toString() + " "
        txt01!!.text = ans01
    }
}