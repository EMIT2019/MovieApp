package com.emit.movies_emit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.emit.movies_emit.databinding.FragmentMoviesBinding


class MoviesFragment : Fragment() {
    private lateinit var view: FragmentMoviesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view = FragmentMoviesBinding.inflate(layoutInflater)
        return view.root
    }
}