package com.example.inputpraktikum.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Praktikum(modifier: Modifier
) {
    var textNamaLengkap by remember { mutableStateOf("") }
    var textAlamatP by remember { mutableStateOf("") }
    var textKelamin by remember { mutableStateOf("") }
    var textKawin by remember { mutableStateOf("") }

    var namal by remember { mutableStateOf("") }
    var alamatp by remember { mutableStateOf("") }
    var jenisp by remember { mutableStateOf("") }
    var kawinp by remember { mutableStateOf("") }

    val genderp:List<String> = listOf("Laki-laki","Perempuan")
}