package com.example.helloworld

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.main_activity)

        val button = findViewById<Button>(R.id.btn_click)
        button.setOnClickListener{Toast.makeText(this, "Hallo World", Toast.LENGTH_SHORT).show()}

        val rootLayout = findViewById<LinearLayout>(R.id.root_layout)
        val buttonSnack = findViewById<Button>(R.id.btn_click_snack)
        buttonSnack.setOnClickListener{Snackbar.make(rootLayout, "Hallo World", Snackbar.LENGTH_SHORT).show()}
    }
}
