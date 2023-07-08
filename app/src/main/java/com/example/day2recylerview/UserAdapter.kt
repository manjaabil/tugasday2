package com.example.day2recylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val userList: ArrayList<User>)
    : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    var senddata : ((User) -> Unit)? = null

    class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val imageView : ImageView = itemView.findViewById(R.id.imageview_item_user_name)
        val name : TextView = itemView.findViewById(R.id.textview_item_user_name)
        val surel : TextView = itemView.findViewById(R.id.textview_item_user_email)
        val jurusan : TextView = itemView.findViewById(R.id.textview_item_user_jurusan)
        val semester : TextView = itemView.findViewById(R.id.textview_item_user_semester)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.imageView.setImageResource(user.image)
        holder.name.text= user.name
        holder.surel.text= user.surel
        holder.jurusan.text= user.jurusan
        holder.semester.text = "Semester " + user.semester

        holder.itemView.setOnClickListener {
            senddata?.invoke(user)
        }
    }
}