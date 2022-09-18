package com.kelompoktiga.login_screen_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logoutButton: Button = findViewById(R.id.btnLogout)
        val user: TextView = findViewById(R.id.viewUser)
        val intent: Intent = this.intent
        val bundle: Bundle? = intent.extras

        if (bundle != null) {
            user.text = String.format("Welcome, %s", bundle.getString("Username"))
        }
    }
}