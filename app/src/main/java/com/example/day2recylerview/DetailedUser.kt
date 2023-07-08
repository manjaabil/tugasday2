package com.example.day2recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_user)

        val user = intent.getParcelableExtra<User>("user")
        if (user != null){
            val imageView : ImageView = findViewById(R.id.image_view_detailed)
            val name : TextView = findViewById(R.id.textview_detailed_name)
            val surel : TextView = findViewById(R.id.textview_detailed_email)
            val jurusan : TextView = findViewById(R.id.textview_detailed_jurusan)
            val semester : TextView = findViewById(R.id.textview_detailed_semester)

            imageView.setImageResource(user.image)
            name.text= user.name
            surel.text= user.surel
            jurusan.text= user.jurusan
            semester.text = "Semester " + user.semester
        }
    }
}