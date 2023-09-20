package tom;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Base test for any class that implements the Stack interface.
 */
public class StackTest {

    /**
     * The stack to use in all the tests: set this in subclasses.
     */
    protected Stack s;

    @Before
    public void setUp() throws Exception {
        s = new Stack();
    }

    @Test
    public void testNewStackIsEmpty() {
        
        assertEquals(0, s.size());
    }

    @Test
    public void testPushesToEmptyStack() {
        int numberOfPushes = 8;
        for (int i = 0; i < numberOfPushes; i++) {
            s.push("zzz");
        }
        assertEquals(numberOfPushes, s.size());
    }

    @Test
    public void testPushThenPop() {
        Object message = "hello";
        s.push(message);
        assertEquals(message, s.pop());
    }

    @Test
    public void testPushThenPeek() {
        Object message = "hello";
        s.push(message);
        Object size = s.size();
        assertEquals(message, s.peek());
        assertEquals(size, s.size());
    }

    @Test
    public void testPoppingDownToEmpty() {
        int numberOfPushes = 8;
        for (int i = 0; i < numberOfPushes; i++) {
            s.push("zzz");
        }
        for (int i = 0; i < numberOfPushes; i++) {
            s.pop();
        }
        assertEquals(0, s.size());
    }

}