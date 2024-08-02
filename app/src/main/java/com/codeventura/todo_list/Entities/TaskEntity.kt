package com.codeventura.todo_list.Entities

data class TaskEntity(
	val id: Int,
	val title: String,
	val description: String,
	val isDone: Boolean
)
