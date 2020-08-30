package dev.noyzys.scheduler.api;


import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;

/*
 * @author: NoyZys on 11:46, 30.08.2020
 */

/**
 * An interface that represents the main activities and functions to send the job.
 * Written api version in: Java
 */
public interface Scheduler {

    /*
      Create and run [SchedulerTask]

      @param plugin Plugin that created the task
     * @param name Name of the task
     * @param delay Time to pass before the task start.
     * @param isAsync True if the task run asynchronous, false otherwise.
     * @param runnable [Runnable] to be invoked.
     * @return Configured [SchedulerTask]
     */
    void createAndRunTask(@NotNull final Plugin plugin, @NotNull final String name, @NotNull final Duration delay
            , @NotNull final Duration interval, final boolean isAsync, @NotNull Runnable runnable);

}


