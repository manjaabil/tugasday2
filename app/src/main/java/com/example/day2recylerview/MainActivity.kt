package com.example.day2recylerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.day2recylerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var userList : ArrayList<User>
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        setRV()
    }
    private fun setRV(){
        recyclerView = findViewById(R.id.rv_list_user)
        recyclerView.layoutManager = LinearLayoutManager(this)

        userList = ArrayList()
        userList.add(User(R.drawable.manja, "Manja", "manja@gmail.com", "Sistem Komputer", "8"))
        userList.add(User(R.drawable.abil, "Abil", "abil@gmail.com", "Sistem Informasi", "6"))
        userList.add(User(R.drawable.fafa, "Fafa", "fafa@gmail.com", "Teknik Elektro", "8"))
        userList.add(User(R.drawable.irawan, "Irawan", "irawan@gmail.com","Psikologi","4"))
        userList.add(User(R.drawable.rizki, "Rizki", "rizki@gmail.com", "Teknik Mesin","2"))

        userList.add(User(R.drawable.manja, "Manja", "manja@gmail.com", "Sistem Komputer", "8"))
        userList.add(User(R.drawable.abil, "Abil", "abil@gmail.com", "Sistem Informasi", "6"))
        userList.add(User(R.drawable.fafa, "Fafa", "fafa@gmail.com", "Teknik Elektro", "8"))
        userList.add(User(R.drawable.irawan, "Irawan", "irawan@gmail.com","Psikologi","4"))
        userList.add(User(R.drawable.rizki, "Rizki", "rizki@gmail.com", "Teknik Mesin","2"))

        userAdapter = UserAdapter(userList)
        recyclerView.adapter = userAdapter

        userAdapter.senddata = {
            val intent = Intent(this, DetailedUser::class.java)
            intent.putExtra("user", it)
            startActivity(intent)
        }
    }
}