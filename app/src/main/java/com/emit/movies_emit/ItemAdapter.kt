package com.emit.movies_emit

import android.content.Context
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emit.movies_emit.databinding.ItemListBinding

class ItemAdapter(private val context: Context, private val dataset: MutableList<Clasificacion>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{

    inner class ItemViewHolder(val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(clasificacion: Clasificacion) {
            with(binding){
                textViewAbreviatura.text = clasificacion.abreviacion
                textViewCodigo.text = clasificacion.idClasificacion.toString()
                textViewDesc.text = clasificacion.descripcion
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}