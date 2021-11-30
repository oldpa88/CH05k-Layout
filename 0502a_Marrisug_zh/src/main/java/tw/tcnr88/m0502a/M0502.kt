package tw.tcnr88.m0502a

import androidx.appcompat.app.AppCompatActivity
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import tw.tcnr88.m0502a.R

class M0502 : AppCompatActivity() {
    //宣告變數
    private var b001: Button? = null
    private var rb01: RadioGroup? = null
    private var rb02: RadioGroup? = null
    private var rb021: RadioButton? = null
    private var rb022: RadioButton? = null
    private var rb023: RadioButton? = null
    private var ans01: TextView? = null
    private var strSug: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0502)
        setupViewComponent()
    }

    private fun setupViewComponent() {
//        //取得R.java 配置碼
        b001 = findViewById<View>(R.id.m0502_b001) as Button
        ans01 = findViewById<View>(R.id.m0502_f000) as TextView //建議
        //
        rb01 = findViewById<View>(R.id.m0502_r001) as RadioGroup //性別
        rb02 = findViewById<View>(R.id.m0502_r002) as RadioGroup //年齡
        rb021 = findViewById<View>(R.id.m0502_r002a) as RadioButton
        rb022 = findViewById<View>(R.id.m0502_r002b) as RadioButton
        rb023 = findViewById<View>(R.id.m0502_r002c) as RadioButton
        //
//        //設監聽
        rb01!!.setOnCheckedChangeListener(ra01on)
        b001!!.setOnClickListener(b001on)
    }

    // =========================================================================
    private val ra01on = RadioGroup.OnCheckedChangeListener { group, checkedId ->
        when (checkedId) {
            R.id.m0502_r001a -> {
                rb021!!.setText(R.string.m0502_r002aa)
                rb022!!.setText(R.string.m0502_r002ab)
                rb023!!.setText(R.string.m0502_r002ac)
            }
            R.id.m0502_r001b -> {
                rb021!!.setText(R.string.m0502_r002ba)
                rb022!!.setText(R.string.m0502_r002bb)
                rb023!!.setText(R.string.m0502_r002bc)
            }
        }
    }

    // =========================================================================
    private val b001on = View.OnClickListener {
        strSug = getString(R.string.m0502_f000) //建議您
        val iCheckedRadBtn = rb01!!.checkedRadioButtonId
        when (iCheckedRadBtn) {
            R.id.m0502_r001a -> strSug += when (rb02!!.checkedRadioButtonId) {
                R.id.m0502_r002a -> getString(R.string.m0502_f001)
                R.id.m0502_r002b -> getString(R.string.m0502_f002)
                else -> getString(R.string.m0502_f003)
            }
            R.id.m0502_r001b -> strSug += when (rb02!!.checkedRadioButtonId) {
                R.id.m0502_r002a -> getString(R.string.m0502_f004)
                R.id.m0502_r002b -> getString(R.string.m0502_f005)
                else -> getString(R.string.m0502_f006)
            }
        }
        //----------------------------------------------------------
        ans01!!.text = strSug
    }
}