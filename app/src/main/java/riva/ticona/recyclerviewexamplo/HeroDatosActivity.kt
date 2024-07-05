package riva.ticona.recyclerviewexamplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import riva.ticona.recyclerviewexamplo.databinding.ActivityHeroDatosBinding

class HeroDatosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeroDatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val superheroName = intent.getStringExtra("SUPERHERO_NAME")
        val realName = intent.getStringExtra("REAL_NAME")
        val publisher = intent.getStringExtra("PUBLISHER")
        val photo = intent.getStringExtra("PHOTO")
        val description = intent.getStringExtra("DESCRIPTION")

        binding.tvSuperHeroName.text = superheroName
        binding.tvRealName.text = realName
        binding.tvPublisher.text = publisher
        Glide.with(this).load(photo).into(binding.ivSuperHero)
        binding.tvDescription.text = description ?: "Sin descripción disponible"
    }
}

