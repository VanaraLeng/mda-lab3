package com.vanaraleng.lab3

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRow("Version", "Code Name")
        addRow("Android 9.0", "Pie")
        addRow("Android 8.0", "Oreo")
    }

    fun addButtonClick(view: View) {
        val version = editTextVersion.text.toString()
        val codeName = editTextCodeName.text.toString()
        addRow(version, codeName)
    }

    private fun addRow(version: String, codeName: String) {
        val tableRow = TableRow(applicationContext)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
        tableRow.layoutParams = layoutParams

        val param = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.MATCH_PARENT,
            1.0f
        )

        val col1 = TextView(applicationContext)
        col1.layoutParams = param
        col1.layout
        col1.text = version
        tableRow.addView(col1, 0)

        val col2 = TextView(applicationContext)
        col2.layoutParams = param
        col2.text = codeName
        tableRow.addView(col2, 1)

        tableLayout.addView(tableRow)
    }
}