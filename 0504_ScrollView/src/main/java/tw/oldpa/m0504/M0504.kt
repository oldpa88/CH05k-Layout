package tw.oldpa.m0504

import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import tw.oldpa.m0504.R

class M0504 : AppCompatActivity() {
    // ---------宣告變數------------
    private var chb01: CheckBox? = null
    private var chb02: CheckBox? = null
    private var chb03: CheckBox? = null
    private var chb04: CheckBox? = null
    private var chb05: CheckBox? = null
    private var chb06: CheckBox? = null
    private var chb07: CheckBox? = null
    private var chb08: CheckBox? = null
    private var chb09: CheckBox? = null
    private var chb10: CheckBox? = null
    private var chb11: CheckBox? = null
    private var chb12: CheckBox? = null
    private var chb13: CheckBox? = null
    private var chb14: CheckBox? = null
    private var chb15: CheckBox? = null
    private var chb16: CheckBox? = null
    private var chb17: CheckBox? = null
    private var chb18: CheckBox? = null
    private var chb19: CheckBox? = null
    private var chb20: CheckBox? = null
    private var btn01: Button? = null
    private var txt01: TextView? = null

    // ------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0504)
        setupViewcomponent()
    }

    private fun setupViewcomponent() {
        btn01 = findViewById<View>(R.id.m0504_btn01) as Button
        txt01 = findViewById<View>(R.id.m0504_txt001) as TextView
        chb01 = findViewById<View>(R.id.m0504_chb01) as CheckBox
        chb02 = findViewById<View>(R.id.m0504_chb02) as CheckBox
        chb03 = findViewById<View>(R.id.m0504_chb03) as CheckBox
        chb04 = findViewById<View>(R.id.m0504_chb04) as CheckBox
        chb05 = findViewById<View>(R.id.m0504_chb05) as CheckBox
        chb06 = findViewById<View>(R.id.m0504_chb06) as CheckBox
        chb07 = findViewById<View>(R.id.m0504_chb07) as CheckBox
        chb08 = findViewById<View>(R.id.m0504_chb08) as CheckBox
        chb09 = findViewById<View>(R.id.m0504_chb09) as CheckBox
        chb10 = findViewById<View>(R.id.m0504_chb10) as CheckBox
        chb11 = findViewById<View>(R.id.m0504_chb11) as CheckBox
        chb12 = findViewById<View>(R.id.m0504_chb12) as CheckBox
        chb13 = findViewById<View>(R.id.m0504_chb13) as CheckBox
        chb14 = findViewById<View>(R.id.m0504_chb14) as CheckBox
        chb15 = findViewById<View>(R.id.m0504_chb15) as CheckBox
        chb16 = findViewById<View>(R.id.m0504_chb16) as CheckBox
        chb17 = findViewById<View>(R.id.m0504_chb17) as CheckBox
        chb18 = findViewById<View>(R.id.m0504_chb18) as CheckBox
        chb19 = findViewById<View>(R.id.m0504_chb19) as CheckBox
        chb20 = findViewById<View>(R.id.m0504_chb20) as CheckBox
        // 設定 button 按鍵的事件
        btn01!!.setOnClickListener(btn01OnClick)
    }

    private val btn01OnClick = View.OnClickListener {
        var ans01 = getString(R.string.m0504_txt01)
        if (chb01!!.isChecked) ans01 += chb01!!.text.toString() + " "
        if (chb02!!.isChecked) ans01 += chb02!!.text.toString() + " "
        if (chb03!!.isChecked) ans01 += chb03!!.text.toString() + " "
        if (chb04!!.isChecked) ans01 += chb04!!.text.toString() + " "
        if (chb05!!.isChecked) ans01 += chb05!!.text.toString() + " "
        if (chb06!!.isChecked) ans01 += chb06!!.text.toString() + " "
        if (chb07!!.isChecked) ans01 += chb07!!.text.toString() + " "
        if (chb08!!.isChecked) ans01 += chb08!!.text.toString() + " "
        if (chb09!!.isChecked) ans01 += chb09!!.text.toString() + " "
        if (chb10!!.isChecked) ans01 += chb10!!.text.toString() + " "
        if (chb11!!.isChecked) ans01 += chb11!!.text.toString() + " "
        if (chb12!!.isChecked) ans01 += chb12!!.text.toString() + " "
        if (chb13!!.isChecked) ans01 += chb13!!.text.toString() + " "
        if (chb14!!.isChecked) ans01 += chb14!!.text.toString() + " "
        if (chb15!!.isChecked) ans01 += chb15!!.text.toString() + " "
        if (chb16!!.isChecked) ans01 += chb16!!.text.toString() + " "
        if (chb17!!.isChecked) ans01 += chb17!!.text.toString() + " "
        if (chb18!!.isChecked) ans01 += chb18!!.text.toString() + " "
        if (chb19!!.isChecked) ans01 += chb19!!.text.toString() + " "
        if (chb20!!.isChecked) ans01 += chb20!!.text.toString() + " "
        txt01!!.text = ans01
    }
}