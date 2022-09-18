package com.kelompoktiga.login_screen_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: EditText = findViewById(R.id.editUsername)
        val password: EditText = findViewById(R.id.editPassword)
        val login: Button = findViewById(R.id.btnLogin)

        login.setOnClickListener {
            if (TextUtils.isEmpty(username.text.toString()) and TextUtils.isEmpty(password.text.toString())) {
                Toast.makeText(this, "Empty field is not allowed!", Toast.LENGTH_LONG).show()
            } else if (TextUtils.isEmpty(username.text.toString())) {
                Toast.makeText(this, "Username field cannot be empty!", Toast.LENGTH_LONG).show()
            } else if (TextUtils.isEmpty(password.text.toString())) {
                Toast.makeText(this, "Password field cannot be empty!", Toast.LENGTH_LONG).show()
            } else if (password.text.toString().equals("12345678")) {
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                val passIntent: Intent = Intent(this, HomeActivity::class.java)
            }
        }
    }
}