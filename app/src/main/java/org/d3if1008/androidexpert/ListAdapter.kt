package org.d3if1008.androidexpert

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class ListAdapter(private val userArrayList: ArrayList<User>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    var context: Context? = null
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_user, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val user = userArrayList[position]
        viewHolder.itemView.setOnClickListener {
            val intent = Intent(context, Detail::class.java)
            intent.putExtra("DATA_USER", user)
            context!!.startActivity(intent)
        }

        viewHolder.img_user.setImageResource(user.avatar)
        viewHolder.tv_name.setText(user.name)
        viewHolder.tv_company.setText(user.company)
    }

    override fun getItemCount(): Int {
        return userArrayList.size
    }

    inner class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        var img_user: ImageView
        var tv_name: TextView
        var tv_company: TextView

        init {
            context = view.context
            img_user = view.findViewById(R.id.img_user)
            tv_name = view.findViewById(R.id.tv_name)
            tv_company = view.findViewById(R.id.tv_company)
        }
    }
}