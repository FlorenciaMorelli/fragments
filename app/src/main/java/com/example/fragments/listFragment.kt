package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragments.databinding.FragmentListBinding

//  El Fragment se attacha a la vista (onAttach)

class listFragment : Fragment() {
    private var _binding:FragmentListBinding? = null
    private val binding get() = _binding!! //   El !! indica que no puede ser nunca nulo (es tipo isNullOrEmpty)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFragmentList.setOnClickListener {
            val detailFragment = detailFragment()
            fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView, detailFragment)?.commit()
        }
    }
}