package com.sve.tests;

import com.sve.Cylinder;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class CylinderTests {

    @Test
    public void cylinderAllFieldsMustBeInitializedProperly() {

        // Arrange
        Cylinder test = new Cylinder("Test", "2.00", "4.00", "6.00", "10.00");

        // Assert
        Assert.assertEquals("Cylinder name must be \"Test\"", "Test", test.getName());
        Assert.assertEquals("Cylinder width must be 2.00", new BigDecimal("2.00"), test.getWidth());
        Assert.assertEquals("Cylinder depth must be 4.00", new BigDecimal("4.00"), test.getDepth());
        Assert.assertEquals("Cylinder height must be 6.00", new BigDecimal("6.00"), test.getHeight());
        Assert.assertEquals("Cylinder price must be 10.00", new BigDecimal("10.00"), test.getPrice());
    }
}