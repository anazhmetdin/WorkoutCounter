package com.home.workoutcounter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setMinusButton: Button = findViewById(R.id.SetMinus)
        val setPlusButton: Button = findViewById(R.id.SetPlus)
        val sets: EditText = findViewById(R.id.sets)

        fun addEditable(editableObj: EditText, addition: Int) {
            editableObj.setText((editableObj.text.toString().toInt() + addition).toString())
            editableObj.text = editableObj.text
            editableObj.setSelection(editableObj.text.length)
        }

        setMinusButton.setOnClickListener {
            if (sets.text.toString().toInt() > 1) {
                addEditable(sets, -1)
            }
        }
        setPlusButton.setOnClickListener {
            if (sets.text.toString().toInt() < 999) {
                addEditable(sets, 1)
            }
        }
    }
}
