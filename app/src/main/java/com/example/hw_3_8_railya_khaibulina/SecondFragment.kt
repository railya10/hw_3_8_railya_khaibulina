package com.example.hw_3_8_railya_khaibulina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.hw_3_8_railya_khaibulina.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding:FragmentSecondBinding
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(
            LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.status.text = args.item.status_
        binding.name.text = args.item.name_
        args.item.image_?.let { binding.imageSecond.setImageResource(it) }
    }
}