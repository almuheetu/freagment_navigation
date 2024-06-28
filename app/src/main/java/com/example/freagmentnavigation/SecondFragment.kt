package com.example.freagmentnavigation

import User
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        arguments?.getBundle("passing_userName")
        arguments?.getBundle("passing_userNumber")
        arguments?.getBundle("passing_userEmail")
        arguments?.getBundle("passing_Address")

        val userName = arguments?.getString("passing_userName")
        val userNumber = arguments?.getString("passing_userNumber")
        val userEmail = arguments?.getString("passing_userEmail")
        val userAddress = arguments?.getString("passing_Address")

        binding.tvSecondFragmentNameId.text = userName
        binding.tvSecondFragmentNumberId.text = userNumber
        binding.tvSecondFragmentEmailId.text = userEmail
        binding.tvSecondFragmentAddressId.text = userAddress

    }

}
