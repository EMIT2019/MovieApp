package com.emit.movies_emit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emit.movies_emit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)
    }
}