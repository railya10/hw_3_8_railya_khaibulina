package com.example.hw_3_8_railya_khaibulina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw_3_8_railya_khaibulina.databinding.FragmentMainBinding

class MainFragment : Fragment(), OnClick {
    private lateinit var binding : FragmentMainBinding
    private val data = mutableListOf<Character>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(
            LayoutInflater.from(requireContext()), container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = CharacterAdapter(data as ArrayList<Character>, this)
        binding.recycler.adapter = adapter
    }

    private fun loadData() {
        data.apply {
            data.add(Character("Alive", "Rick Sanchez", R.drawable.rick_sanchez))
            data.add(Character("Alive", "Morty Smith", R.drawable.morty_smith))
            data.add(Character("Dead", "Albert Einstein", R.drawable.albert_einstein))
            data.add(Character("Alive", "Jerry Smith", R.drawable.jerry_smith))

        }
    }

    override fun onClick(character: Character) {
        findNavController().navigate(
            MainFragmentDirections.actionMainFragment2ToSecondFragment2(
                character
            )
        )
    }
}