package tw.oldpa.m0505

import androidx.appcompat.app.AppCompatActivity
import android.widget.AutoCompleteTextView
import android.widget.ArrayAdapter
import android.os.Bundle
import android.view.View
import android.widget.Button
import tw.oldpa.m0505.R

//import android.widget.ListAdapter;
class M0505 : AppCompatActivity() {
    // ==============宣告變數===============
    private var b001: Button? = null
    private var b002: Button? = null
    private var e001: AutoCompleteTextView? = null
    private var adapAutoCompText: ArrayAdapter<String>? = null

    // =============================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0505)
        setupViewComponent()
    }

    private fun setupViewComponent() {
        // 從資源類別R中取得介面元件
        b001 = findViewById<View>(R.id.m0505_b001) as Button
        b002 = findViewById<View>(R.id.m0505_b002) as Button
        e001 = findViewById<View>(R.id.m0505_a001) as AutoCompleteTextView
        adapAutoCompText = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line
        )
        e001!!.setAdapter(adapAutoCompText)
        // --宣告傾聽--
        b001!!.setOnClickListener(b001On) // 加入自動完成文字
        b002!!.setOnClickListener(b001On) // 清除自動完成文字
    }

    // -----加入自動完成文字事件-----------------------------------------------
    private val b001On = View.OnClickListener { v ->
        when (v.id) {
            R.id.m0505_b001 -> {
                val s = e001!!.text.toString()
                adapAutoCompText!!.add(s)
                e001!!.setText("")
            }
            R.id.m0505_b002 -> {
                adapAutoCompText!!.clear()
                e001!!.setText("")
            }
        }
    }
}