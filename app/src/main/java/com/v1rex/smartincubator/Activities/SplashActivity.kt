package com.v1rex.smartincubator.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.firebase.auth.FirebaseAuth
import com.v1rex.smartincubator.R

class SplashActivity : AppCompatActivity() {
    private val mAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Check if the user is logged for purpose of choosing the mainActivity for the app
        if (FirebaseAuth.getInstance().currentUser != null) {
            startActivity(Intent(this@SplashActivity, BottonNavigationActivity::class.java))
        } else if (FirebaseAuth.getInstance().currentUser == null) {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }



        finish()
    }
}
