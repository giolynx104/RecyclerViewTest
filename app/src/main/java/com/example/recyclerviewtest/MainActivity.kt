package com.example.recyclerviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DefaultItemAnimator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val recyclerView: RecyclerView = findViewById(R.id.emailRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val emails = listOf(
            EmailItem('E', "Edurila.com", "$19 Only (First 10 spots) - Bestselling...", "Are you looking to Learn Web Designin...", "12:34 PM"),
            EmailItem('C', "Chris Abad", "Help make Campaign Monitor better", "Let us know your thoughts! No Images...", "11:22 AM"),
            EmailItem('T', "Tuto.com", "8h de formation gratuite et les nouvea...", "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM"),
            EmailItem('S', "support", "Société Ovh : suivi de vos services - hp...", "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"),
            EmailItem('M', "Matt from Ionic", "The New Ionic Creator Is Here!", "Announcing the all-new Creator, build...", "10:00 AM"),
            EmailItem('A', "Amazon.com", "Your Amazon.com order of 'Product X'", "Your order of Product X has shipped...", "9:45 AM"),
            EmailItem('L', "LinkedIn", "New job opportunities for you", "Based on your profile, we think you...", "9:30 AM"),
            EmailItem('G', "GitHub", "Security alert for your repository", "We detected a potential security...", "9:15 AM"),
            EmailItem('N', "Netflix", "New on Netflix this week", "Check out the latest additions to our...", "9:00 AM"),
            EmailItem('B', "Booking.com", "Confirm your upcoming reservation", "Your stay at Hotel XYZ is coming up...", "8:45 AM"),
            EmailItem('S', "Spotify", "Discover Weekly: Your weekly mixtape", "We've got some new music for you...", "8:30 AM"),
            EmailItem('U', "Udemy", "Last day to enroll: Python Masterclass", "Don't miss out on this bestselling...", "8:15 AM"),
            EmailItem('T', "Twitter", "You have new notifications", "@user and 5 others interacted with...", "8:00 AM"),
            EmailItem('F', "Facebook", "You have memories to look back on", "See your Facebook memories from this...", "7:45 AM"),
            EmailItem('I', "Instagram", "username and others shared new posts", "See what username and others have...", "7:30 AM")
        )

        val adapter = EmailAdapter(emails)
        recyclerView.adapter = adapter

        recyclerView.itemAnimator = DefaultItemAnimator()

        val dividerItemDecoration = DividerItemDecoration(recyclerView.context, LinearLayoutManager.VERTICAL)
        recyclerView.addItemDecoration(dividerItemDecoration)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            // Xử lý khi nhấn nút FAB
        }
    }
}
