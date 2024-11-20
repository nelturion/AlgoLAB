package tests.unit.java.lab0;

import main.java.labs.lab0.task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTask1 {
    private task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new task1();
    }

    @Test
    void sum() {
        int sum = task1.sum(10, 15);
        Assertions.assertEquals(25, sum);
    }
}
