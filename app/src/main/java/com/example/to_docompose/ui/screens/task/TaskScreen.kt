package com.example.to_docompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.to_docompose.util.Action

@Composable
fun TaskScreen(
//    selectedTask: ToDoTask?,
//    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
//    val title: String by sharedViewModel.title
//    val description: String by sharedViewModel.description
//    val priority: Priority by sharedViewModel.priority

//    val context = LocalContext.current

    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = navigateToListScreen)
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
//            TaskContent(
//                title = title,
//                onTitleChange = {
//                    sharedViewModel.updateTitle(it)
//                },
//                description = description,
//                onDescriptionChange = {
//                    sharedViewModel.description.value = it
//                },
//                priority = priority,
//                onPrioritySelected = {
//                    sharedViewModel.priority.value = it
//                }
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