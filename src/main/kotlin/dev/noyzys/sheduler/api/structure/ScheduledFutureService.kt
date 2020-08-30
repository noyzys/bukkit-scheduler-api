package dev.noyzys.sheduler.api.structure

import dev.noyzys.sheduler.api.SchedulerTask
import java.util.concurrent.RunnableScheduledFuture

/*
 * @author: NoyZys on 10:57, 30.08.2020
 */

/**
 * An Interface this represents a task scheduled future.
 * Written api version in: Kotlin
 */
interface ScheduledFutureService<V> : RunnableScheduledFuture<V> {

    /**
     * Scheduled task related to this [RunnableScheduledFuture]
     */
    val task: SchedulerTask
}