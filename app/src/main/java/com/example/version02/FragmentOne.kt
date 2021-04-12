package com.example.version02

import android.widget.Toast
import com.example.version02.databinding.FragmentOneBinding

class FragmentOne : BaseFragment<FragmentOneBinding>() {
    override fun getLayoutId() = R.layout.fragment_one

    override fun initControl() {
        binding.textViewOne.text = getString(R.string.fragment_one)
        binding.btnOne.setOnClickListener {
            Toast.makeText(requireContext().applicationContext, "Fragment One", Toast.LENGTH_SHORT)
                .show()
        }

    }

}




