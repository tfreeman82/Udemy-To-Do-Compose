package com.tfreeman.udemyto_docompose.navigation

import androidx.navigation.NavHostController
import com.tfreeman.udemyto_docompose.util.Action
import com.tfreeman.udemyto_docompose.util.Constants.LIST_SCREEN
import com.tfreeman.udemyto_docompose.util.Constants.TASK_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true}
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}