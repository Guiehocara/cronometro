package com.example.myapplication.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cronometro(nome:String, tempo: Int){
    Column {
        Row {
            Text(text = nome)
        }
        Row {
            Column {
                Icon(imageVector = Icons.Filled.DateRange, contentDescription = "Horario")
            }
            Column {
                Text("00:00 00:00")
            }
        }
    }
}