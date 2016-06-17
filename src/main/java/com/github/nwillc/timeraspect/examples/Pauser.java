/*
 * foo
 */

package com.github.nwillc.timeraspect.examples;

import com.github.nwillc.timeraspect.TimedMethod;

import java.util.concurrent.TimeUnit;

public class Pauser {
    @TimedMethod
    public void pause(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
}
