package com.example.version02.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.version02.FragmentOne
import com.example.version02.FragmentThree
import com.example.version02.FragmentTwo

/*class PagerAdapter(supportFragmentManager: FragmentManager) : FragmentStatePagerAdapter(supportFragmentManager)
{
    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        Log.i("TextStats", "POSITION = $position")
        return when (position) {
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
            else -> Fragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}*/


class PagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 3

    override fun getItem(position: Int): Fragment {

        var fragment: Fragment? = null
        when (position) {

            0 -> fragment = FragmentOne()
            1 -> fragment = FragmentTwo()
            2 -> fragment = FragmentThree()

        }
        Log.i("TextStats", "POSITION = $position")

        return fragment!!
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }
}
