package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val button = findViewById<Button>(R.id.button)


        radioGroup.setOnCheckedChangeListener{ group, checkedId ->
                   val radio:RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext,"On Check : "+ "${radio.text}", Toast.LENGTH_SHORT).show()

            }
        button.setOnClickListener {
            var id:Int = radioGroup.checkedRadioButtonId
            if (id!=-1){
                val radio:RadioButton = findViewById(id)
                Toast.makeText(applicationContext,"Your Favourite Color is :" + "${radio.text}",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Nothing Selected " + "\nPlease Select Any Option",Toast.LENGTH_SHORT).show()
            }
        }



    }

    fun radio_button_click(view:View){
        val radio_group = findViewById<RadioGroup>(R.id.radioGroup)
        var id: Int = radio_group.checkedRadioButtonId
        val radio:RadioButton = findViewById(radio_group.checkedRadioButtonId)
        Toast.makeText(applicationContext,"You Clicked : ${radio.text}",Toast.LENGTH_SHORT).show()
    }
}
