package com.core.shared.utils.fragment_extensions

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavDirections
import androidx.navigation.NavGraph
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import timber.log.Timber

fun Fragment.navigate(action: Int, bundle: Bundle? = null) {
    try {
        findNavController().navigate(action, bundle)
    } catch (e: IllegalArgumentException) {
        Timber.e(e)
    }
}

fun Fragment.navigate(directions: NavDirections) {
    findNavController().navigate(directions)
}

fun Fragment.navigateUp() {
    findNavController().navigateUp()
}

fun Fragment.onBackPressed(action: () -> Unit) {
    requireActivity().onBackPressedDispatcher.addCallback(
        viewLifecycleOwner,
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                action.invoke()
            }
        }
    )
}


fun Fragment.repeatOnLifecycleScope(
    lifecycle: Lifecycle.State = Lifecycle.State.STARTED,
    block: suspend CoroutineScope.() -> Unit
): Job {
    return lifecycleScope.launch { repeatOnLifecycle(lifecycle) { block() } }
}


fun Fragment.navigateBetweenNavigationGraph(
    @IdRes navGraphId: Int,
    @IdRes startDestId: Int,
    @IdRes action: Int
) {
    val navController = findNavController()
    val graph = navController.graph.findNode(navGraphId) as NavGraph
    graph.setStartDestination(startDestId)
    navController.navigate(action)
}