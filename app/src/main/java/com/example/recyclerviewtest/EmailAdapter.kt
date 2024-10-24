package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.R

class EmailAdapter(private val emails: List<EmailItem>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val initialTextView: TextView = view.findViewById(R.id.senderInitial)
        val senderNameTextView: TextView = view.findViewById(R.id.senderName)
        val subjectTextView: TextView = view.findViewById(R.id.subject)
        val previewTextView: TextView = view.findViewById(R.id.preview)
        val timeTextView: TextView = view.findViewById(R.id.time)
        val starImageView: ImageView = view.findViewById(R.id.star)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.initialTextView.text = email.senderInitial.toString()
        holder.senderNameTextView.text = email.senderName
        holder.subjectTextView.text = email.subject
        holder.previewTextView.text = email.preview
        holder.timeTextView.text = email.time
        holder.starImageView.setImageResource(
            if (email.isStarred) R.drawable.ic_star_filled else R.drawable.ic_star_outline
        )
    }

    override fun getItemCount() = emails.size
}
