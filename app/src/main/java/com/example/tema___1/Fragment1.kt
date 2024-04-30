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
        val animals = mutableListOf<Animal>()
        animals.add(Animal("Leu", "Africa"))
        animals.add(Animal("Elefant", "Africa"))
        animals.add(Animal("Koala", "Australia"))
        animals.add(Animal("Panda", "Asia"))
        animals.add(Animal("Vultur", "America de Nord"))
        animals.add(Animal("Condor", "America de Sud"))
        animals.add(Animal("Pinguin", "Antarctica"))
        animals.add(Animal("Vulpe", "Europa"))
        animals.add(Animal("Tigru", "Asia"))
        animals.add(Animal("Cangur", "Australia"))
        animals.add(Animal("Urs Grizzly", "America de Nord"))
        animals.add(Animal("Armadillo", "America de Sud"))
        animals.add(Animal("Orca", "Antarctica"))
        animals.add(Animal("Veverita", "Europa"))
        animals.add(Animal("Girafa", "Africa"))
        animals.add(Animal("Kangaroo", "Australia"))
        animals.add(Animal("Bizon", "America de Nord"))
        animals.add(Animal("Anaconda", "America de Sud"))
        animals.add(Animal("Foca", "Antarctica"))
        animals.add(Animal("Caine", "Europa"))
        animals.add(Animal("Bufnita", "Africa"))
        animals.add(Animal("Kookaburra", "Australia"))
        animals.add(Animal("Elan", "America de Nord"))
        animals.add(Animal("Puma", "America de Sud"))
        animals.add(Animal("Lup", "Europa"))
        animals.add(Animal("Hipopotam", "Africa"))
        animals.add(Animal("Wombat", "Australia"))
        animals.add(Animal("Urs Panda", "Asia"))
        animals.add(Animal("Capibara", "America de Sud"))
        animals.add(Animal("Albatros", "Antarctica"))
        animals.add(Animal("Zebra", "Africa"))
        animals.add(Animal("Wallaby", "Australia"))
        animals.add(Animal("Coyote", "America de Nord"))
        animals.add(Animal("Jaguar", "America de Sud"))
        animals.add(Animal("Mistret", "Europa"))
        animals.add(Animal("Leopard", "Africa"))
        animals.add(Animal("Bursuc", "America de Nord"))
        animals.add(Animal("Foca Weddell", "Antarctica"))
        animals.add(Animal("Liliac", "America de Sud"))
        animals.add(Animal("Elefant Indian", "Asia"))
        animals.add(Animal("Gorila", "Africa"))
        animals.add(Animal("Camila", "Australia"))
        animals.add(Animal("Veverita Rosie", "Europa"))
        animals.add(Animal("Cangur Mare", "Australia"))
        animals.add(Animal("Veverita Zburatoare", "Europa"))
        return animals
    }
}
