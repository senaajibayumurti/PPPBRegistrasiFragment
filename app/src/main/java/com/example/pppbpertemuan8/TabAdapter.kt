package com.example.pppbpertemuan8

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> HomeFragment()
            1 -> MaterialFragment()
            2 -> QuizFragment()
            else -> throw java.lang.IllegalArgumentException("Position out of array")
        }
    }
}