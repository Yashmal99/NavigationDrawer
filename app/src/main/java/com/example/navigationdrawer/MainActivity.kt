package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        val actionbar =supportActionBar
        actionbar?.title = "navigation drawer"

        val Toggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            (R.string.open),
            (R.string.close)
        ){}
        Toggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(Toggle)
        Toggle.syncState()

        navigationView.setNavigationItemSelectedListener(this)
    }


    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.home -> {
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            }
            R.id.work -> {
                Toast.makeText(this, "Work", Toast.LENGTH_SHORT).show()
            }
            R.id.school -> {
                Toast.makeText(this, "School", Toast.LENGTH_SHORT).show()
            }
            R.id.timeline -> {
                Toast.makeText(this, "Timeline", Toast.LENGTH_SHORT).show()
            }
            R.id.settings -> {
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
            }
            R.id.logout -> {
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}





