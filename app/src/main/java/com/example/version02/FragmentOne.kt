package com.example.version02

import android.util.Log
import android.widget.Toast
import com.example.version02.databinding.FragmentOneBinding

class FragmentOne : BaseFragment<FragmentOneBinding>() {
    override fun getLayoutId() = R.layout.fragment_one

    override fun initControl() {
        binding.textViewOne.text = getString(R.string.fragment_one)
        binding.btnOne.setOnClickListener {
            Log.d("==>","==>sdfds")
            Toast.makeText(requireContext().applicationContext, "Fragmentn  sdadads sdadsad asasdsadn  n n n n n n n nnn n n nn n n    One", Toast.LENGTH_LONG).show()
        }

    }

}




