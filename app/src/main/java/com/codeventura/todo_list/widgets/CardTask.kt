package com.codeventura.todo_list.widgets

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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun CardTask(modifier: Modifier = Modifier) {
	OutlinedCard(
		colors = CardDefaults.cardColors(
			containerColor = MaterialTheme.colorScheme.surface,
		),
		border = BorderStroke(1.dp, Color.White),
		modifier = modifier
			.padding(vertical = 10.dp, horizontal = 16.dp),
	) {
		Column(
			modifier = Modifier
				.padding(16.dp),
		) {
			Row(
				horizontalArrangement = Arrangement.SpaceBetween,
				modifier = Modifier.fillMaxWidth(),
			) {
				Text(
					text = "Título do Card asd asd asdas dasd",
					style = TextStyle(
						fontWeight = FontWeight.Bold,
						fontSize = 24.sp,
					),
					modifier = Modifier.weight(1f),
					textAlign = TextAlign.Start,
				)
				Icon(
					imageVector = Icons.Filled.Edit,
					contentDescription = "Delete",
					modifier = Modifier
						.padding(end = 10.dp)
						.size(30.dp)
						.clickable {
							println("Clicou no botão de deletar")
						},
				)
				
				Icon(
					imageVector = Icons.Filled.Delete,
					contentDescription = "Delete",
					modifier = Modifier
						.size(30.dp)
						.clickable {
							println("Clicou no botão de deletar")
						},
				)
			}
			
			Text(
				text = "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu",
				modifier = Modifier
					.padding(top = 20.dp),
				textAlign = TextAlign.Justify,
			)
			
		}
		
	}
}
