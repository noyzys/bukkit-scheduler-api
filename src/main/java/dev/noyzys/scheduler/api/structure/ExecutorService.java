package dev.noyzys.scheduler.api.structure;

/*
 * @author: NoyZys on 11:58, 30.08.2020
 */

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * An main interface this represents a scheduler API manager implement interface [ScheduledExecutorService].
 * Written api version in: Java
 * TODO: 30.08.2020 (End api at the end of 2020)
 */
public interface ExecutorService extends ScheduledExecutorService {

    @NotNull
    <V> ScheduledFutureService<V> schedule(
            final Callable<V> callable,
            final Long delay,
            final TimeUnit unit);

    @NotNull
    @Override
    <V> ScheduledFuture<V> schedule(
            @NotNull Callable<V> callable,
            long delay,
            @NotNull TimeUnit unit);

    @NotNull
    @Override
    ScheduledFuture<?> scheduleAtFixedRate(
            @NotNull Runnable command,
            long initialDelay,
            long period,
            @NotNull TimeUnit unit);

    @NotNull
    @Override
    ScheduledFuture<?> scheduleWithFixedDelay(
            @NotNull Runnable command,
            long initialDelay,
            long delay,
            @NotNull TimeUnit unit);
}
