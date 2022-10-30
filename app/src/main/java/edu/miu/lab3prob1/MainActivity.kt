package edu.miu.lab3prob1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureAddBtn()
    }

    private fun configureAddBtn() {
        button.setOnClickListener {
            val androidVersion = androidVersionEdt.text.toString()
            val androidCode = androidCodeEdt.text.toString()
            if (!androidVersion.isNullOrEmpty() && !androidCode.isNullOrEmpty()) {
                val textView1 = TextView(applicationContext).apply {
                    text = androidVersion
                }

                val textView2 = TextView(applicationContext).apply {
                    text = androidCode
                }

                val tableRow = TableRow(applicationContext).apply {
                    layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                    addView(textView1,0)
                    addView(textView2,1)
                    setBackgroundColor(Color.GREEN)
                    setPadding(15)
                }

                tableLayout.addView(tableRow)
            } else {
                Toast.makeText(applicationContext, "Please input valid value", Toast.LENGTH_LONG).show()
            }
        }
    }
}