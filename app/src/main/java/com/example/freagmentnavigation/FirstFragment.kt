package com.example.freagmentnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.freagmentnavigation.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    // This property is only valid between onCreateView and
    // onDestroyView.
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            // findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("Hello")
            findNavController().navigate(action)
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
                "Rohim",
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

//        binding.btnNext.setOnClickListener {
//            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("Hello")
//            findNavController().navigate(action)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}
