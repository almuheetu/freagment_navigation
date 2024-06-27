package com.example.freagmentnavigation

import User
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
        intent.getSerializableExtra("user")

//        Toast.makeText(
//            requireContext(),
//            "${arguments?.getString("passing_string")}" +
//                "${arguments?.getFloat("passing_float")}" +
//                "${arguments?.getBoolean("passing_boolean")}" +
//                arguments?.getIntArray("passing_array")?.toList().toString() +
//                "${arguments?.getInt("passing_int")}",
//            Toast.LENGTH_SHORT,
//        ).show()
    }

//    fun onCreate() {
//
//        Toast.makeText(requireContext(), "onCreate", Toast.LENGTH_SHORT).show()
//    }

}
