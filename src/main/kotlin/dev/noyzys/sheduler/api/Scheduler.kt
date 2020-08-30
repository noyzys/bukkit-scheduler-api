package dev.noyzys.sheduler.api

import java.time.Duration

/*
 * @author: NoyZys on 10:49, 30.08.2020
 */

/**
 * An interface that represents the main activities and functions to send the job.
 * Written api version in: Kotlin
 */
interface Scheduler {

    /**
     * Create and run [SchedulerTask]
     *
     * @param plugin Plugin that created the task
     * @param name Name of the task
     * @param delay Time to pass before the task start.
     * @param isAsync True if the task run asynchronous, false otherwise.
     * @param runnable [Runnable] to be invoked.
     * @return Configured [SchedulerTask]
     */
    fun createAndRunTask(
        plugin: Any,
        name: String,
        delay: Duration,
        interval: Duration,
        isAsync: Boolean,
        runnable: Runnable
    )
}