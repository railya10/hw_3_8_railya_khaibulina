package com.example.hw_3_8_railya_khaibulina
// байндинг уходит вниз, чтобы не путалось с методами конструктора
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_3_8_railya_khaibulina.databinding.ItemCharacterBinding

class CharacterAdapter(private val data: ArrayList<Character>, private val mListener: OnClick) : //здесь указан интерфейс, который мы создали в виде класса
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        return ViewHolder(ItemCharacterBinding.bind(itemView))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(character: Character) {
            character.image_?.let { binding.image.setImageResource(it) }
            binding.status.text = character.status_ //id status from fragment_second = переменная из data class
            binding.name.text = character.name_ //id name from fragment_second = переменная из data class

            itemView.setOnClickListener {
                mListener.onClick(character)
            }
        }
    }
}