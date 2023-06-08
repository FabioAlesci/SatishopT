package com.fabioalesci.satishop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fabioalesci.satishop.databinding.ReviewLayoutBinding

class ReviewAdapter(private val mList: List<RevViewModel>): RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {

    class ViewHolder(binding: ReviewLayoutBinding): RecyclerView.ViewHolder(binding.root){
        val ratingBar = binding.ratingBar
        val textReview = binding.textReview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewAdapter.ViewHolder {
        val view = ReviewLayoutBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        )
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ReviewAdapter.ViewHolder, position: Int) {
        val RevViewModel = mList[position]
        holder.ratingBar.rating = RevViewModel.rating
        holder.textReview.text = RevViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

}