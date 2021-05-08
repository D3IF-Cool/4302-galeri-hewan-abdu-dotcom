package org.d3if3067.recycleview.model

import org.d3if3067.recycleview.R

data class Hewan(
        val nama: String,
        val namaLatin: String,
        val imageResId: Int = R.drawable.angsa,
        val jenisHewan: String
)
