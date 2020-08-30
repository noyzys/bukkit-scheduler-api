package dev.noyzys.sheduler.api.structure

import java.util.concurrent.Callable
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit

/*
 * @author: NoyZys on 11:25, 30.08.2020
 *
 */

/**
 * An main interface this represents a scheduler API manager implement interface [ScheduledExecutorService].
 * Written api version in: Kotlin
 * TODO: 30.08.2020 (End api at the end of 2020)
 */
interface ExecutorService : ScheduledExecutorService {

    override fun <V : Any> schedule(
        callable: Callable<V>,
        delay: Long,
        unit: TimeUnit
    ): ScheduledFutureService<V>

    override fun <V : Any?> schedule(
        callable: Callable<V>,
        delay: Long,
        unit: TimeUnit
    ): ScheduledFuture<V>

    override fun scheduleAtFixedRate(
        command: Runnable,
        initialDelay: Long,
        period: Long,
        unit: TimeUnit
    ): ScheduledFuture<*>

    override fun scheduleWithFixedDelay(
        command: Runnable,
        initialDelay: Long,
        delay: Long,
        unit: TimeUnit
    ): ScheduledFuture<*>
}