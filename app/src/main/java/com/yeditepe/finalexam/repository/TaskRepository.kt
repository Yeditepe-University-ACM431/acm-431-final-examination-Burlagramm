package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {
     fun fetchTasks(): List<Task> {
      
        val response = api.getTasks()
        
     
        return response.map { dto ->
            Task(id = dto.id, title = dto.title, isCompleted = dto.completed)
        }
    }
}

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {

    private val _taskList = mutableStateOf<List<Task>>(emptyList())
    val taskList: State<List<Task>> = _taskList

    init {
 
        viewModelScope.launch {
            _taskList.value = repository.fetchTasks()
        }
    }
}
