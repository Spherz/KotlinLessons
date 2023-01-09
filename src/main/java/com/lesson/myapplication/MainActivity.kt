package com.lesson.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lesson.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.tvText.text = message
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode == RESULT_OK && data != null) {
            bindingClass.tvText.text = data.getStringExtra("key2")
        }
    }

    fun onClickOpenNewWindow(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("key", "Какой-то текст")
        startActivityForResult(intent, 100)
    }
}