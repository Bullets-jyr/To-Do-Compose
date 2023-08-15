package com.example.to_docompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.example.to_docompose.data.models.Priority
import com.example.to_docompose.data.models.ToDoTask
import com.example.to_docompose.ui.viewmodels.SharedViewModel
import com.example.to_docompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    val title: String by sharedViewModel.title
    val description: String by sharedViewModel.description
    val priority: Priority by sharedViewModel.priority

//    val context = LocalContext.current

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
//            TaskAppBar(
//                selectedTask = selectedTask,
//                navigateToListScreen = { action ->
//                    if (action == Action.NO_ACTION) {
//                        navigateToListScreen(action)
//                    } else {
//                        if (sharedViewModel.validateFields()) {
//                            navigateToListScreen(action)
//                        } else {
//                            displayToast(context = context)
//                        }
//                    }
//                }
//            )
        },
        content = {
            TaskContent(
                title = title,
                onTitleChange = {
                    sharedViewModel.updateTitle(it)
//                    sharedViewModel.title.value = it
                },
                description = description,
                onDescriptionChange = {
                    sharedViewModel.description.value = it
                },
                priority = priority,
                onPrioritySelected = {
                    sharedViewModel.priority.value = it
                }
            )
//            TaskContent(
//                title = "",
//                onTitleChange = {},
//                description = "",
//                onDescriptionChange = {},
//                priority = Priority.LOW,
//                onPrioritySelected = {}
//            )
        }
    )
}

//fun displayToast(context: Context) {
//    Toast.makeText(
//        context,
//        "Fields Empty.",
//        Toast.LENGTH_SHORT
//    ).show()
//}