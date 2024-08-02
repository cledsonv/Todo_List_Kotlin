package com.codeventura.todo_list.View

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codeventura.todo_list.ui.theme.MyApplicationTheme
import com.codeventura.todo_list.widgets.CardTask

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HomePage () {
	
		Scaffold(
			topBar = {
				TopAppBar(
					title = {
						Text(
							text = "Gerenciador de Tarefas",
							color = Color.White,
							fontWeight = FontWeight.Bold,
						)
					},
					colors = TopAppBarDefaults.topAppBarColors(
						containerColor = MaterialTheme.colorScheme.primaryContainer,
						titleContentColor = MaterialTheme.colorScheme.primary,
					)
				)
			},
			floatingActionButton = {
				FloatingActionButton(onClick = { /*TODO*/ }) {
					Icon(
						imageVector = Icons.Rounded.Add,
						contentDescription = "Adicionar Tarefa",
						modifier = Modifier
							.clickable {
								println("Clicou no botão de adicionar tarefa")
							},
					)
				}
				
			}
		) { paddingValues ->
			CardTask(
				modifier = Modifier
					.padding(paddingValues)
					.fillMaxWidth(),
			)
		}
	}




