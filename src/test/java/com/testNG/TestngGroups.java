package com.testNG;

import org.testng.annotations.Test;

public class TestngGroups {
	@Test(groups = { "sanity" },priority=2)
    public void testMethodOne() {
        System.out.println("Test method one belonging to sanity.");
    }
 
    @Test(priority=1,groups = { "sanity","Regression" })
    public void testMethodTwo() {
        System.out.println("Test method two belonging to sanity and Regression");
    }
 
    @Test(groups = { "Regression"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to Regression");
    }
    
    @Test(groups = { "sanity" })
    public void testMethodFour() {
        System.out.println("Test method Four belonging to sanity.");
    }
    
    @Test(groups = { "Regression" })
    public void testMethodFive() {
        System.out.println("Test method Five belonging to Regression.");
    }
    
    @Test(groups = { "sanity" })
    public void testMethodsix() {
        System.out.println("Test method six belonging to sanity.");
    }
    
}
