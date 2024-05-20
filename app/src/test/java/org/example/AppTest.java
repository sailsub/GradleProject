/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test public void checkName() {
        App classUnderTest = new App();
        classUnderTest.setName("Subodh");
        assertEquals(classUnderTest.getName(),"Subodh", "Name should match!!");
    }
}