package com.fitem.mixdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fitem.mixdemo.databinding.ActivityMainBinding
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.button.setOnClickListener {
            startActivity(FlutterActivity.withCachedEngine("my_engine_id").build(this))
        }
    }

}