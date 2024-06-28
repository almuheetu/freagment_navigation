package com.example.freagmentnavigation

import User
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.freagmentnavigation.databinding.FragmentFirstBinding
import com.example.freagmentnavigation.databinding.FragmentSecondBinding

open class FirstFragment : Fragment(), ContactAdapter.ItemClickListener {
    private lateinit var binding: FragmentFirstBinding
//    private lateinit var _binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
//        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.contractsRecyclerView.setOnClickListener {
            val user = User("name", "phone", "email", "address")
            val bundle =
                bundleOf(
                    "passing_int" to user,
                )

            findNavController().navigate(R.id.SecondFragment, bundle)
        }
        return binding.root
    }


    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)

        val contactAdapter = ContactAdapter(dataset, this)

        val recyclerView: RecyclerView = binding.contractsRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = contactAdapter
    }

    override fun onItemClick(user: User) {
        Toast.makeText(requireContext(), "${user.address} , ${user.email}", Toast.LENGTH_SHORT)
            .show()
        findNavController().navigate(R.id.SecondFragment)
    }


}
