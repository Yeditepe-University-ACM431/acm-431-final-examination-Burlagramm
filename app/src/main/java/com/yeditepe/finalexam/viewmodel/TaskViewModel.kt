package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    private val _tasks = MutableLiveData<List<Task>>()
    val tasks: LiveData<List<Task>> get() = _tasks

    private val _selectedTask = MutableLiveData<Task?>()
    val selectedTask: LiveData<Task?> get() = _selectedTask

    init {
        -tasks.value = listOf(
            Task(1, "Chor", true),
            Task(2, "Washing Dishes", false),
            Task(3, "Working", true)
        )
    }


    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task

        fun selectedTask(task: Task) {
        _selectedTask.value = task
    }

    fun getTaskByCompletion(id: Int): Task? {
        return _selectedTask.value?.find { it.id == id }
    }
    }
}
