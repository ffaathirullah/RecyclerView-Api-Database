package org.d3if1008.androidexpert

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.String

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val user: User? = intent.getParcelableExtra("DATA_USER")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        getDataUser()
        if (supportActionBar != null && user != null) {
            supportActionBar!!.setTitle(user.username)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }
    }

    private fun getDataUser() {
        val user: User? = intent.getParcelableExtra("DATA_USER")
        if (user != null) {
            val img_user_detail = findViewById<ImageView>(R.id.img_user_detail)
            val tv_name = findViewById<TextView>(R.id.tv_name_detail)
            val tv_location = findViewById<TextView>(R.id.tv_location)
            val tv_repo = findViewById<TextView>(R.id.tv_repository)
            val tv_followers = findViewById<TextView>(R.id.tv_followers)
            val tv_following = findViewById<TextView>(R.id.tv_following)
            img_user_detail.setImageResource(user.avatar)
            tv_name.setText(user.name)
            tv_location.setText(user.location)
            tv_repo.setText(String.valueOf(user.repository))
            tv_followers.setText(String.valueOf(user.followers))
            tv_following.setText(String.valueOf(user.following))
        }
    }
}