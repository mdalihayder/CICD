package com.qa.maven_git_jenkin;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	TestCase RunClass = new TestCase();
    	RunClass.beforeTest();
    	RunClass.TestCase1();
    	RunClass.afterTest();
    }
}
