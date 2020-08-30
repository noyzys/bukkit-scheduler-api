package dev.noyzys.scheduler.api;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;

/*
 * @author: NoyZys on 11:52, 30.08.2020
 */

/**
 * An interface this represents a task that may have been submitted or not.
 * Written api version in: Java
 */
public interface SchedulerTask {

    /**
     * Plugin of Bukkit that created the task.
     */
    @NotNull
    Plugin plugin();

    /**
     * Name of task
     */
    @NotNull
    String name();

    /**
     * Time to pass before the task start.
     */
    Duration delay();

    /**
     * Interval of task repetition.
     * If Duration is: [Duration.ZERO], this task will not repeat.
     */
    Duration interval();

    /**
     * Asynchronous and Synchronous state.
     * True if the task run async, false if the task run sync.
     */
    boolean isAsync();

    /**
     * [Runnable] to be invoked.
     */
    Runnable runnable();
}
