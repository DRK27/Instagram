package com.example.instaop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaop.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initAdapterStory()
        initAdapterPost()
    }

    private fun initAdapterStory() {
        val adapter = StoryAdapter(
            arrayListOf(
                StoryModel(
                    "https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png",
                    "janturaeva"
                ),
                StoryModel(
                    "https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png",
                    "janturaeva"
                ),
                StoryModel(
                    "https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png",
                    "janturaeva"
                ),
                StoryModel(
                    "https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png",
                    "janturaeva"
                ),
                StoryModel(
                    "https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png",
                    "janturaeva"
                ),
            )
        )
        binding.rvStory.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )

        binding.rvStory.adapter = adapter
    }

    private fun initAdapterPost() {
        val adapter = PostAdapter(
            arrayListOf(
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
                PostModel("d2709r","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png","https://png.pngtree.com/png-vector/20231113/ourmid/pngtree-realistic-water-splash-effect-isolated-on-transparent-background-png-image_10585385.png"),
            )
        )
        binding.rvPost.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )
        )

        binding.rvPost.adapter = adapter
    }
}