package com.example.tema___1
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment1 : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.addItemDecoration(DividerItemDecoration(activity, LinearLayoutManager.VERTICAL))
        val adapter = AnimalAdapter(getSampleAnimalList())
        recyclerView.adapter = adapter
        return view
    }
    private fun getSampleAnimalList(): List<Animal>
    {
        val animals = mutableListOf<Animal>(
            Animal("Leopard", "Africa"),
            Animal("Tucan", "America de Sud"),
            Animal("Lemur", "Africa"),
            Animal("Panda Rosu", "Asia"),
            Animal("Vultur", "Europa"),
            Animal("Koala", "Australia"),
            Animal("Iepure Polar", "Antarctica"),
            Animal("Coiot", "America de Nord"),
            Animal("Elefant", "Africa"),
            Animal("Condor", "America de Sud"),
            Animal("Urangutan", "Asia"),
            Animal("Pinguin", "Antarctica"),
            Animal("Vulpe Polara", "Europa"),
            Animal("Cangur", "Australia"),
            Animal("Tatu", "America de Sud"),
            Animal("Leu", "Africa"),
            Animal("Capibara", "America de Sud"),
            Animal("Tigru Siberian", "Asia"),
            Animal("Foca", "Antarctica"),
            Animal("Caine Lup", "Europa"),
            Animal("Cangur Alb", "Australia"),
            Animal("Bufnita", "Europa"),
            Animal("Coiot Mexican", "America de Nord"),
            Animal("Gorila de Munte", "Africa"),
            Animal("Wallaby(Cangur pitic)", "Australia"),
            Animal("Puma", "America de Sud"),
            Animal("Elefant Indian", "Asia"),
            Animal("Zebra", "Africa"),
            Animal("Albatros", "Antarctica"),
            Animal("Veverita", "Europa"),
            Animal("Dingo", "Australia"),
            Animal("Daubentonia madagascariensis", "Africa"),
            Animal("Condor din California", "America de Nord"),
            Animal("Rinocer Indian", "Asia"),
            Animal("Hiena", "Africa"),
            Animal("Cangur Tasmanian", "Australia"),
            Animal("Ocelot", "America de Sud"),
            Animal("Panda Gigant", "Asia"),
            Animal("Foca Ross", "Antarctica"),
            Animal("Caine Ciobanesc", "Europa"),
            Animal("Liliac", "America de Sud"),
            Animal("Gorila", "Africa"),
            Animal("Veverita1", "Europa"),
            Animal("Cangur Rosu", "Australia"),
            Animal("Burunduc", "Europa")
        )
        return animals
    }
}
