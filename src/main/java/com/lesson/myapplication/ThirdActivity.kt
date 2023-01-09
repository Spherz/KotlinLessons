package com.lesson.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.lesson.myapplication.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityThirdBinding
    var username : String = "user1"
    var password : String = "user1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityThirdBinding.inflate(layoutInflater)
        val view = bindingClass.root
        setContentView(view)

        bindingClass.btnFirst.setOnClickListener {
            // Работает как setText()
            bindingClass.txtOutput.text = "Нажата первая кнопка!"
        }
        // Работает как getText()

        bindingClass.btnSecond.setOnClickListener {
            bindingClass.txtOutput.text = "Нажата вторая кнопка!"
        }

        bindingClass.btnThird.setOnClickListener {
            bindingClass.txtOutput.text = "Нажата третья кнопка!"
        }
    }
}