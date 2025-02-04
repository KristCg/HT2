package ht2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StackTest {

    IStack<Integer> stack = new StackWithVector<>();

    @Test
    void testPushAndPop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testPeek() {
        stack.push(5);
        assertEquals(5, stack.peek());
        stack.push(8);
        assertEquals(8, stack.peek());
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testPopEmptyStack() {
        assertThrows(Exception.class, () -> stack.pop());
    }
}
