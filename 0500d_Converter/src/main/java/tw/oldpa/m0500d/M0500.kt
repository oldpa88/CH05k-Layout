package tw.oldpa.m0500d

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
    private var t003: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0500)
        setupViewcomponent()
    }

    private fun setupViewcomponent() {
        e001 = findViewById<View>(R.id.m0500_e001) as EditText //公斤kg 輸入的欄位變數名稱
        b001 = findViewById<View>(R.id.m0500_b001) as Button //執行按鈕變數名稱
        t003 = findViewById<View>(R.id.m0500_t003) as TextView //磅lb 欄位變數名稱
        // --宣告傾聽--
        b001!!.setOnClickListener(b001ON)
    }

    private val b001ON = View.OnClickListener {
        val pondsFormat = DecimalFormat(".#####")
        val outcome = pondsFormat.format(e001?.text.toString().toFloat() * 2.20462262)
        t003!!.text = outcome
    }
}
