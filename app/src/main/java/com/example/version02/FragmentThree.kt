package com.example.version02

import android.widget.Toast
import com.example.version02.databinding.FragmentThreeBinding

class FragmentThree : BaseFragment<FragmentThreeBinding>() {
    override fun getLayoutId() = R.layout.fragment_three

    override fun initControl() {
        binding.textViewThree.text = getString(R.string.fragment_three)
        binding.button3.setOnClickListener {
           Toast.makeText(context, "FragmentThree", Toast.LENGTH_SHORT).show()
        }
    }
}