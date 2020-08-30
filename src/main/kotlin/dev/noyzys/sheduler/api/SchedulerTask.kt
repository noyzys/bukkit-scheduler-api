package dev.noyzys.sheduler.api

import org.bukkit.plugin.Plugin
import java.time.Duration

/*
 * @author: NoyZys on 10:59, 30.08.2020
 */

/**
 * An interface this represents a task that may have been submitted or not.
 * Written api version in: Kotlin
 */
interface SchedulerTask {

    /**
     * Plugin of Bukkit that created the task.
     */
    val plugin: Plugin

    /**
     * Name of task
     */
    val name: String

    /**
     * Time to pass before the task start.
     */
    val delay: Duration

    /**
     * Interval of task repetition.
     * If Duration is: [Duration.ZERO], this task will not repeat.
     */
    val interval: Duration

    /**
     * Asynchronous and Synchronous state.
     * True if the task run async, false if the task run sync.
     */
    val isAsync: Boolean

    /**
     * [Runnable] to be invoked.
     */
    val runnable: Runnable
}