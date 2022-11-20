////package com.example.seapp
////
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
////
////class Navbar : AppCompatActivity() {
////
////    lateinit var
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_navbar)
////    }
////}
//
//package com.example.seapp
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.content.Intent
//import android.view.MenuItem
//import android.widget.Toast
//import androidx.appcompat.app.ActionBarDrawerToggle
//import androidx.drawerlayout.widget.DrawerLayout
//import com.google.android.material.navigation.NavigationView
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_navbar.*
//import kotlinx.android.synthetic.main.nav_header.*
//
//
//class Navbar : AppCompatActivity() {
//
////    private var Name:String?=null
//    lateinit var toggle: ActionBarDrawerToggle
//
//    override fun onCreate(savedInstanceState:Bundle?){
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_navbar)
////        Name=intent.getStringExtra(Setdata.name)
//        //val userName=intent.getStringExtra(Setdata.name)
//        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
//        val navView : NavigationView = findViewById(R.id.nav_view)
//
//        //user_name.text="${userName} !!"
//        toggle=ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        navView.setNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked Home",Toast.LENGTH_SHORT).show()
//                R.id.nav_leaderboard -> Toast.makeText(applicationContext,"Clicked Leaderboard",Toast.LENGTH_SHORT).show()
//                R.id.nav_collection -> Toast.makeText(applicationContext,"Clicked Collection",Toast.LENGTH_SHORT).show()
//                R.id.nav_share -> Toast.makeText(applicationContext,"Clicked Share",Toast.LENGTH_SHORT).show()
//                R.id.nav_login -> Toast.makeText(applicationContext,"Clicked Login",Toast.LENGTH_SHORT).show()
//            }
//
//            true
//        }
//
//        button10.setOnClickListener{
//            var intent = Intent(this,LevelsActivity::class.java)
//            startActivity(intent)
//        }
//
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//
//        if(toggle.onOptionsItemSelected(item)){
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }
//}