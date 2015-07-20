package org.workshop;

import org.testng.annotations.Test;

import javax.naming.OperationNotSupportedException;

import static org.testng.Assert.assertEquals;

public class SumTest {

    private Sum sum = new Sum();

    @Test
    public void sum1(){
        assertEquals(1, sum.sumFrom1To(1));
    }

    @Test
    public void sum2(){
        assertEquals(3, sum.sumFrom1To(2));
    }

    @Test
    public void sum10(){
        assertEquals(55, sum.sumFrom1To(10));
    }

    @Test(expectedExceptions = OperationNotSupportedException.class)
    public void sumFailed(){
        sum.sumFrom1To(-1);
    }

}
