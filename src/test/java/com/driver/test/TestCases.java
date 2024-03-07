package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.driver.Product;

import junit.framework.Assert;

public class TestCases {

    private Product p = new Product();

    @Test
    public void validateTest(){
      Assert.assertEquals(6, p.product(2, 3));
    }
     
}
