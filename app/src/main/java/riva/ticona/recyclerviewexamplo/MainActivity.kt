package riva.ticona.recyclerviewexamplo

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import riva.ticona.recyclerviewexamplo.adapter.SuperHeroAdapter
import riva.ticona.recyclerviewexamplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SuperHeroProvider.superherolist
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)

        binding.recyclerSuperHero.layoutManager = manager
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superherolist) { superhero ->
                onItemSelected(
                    superhero
                )
            }

    }
    fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.superhero, Toast.LENGTH_SHORT).show()
    }
}
