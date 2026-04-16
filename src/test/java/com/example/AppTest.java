package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddResume() {
        App.addResume("Test User", "test@gmail.com", "Testing");

        assertFalse(App.getResumes().isEmpty());
    }

    @Test
    public void testResumeCount() {
        int initialSize = App.getResumes().size();
        App.addResume("Another User", "a@gmail.com", "Java");

        assertEquals(initialSize + 1, App.getResumes().size());
    }
}
