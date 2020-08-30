package dev.noyzys.scheduler.api.structure;

import dev.noyzys.scheduler.api.SchedulerTask;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.RunnableScheduledFuture;

/*
 * @author: NoyZys on 11:56, 30.08.2020
 */

/**
 * An Interface this represents a task scheduled future.
 * Written api version in: Java
 */
public interface ScheduledFutureService<V> extends RunnableScheduledFuture<V> {

    /**
     * Scheduled task related to this [RunnableScheduledFuture]
     */
    @NotNull
    SchedulerTask task();
}
