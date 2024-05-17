package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopUtilsTest {
    
    // Test for simpleLoop function
    @Test
    public void testSimpleLoop() {
        
        Assert.assertEquals(10, ConditionalLoopUtils.simpleLoop(5));
        
        Assert.assertEquals(0, ConditionalLoopUtils.simpleLoop(0));
        
        Assert.assertEquals(0, ConditionalLoopUtils.simpleLoop(1));
        
        // Additional test cases for edge coverage
        Assert.assertEquals(0, ConditionalLoopUtils.simpleLoop(-5));
        
        Assert.assertEquals(499500, ConditionalLoopUtils.simpleLoop(1000));
    }
    
    // Test for conditionalLoop function
    @Test
    public void testConditionalLoop() {
        
        Assert.assertEquals(6, ConditionalLoopUtils.conditionalLoop(5));
        
        Assert.assertEquals(20, ConditionalLoopUtils.conditionalLoop(10));
        
        Assert.assertEquals(0, ConditionalLoopUtils.conditionalLoop(0));
        
        Assert.assertEquals(0, ConditionalLoopUtils.conditionalLoop(1));
        
        // Additional test cases for edge coverage
        Assert.assertEquals(0, ConditionalLoopUtils.conditionalLoop(-5));
        
        Assert.assertEquals(600, ConditionalLoopUtils.conditionalLoop(50)); // Correct expected result
    }
}
