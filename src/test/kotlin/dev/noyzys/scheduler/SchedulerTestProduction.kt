package dev.noyzys.scheduler

import dev.noyzys.scheduler.api.SchedulerAction
import java.time.Duration

/**
 * @author: NoyZys on 12:04, 30.08.2020
 **/
class SchedulerTestProduction : Runnable {

    lateinit var schedulerAction: dev.noyzys.sheduler.api.SchedulerAction

    override fun run() = schedulerAction.scheduler.createAndRunTask(
        this, "Task #1", Duration.ofSeconds(15), Duration.ZERO, false) {
        print("Scheduled run in: ${System.currentTimeMillis()}")
    }
}

fun main(args: Array<String>) {
    SchedulerTestProduction()
}

