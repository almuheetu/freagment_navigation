package com.example.freagmentnavigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.freagmentnavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(
            requireContext(),
            "${arguments?.getString("passing_string")}" +
                "${arguments?.getFloat("passing_float")}" +
                "${arguments?.getBoolean("passing_boolean")}" +
                arguments?.getIntArray("passing_array")?.toList().toString() +
                "${arguments?.getInt("passing_int")}",
            Toast.LENGTH_SHORT,
        ).show()
    }

//    fun onCreate() {
//
//        Toast.makeText(requireContext(), "onCreate", Toast.LENGTH_SHORT).show()
//    }

    override fun onStart() {
        super.onStart()
        Log.d("log404", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("log404", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("log404", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("log404", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("log404", "onDestroy: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}
