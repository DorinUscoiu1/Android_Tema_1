package com.example.tema___1
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private val animalList: List<Animal>) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder
    {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.animal_item, parent, false)
        return AnimalViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int)
    {
        val currentAnimal = animalList[position]
        holder.animalName.text = currentAnimal.name
        holder.continentName.text = currentAnimal.continent
        when (currentAnimal.continent)
        {
            "Europa" -> {
                holder.itemView.setBackgroundColor(Color.GREEN)
                holder.animalName.gravity = Gravity.START
                holder.continentName.gravity = Gravity.START
                holder.divider.visibility = View.GONE
                holder.dividerVertical.visibility = View.GONE
            }
            "Africa" -> {
                holder.itemView.setBackgroundColor(Color.YELLOW)
                holder.animalName.gravity = Gravity.START
                holder.continentName.gravity = Gravity.START
                holder.divider.visibility = View.VISIBLE
                holder.dividerVertical.visibility = View.GONE
            }
            "Asia" -> {
                holder.itemView.setBackgroundColor(Color.RED)
                holder.animalName.gravity = Gravity.START
                holder.continentName.gravity = Gravity.END
                holder.divider.visibility = View.GONE
                holder.dividerVertical.visibility = View.VISIBLE
            }
            "America de Nord" -> {
                holder.itemView.setBackgroundColor(Color.rgb(153, 76, 0))
                holder.animalName.gravity = Gravity.END
                holder.continentName.gravity = Gravity.END
                holder.divider.visibility = View.GONE
                holder.dividerVertical.visibility = View.GONE
            }
            "America de Sud" -> {
                holder.itemView.setBackgroundColor(Color.rgb(255, 128, 0))
                holder.animalName.gravity = Gravity.END
                holder.continentName.gravity = Gravity.END
                holder.divider.visibility = View.VISIBLE
                holder.dividerVertical.visibility = View.GONE
            }
            "Australia" -> {
                holder.itemView.setBackgroundColor(Color.rgb(127, 0, 255))
                holder.animalName.gravity = Gravity.CENTER
                holder.continentName.gravity = Gravity.CENTER
                holder.divider.visibility = View.GONE
                holder.dividerVertical.visibility = View.GONE
            }
            "Antarctica" -> {
                holder.itemView.setBackgroundColor(Color.rgb(0, 255, 255))
                holder.animalName.gravity = Gravity.CENTER
                holder.continentName.gravity = Gravity.CENTER
                holder.divider.visibility = View.VISIBLE
                holder.dividerVertical.visibility = View.GONE
            }
        }
    }
    override fun getItemCount() = animalList.size
    inner class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener
    {
        val animalName: TextView = itemView.findViewById(R.id.animalName)
        val continentName: TextView = itemView.findViewById(R.id.continentName)
        val divider: View = itemView.findViewById(R.id.divider)
        val dividerVertical: View =itemView.findViewById(R.id.dividerVertical)
        init { itemView.setOnClickListener(this) }
        override fun onClick(view: View)
        {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION)
            {
                val animal = animalList[position]
                val bundle = Bundle().apply {
                    putString("animalName", animal.name)
                    putString("continentName", animal.continent)
                }
                val fragment2 = Fragment2().apply {
                    arguments = bundle
                }
                val transaction = (view.context as AppCompatActivity).supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment_container, fragment2)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
    }
}
