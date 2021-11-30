package tw.tcnr88.m0501

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class M0501 : AppCompatActivity() ,View.OnClickListener{
    private lateinit var s001: Spinner
    private lateinit  var e001: EditText
    private lateinit  var b001: Button
    private lateinit var ans01: TextView
    private lateinit var sSex: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0501)
        setupViewComponent()
    }

    private fun setupViewComponent() {
        s001 = findViewById<View>(R.id.m0501_s001) as Spinner
        e001 = findViewById<View>(R.id.m0501_e001) as EditText
        b001 = findViewById<View>(R.id.m0501_b001) as Button
        ans01 = findViewById<View>(R.id.m0501_f000) as TextView

        // 設定 spinner item 選項------------
        val adapSexList = ArrayAdapter
            .createFromResource(
                this, R.array.m0501_a001,
                android.R.layout.simple_spinner_item
            )
        adapSexList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        s001.adapter = adapSexList
        // 準備 Listener a001Lis 需再設定 Listener
        s001.onItemSelectedListener = spnSexItemSelLis
        // 準備 Listener btnb001 需再設定 Listener
        b001.setOnClickListener(this)
    }
    private val spnSexItemSelLis: AdapterView.OnItemSelectedListener =
        object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                sSex = parent.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    // =======================================================================
    override fun onClick(v: View?) {
        var strSug = getString(R.string.m0501_f000)
        // 檢查 年齡是否有輸入
        if (e001.text.toString().trim() { it <= ' ' }.length != 0) {
            val iAge = e001.text.toString().toInt()
            strSug += if (sSex == getString(R.string.chk01)) if (iAge < 28) getString(R.string.m0501_f001) else if (iAge > 33) getString(
                R.string.m0501_f003
            ) else {
                getString(R.string.m0501_f002)
            } else if (iAge < 25) getString(R.string.m0501_f001) else if (iAge > 30) getString(R.string.m0501_f003) else {
                getString(R.string.m0501_f002)
            }
            ans01.text = strSug
            //-------------------------------------------------------
        } else {
            strSug = getString(R.string.nospace) //else { //年齡輸入空白
        }
        ans01.text = strSug //請勿輸入空白
    }
    // =========================================================================

}