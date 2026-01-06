package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
          composable("tasks") { TaskListScreen() }
         // TODO 2: Add composable for "taskDetail/{title}"
         
            composable("taskDetail/{title}") { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            TaskDetailScreen(title)

@Composable
fun TaskRow(task: Task, navController: NavController) {
    Text(
        text = task.title,
        modifier = Modifier.clickable {
            // TODO 3: Navigate to detail screen with task title [cite: 91]
            navController.navigate("taskDetail/${task.title}")
        }
    )
}

@Composable
fun TaskDetailScreen(title: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        // TODO 4: Display task title [cite: 103]
        Text(text = "Task Detail: $title", style = MaterialTheme.typography.headlineMedium)
    }
}















        
