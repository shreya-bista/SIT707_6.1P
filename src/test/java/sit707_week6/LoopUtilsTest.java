package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopUtilsTest {
    @Test
    public void testSimpleLoop() {
        int result = LoopUtils.simpleLoop(5);
        Assert.assertEquals(15, result);
    }

    @Test
    public void testSimpleLoopZero() {
        int result = LoopUtils.simpleLoop(0);
        Assert.assertEquals(0, result);
    }
    
    @Test
    public void testSimpleLoopNegative() {
        int result = LoopUtils.simpleLoop(-3);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testConditionalLoop() {
        int result = LoopUtils.conditionalLoop(6);
        Assert.assertEquals(48, result);
    }

    @Test
    public void testConditionalLoopZero() {
        int result = LoopUtils.conditionalLoop(0);
        Assert.assertEquals(1, result);
    }
    
    @Test
    public void testConditionalLoopNegative() {
        int result = LoopUtils.conditionalLoop(-4);
        Assert.assertEquals(1, result);
    }

}