package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {

    // TODO 3: Read task list from ViewModel
     val tasks by viewModel.tasks.observeAsState(emptyList())

     // TODO 4: Display task titles and completion status
        // Use a simple Column or LazyColumn
    Column {
        LazyColumn(
            modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF)), 
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text(
                text = "Task List",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium, 
                color = Color(0xFFCCC2DC), 
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
                    
    }    
    
}

@Composable
fun TaskRow(task: Task, navController: NavController) {

    Text(
        text = task.title,
        modifier = Modifier.clickable {
            // TODO 3: Navigate to detail screen with task title
        
            navController.navigate("detail/${task.title}")
                   

            
        }
    )
    
}
