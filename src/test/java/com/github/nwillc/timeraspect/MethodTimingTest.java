/*
 * foo
 */

package com.github.nwillc.timeraspect;

import com.github.nwillc.timeraspect.examples.Pauser;
import org.junit.Test;

import java.util.logging.Logger;

public class MethodTimingTest {
    private static final Logger LOGGER = Logger.getLogger(MethodTimingTest.class.getName());

    @Test
    public void testOutput() throws Exception {
        Pauser pauser = new Pauser();
        pauser.pause(2);
    }

}
