package com.example.freagmentnavigation

import User
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.freagmentnavigation.databinding.FragmentFirstBinding

open class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            val bundle =
                bundleOf(
                    "passing_int" to 567,
                    "passing_boolean" to true,
                    "passing_string" to "Hello World",
                    "passing_array" to intArrayOf(13, 14, 15),
                    "passing_float" to 1.23f,
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

        val dataset =
            arrayOf(
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                User(name = "Shihab", number = 1789803342, email = "shihab@gmail.com", address = "Rajshahi"),
                "Korim",
                "Josim",
                "Shihab",
                "Saikat",
                "Apon",
                "Lima",
                "Liza",
                "Jony",
                "Hira",
                "Sazzad",
                "Raju",
                "Rabbi",
                "Apple",
                "Prottoi",
                "Promis",
                "Ovi",
                "Ornob",
                "Yahid",
                "GolfWizard77",
                "HotelHero88",
                "IndiaNinja99",
                "JulietMaster10",
                "KiloCaptain11",
                "LimaAce12",
                "MikePro13",
                "NovemberSage14",
                "OscarMage15",
                "PapaKnight16",
                "QuebecRanger17",
                "RomeoLeader18",
                "SierraScout19",
                "TangoKing20",
            )
        val contactAdapter = ContactAdapter(dataset)

        val recyclerView: RecyclerView = binding.contractsRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = contactAdapter
    }

}
