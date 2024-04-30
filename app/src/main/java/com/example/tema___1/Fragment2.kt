package com.example.tema___1

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        val args = arguments
        if (args != null)
        {
            val animalNameArg = args.getString("animalName")
            val continentNameArg = args.getString("continentName")
            val animalNameTextView = view.findViewById<TextView>(R.id.animalName)
            val continentNameTextView = view.findViewById<TextView>(R.id.continentName)
            animalNameTextView.text = animalNameArg
            continentNameTextView.text = continentNameArg
            when (continentNameArg)
            {
                "Europa" -> view.setBackgroundColor(Color.GREEN)
                "Africa" -> view.setBackgroundColor(Color.YELLOW)
                "Asia" -> view.setBackgroundColor(Color.RED)
                "America de Nord" -> view.setBackgroundColor(Color.rgb(153, 76, 0))
                "America de Sud" -> view.setBackgroundColor(Color.rgb(255, 128, 0))
                "Australia" -> view.setBackgroundColor(Color.rgb(127, 0, 255))
                "Antarctica" -> view.setBackgroundColor(Color.rgb(0, 255, 255))
            }
        }
    }

}

