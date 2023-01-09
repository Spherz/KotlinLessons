package com.lesson.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lesson.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.txtOutput.text = message
    }

    fun onClickBack(v : View) {
        intent.putExtra("key2", "Текст с SecondActivity")
        setResult(RESULT_OK, intent)
        finish()
    }
}