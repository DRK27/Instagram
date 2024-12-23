package com.example.instaop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaop.databinding.ItemPostBinding
import com.example.instaop.databinding.ItemStoryBinding

class PostAdapter (private val dataList: List<PostModel>) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPostBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    class ViewHolder(private var binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(post: PostModel) {
            Glide.with(binding.imgAva).load(post.avatarka).into(binding.imgAva)
            Glide.with(binding.imgPost).load(post.content).into(binding.imgPost)
            binding.tvName.text = post.nickname
            binding.nickname.text = post.nickname
        }
    }

}