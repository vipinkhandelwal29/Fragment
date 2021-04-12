package com.example.version02

import android.widget.Toast
import com.example.version02.databinding.FragmentTwoBinding

class FragmentTwo : BaseFragment<FragmentTwoBinding>() {
    override fun getLayoutId() = R.layout.fragment_two

    override fun initControl() {
        binding.textViewTwo.text = getString(R.string.fragment_two)
        binding.button2.setOnClickListener {
           Toast.makeText(context, "FragmentTwo", Toast.LENGTH_SHORT).show()
        }
    }
}