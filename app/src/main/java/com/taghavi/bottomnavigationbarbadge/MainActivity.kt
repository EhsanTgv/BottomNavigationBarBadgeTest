package com.taghavi.bottomnavigationbarbadge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBadge(1)
    }

    private fun addBadge(count: Int) {
        val badge: BadgeDrawable = nav_view.getOrCreateBadge(
            R.id.navigation_notifications
        )
        badge.number = count
        badge.isVisible = true
    }

    private fun removeBadge() {
        nav_view?.removeBadge(R.id.navigation_notifications)
    }
}