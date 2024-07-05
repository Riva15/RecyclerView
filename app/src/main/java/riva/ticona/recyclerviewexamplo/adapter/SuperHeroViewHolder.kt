package riva.ticona.recyclerviewexamplo.adapter

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import riva.ticona.recyclerviewexamplo.HeroDatosActivity
import riva.ticona.recyclerviewexamplo.SuperHero
import riva.ticona.recyclerviewexamplo.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)

        itemView.setOnClickListener {
            onClickListener(superHeroModel)

            val context = binding.ivSuperHero.context
            val intent = Intent(context, HeroDatosActivity::class.java).apply {
                putExtra("SUPERHERO_NAME", superHeroModel.superhero)
                putExtra("REAL_NAME", superHeroModel.realName)
                putExtra("PUBLISHER", superHeroModel.publisher)
                putExtra("PHOTO", superHeroModel.photo)
                putExtra("DESCRIPTION", superHeroModel.description)  // Añadir descripción
            }
            context.startActivity(intent)
        }
    }
}

