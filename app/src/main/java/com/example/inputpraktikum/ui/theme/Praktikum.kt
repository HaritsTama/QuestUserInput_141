package com.example.inputpraktikum.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
    val perkawinan:List<String> = listOf("Janda","Lajang","Duda")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(Color.DarkGray)
                    .padding(start = 24.dp, bottom = 16.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = "Formulir Pendaftaran",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .padding(24.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "NAMA LENGKAP",
                                fontSize = 12.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                            OutlinedTextField(
                                value = textNamaLengkap,
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth(),
                                label = { Text(text = "Isian nama lengkap") },
                                onValueChange = {
                                    textNamaLengkap = it
                                }
                            )
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "JENIS KELAMIN",
                                fontSize = 12.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                            genderp.forEach { item ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .selectable(
                                            selected = textKelamin == item,
                                            onClick = { textKelamin = item }
                                        )
                                        .padding(vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = textKelamin == item,
                                        onClick = { textKelamin = item },
                                    )
                                    Text(
                                        text = item,
                                        color = Color.Black,
                                        fontSize = 14.sp,
                                        modifier = Modifier.padding(start = 8.dp)
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "STATUS PERKAWINAN",
                                fontSize = 12.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                            perkawinan.forEach { item ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .selectable(
                                            selected = textKawin == item,
                                            onClick = { textKawin = item }
                                        )
                                        .padding(vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = textKawin == item,
                                        onClick = { textKawin = item },
                                    )
                                    Text(
                                        text = item,
                                        color = Color.Black,
                                        fontSize = 14.sp,
                                        modifier = Modifier.padding(start = 8.dp)
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }
            }
        }
    }
}