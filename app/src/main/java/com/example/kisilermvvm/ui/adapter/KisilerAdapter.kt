package com.example.kisilermvvm.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.kisilermvvm.R
import com.example.kisilermvvm.data.entity.Kisiler
import com.example.kisilermvvm.databinding.CardTasarimBinding
import com.example.kisilermvvm.databinding.FragmentAnasayfaBinding
import com.example.kisilermvvm.ui.fragment.AnasayfaFragmentDirections
import com.example.kisilermvvm.util.gecisYap
import com.example.kisilermvvm.viewmodel.AnasayfaViewModel
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(var mContext: Context,
                     var kisilerListesi:List<Kisiler>,
                     var viewModel: AnasayfaViewModel)
: RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(binding: CardTasarimBinding) :
        RecyclerView.ViewHolder(binding.root){

    var binding: CardTasarimBinding

    init {
        this.binding = binding
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding:CardTasarimBinding = DataBindingUtil.inflate(layoutInflater,R.layout.card_tasarim, parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kisi = kisilerListesi.get(position)
        val t = holder.binding

        t.kisiNesnesi = kisi

        t.satirCard.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi = kisi)
            Navigation.gecisYap(it,gecis)
        }

        t.imageViewSil.setOnClickListener {
            Snackbar.make(it,"${kisi.kisi_ad} silinsin mi?",Snackbar.LENGTH_LONG)
                .setAction("EVET"){
                viewModel.sil(kisi.kisi_id) }
                .show()

        }
    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }
}