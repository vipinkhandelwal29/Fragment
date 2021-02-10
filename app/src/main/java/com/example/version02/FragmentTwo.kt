package com.example.version02

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.version02.databinding.FragmentTwoBinding

class FragmentTwo : BaseFragment<FragmentTwoBinding>() {
    override fun getLayoutId() = R.layout.fragment_two

    override fun initControl() {
        binding.textViewTwo.text=getString(R.string.fragment_two)
        binding.button2.setOnClickListener {
            val toast = Toast.makeText(context,"FragmentTwo",Toast.LENGTH_LONG)
                toast.show()
            Log.d("toast",   "$toast")
        }
    }
}