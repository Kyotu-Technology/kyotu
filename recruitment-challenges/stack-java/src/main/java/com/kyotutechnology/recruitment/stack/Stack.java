package com.kyotutechnology.recruitment.stack;

/**
 * A last-in-first-out (LIFO) collection of elements.
 */
public interface Stack<E> {

    /**
     * Pushes an element onto the top of this stack.
     */
    void push(E element);

    /**
     * Removes and returns the element at the top of this stack.
     */
    E pop();

    /**
     * Returns the element at the top of this stack without removing it.
     */
    E peek();

    /**
     * Returns the number of elements in this stack.
     */
    int size();

    /**
     * Returns {@code true} if this stack contains no elements.
     */
    boolean isEmpty();

    /**
     * Removes all elements from this stack.
     */
    void clear();
}
