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
         // TODO 2: Add composable for "taskDetail/{title}"
@Composable
fun NavGraph(navController: NavHostController, viewModel: TaskViewModel) {
    NavHost(
        navController = navController,
        startDestination = "list" 
    ) {
        composable("list") {
            TaskDetailScreen(navController = navController, viewModel = viewModel)
        }

       
    
    }
}
