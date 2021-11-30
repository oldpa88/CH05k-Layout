package tw.tcnr88.m0500f

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.text.DecimalFormat

class M0500 : AppCompatActivity() ,View.OnClickListener {
    private lateinit var t003: TextView;
    private lateinit var e001: EditText;
    private lateinit var b001: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0500)
        setupViewcomponent()
    }

    private fun setupViewcomponent() {
        e001 = findViewById(R.id.m0500_e001) as EditText
        b001 = findViewById<View>(R.id.m0500_b001) as Button
        t003 = findViewById<View>(R.id.m0500_t003) as TextView

        b001.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val pondsFormat = DecimalFormat("0.00000")
        val ans = pondsFormat.format(
            e001.text.toString().toFloat() * 27.25
        )
        t003.text = ans
    }

}