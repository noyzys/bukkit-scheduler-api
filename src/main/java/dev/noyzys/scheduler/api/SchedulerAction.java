package dev.noyzys.scheduler.api;

/*
 * @author: NoyZys on 12:09, 30.08.2020
 */

import org.jetbrains.annotations.NotNull;

/**
 * An interface that represents the main actions on task.
 * Written api version in: Kotlin
 */
public interface SchedulerAction {

    /**
     * Basic implement scheduler function.
     */
    @NotNull
    Scheduler scheduler();
}
