package tom;

public interface StackInterface {

    /**
     * Adds the given item to the top of the stack.
     */
    Object push(Object item);

    /**
     * Removes the top item from the stack and returns it.
     * 
     * @exception java.util.NoSuchElementException if the stack is empty.
     */
    Object pop();

    /**
     * Returns the top item from the stack without popping it.
     * 
     * @exception java.util.NoSuchElementException if the stack is empty.
     */
    Object peek();

    /**
     * Returns the number of items currently in the stack.
     */
    int size();


}