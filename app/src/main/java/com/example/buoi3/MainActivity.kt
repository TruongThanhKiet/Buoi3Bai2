package com.example.buoi3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveButton: Button = findViewById(R.id.saveButton)
        val cancelButton: Button = findViewById(R.id.cancelButton)
        val nameEditText: EditText = findViewById(R.id.nameEditText)

        // Xử lý sự kiện khi nhấn vào nút "Lưu"
        saveButton.setOnClickListener {
            val name = nameEditText.text.toString()
            Toast.makeText(this, "Lưu tên: $name", Toast.LENGTH_SHORT).show()
        }

        // Xử lý sự kiện khi nhấn vào nút "Hủy"
        cancelButton.setOnClickListener {
            Toast.makeText(this, "Đã hủy", Toast.LENGTH_SHORT).show()
        }
    }
}