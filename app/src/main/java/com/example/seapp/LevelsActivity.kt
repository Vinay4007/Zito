package com.example.seapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_levels.*
import kotlinx.android.synthetic.main.nav_header.*

import kotlinx.android.synthetic.main.activity_main.*

class LevelsActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levels)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)


        toggle=ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked Home", Toast.LENGTH_SHORT).show()
                R.id.nav_leaderboard -> Toast.makeText(applicationContext,"Clicked Leaderboard",
                    Toast.LENGTH_SHORT).show()
                R.id.nav_collection -> Toast.makeText(applicationContext,"Clicked Collection",
                    Toast.LENGTH_SHORT).show()
                R.id.nav_share -> Toast.makeText(applicationContext,"Clicked Share", Toast.LENGTH_SHORT).show()
                R.id.nav_login -> Toast.makeText(applicationContext,"Clicked Login", Toast.LENGTH_SHORT).show()
            }

            true
        }

        button1.setOnClickListener {


                var intent = Intent(this,Level1::class.java)
                startActivity(intent)
//                finish()

        }
        button2.setOnClickListener {


            var intent = Intent(this,Level2::class.java)
            startActivity(intent)
//            finish()

        }

        button3.setOnClickListener {


            var intent = Intent(this,Level3::class.java)
            startActivity(intent)
//            finish()

        }
        button4.setOnClickListener {


            var intent = Intent(this,Level4::class.java)
            startActivity(intent)
//            finish()

        }
        button5.setOnClickListener {


            var intent = Intent(this,Level5::class.java)
            startActivity(intent)
//            finish()

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}