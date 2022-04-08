package com.yousef.sheet4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var models= arrayListOf<Model>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setModels()
        val recyclerView=findViewById<RecyclerView>(R.id.soura)
        val souraAdapter= SouraAdapter(models)
        recyclerView.adapter=souraAdapter
    }

    private fun setModels(){
        for( i in 0..113 ){
            val model=Model(resources.getStringArray(R.array.Quran)[i])
            models.add(model)
        }
    }
}