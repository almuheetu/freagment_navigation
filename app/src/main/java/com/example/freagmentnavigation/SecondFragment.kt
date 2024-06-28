package com.example.freagmentnavigation

import User
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.BundleCompat.getSerializable
import androidx.fragment.app.Fragment
import com.example.freagmentnavigation.databinding.FragmentSecondBinding
import java.io.Serializable

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


    @SuppressLint("NewApi")
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)

       val user =  when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU -> arguments?.getSerializable("user", User::class.java)
            else -> @Suppress("DEPRECATION") arguments?.getSerializable("user") as? User
        }


       // val user: User? = arguments?.getSerializable("user", ) as User?


        binding.tvSecondFragmentNameId.text = user?.name
        binding.tvSecondFragmentNumberId.text = user?.phoneNumber
        binding.tvSecondFragmentEmailId.text = user?.email
        binding.tvSecondFragmentAddressId.text = user?.address

    }

}
