package MusicTrends;
/**
 * Creates a chain of multiple nodes.
 * LinkedChain will store entries as Node in a chain.
 *
 * @author yugpatel
 * @version Oct 11, 2026
 *
 * @param <T> the type of entries stored in the chain
 */
public class LinkedChain<T>
{
    private Node<T> head;
    private Node<T> tail;
    private int numberOfEntries;

    /**
     * Creates an empty chain.
     */
    public LinkedChain()
    {
        head = null;
        tail = null;
        numberOfEntries = 0;
    }

    /**
     * Adds a new entry to the front of this chain.
     *
     * @param newEntry the object to be added; must not be null
     * @return true
     * @throws IllegalArgumentException if newEntry is null
     */
    public boolean add(T newEntry)
    {
        requireNonNull(newEntry);
        head = new Node<T>(newEntry, head);
        numberOfEntries++;
        return true;
    }

    /**
     * Adds a new entry to the end of this chain.
     *
     * @param newEntry the object to be added; must not be null
     * @return true
     * @throws IllegalArgumentException if newEntry is null
     */
    public boolean addToEnd(T newEntry)
    {
        requireNonNull(newEntry);
        head = new Node<T>(newEntry, head);
        numberOfEntries++;
        return true;
    }

    /**
     * Removes and returns the first entry in this chain, if possible.
     *
     * @return the removed entry, or null if the chain is empty
     */
    public T remove()
    {
        if (head == null)
        {
            return null;
        }
        T result = head.getData();
        head = head.getNext();
        numberOfEntries--;
        if (head == null)
        {
            tail = null;
        }
        return result;
    }

    /**
     * Removes the first occurrence of a given entry from this chain.
     *
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false if not
     */
    public boolean remove(T anEntry)
    {
        if (anEntry == null || head == null)
        {
            return false;
        }
        if (anEntry.equals(head.getData()))
        {
            head = head.getNext();
            numberOfEntries--;
            if (head == null)
            {
                tail = null;
            }
            return true;
        }
        Node<T> previous = head;
        Node<T> current = head.getNext();
        while (current != null)
        {
            if (anEntry.equals(current.getData()))
            {
                if (current == tail)
                {
                    tail = previous;
                }
                previous.setNext(current.getNext());
                numberOfEntries--;
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    /**
     * Removes all entries from this chain.
     */
    public void clear()
    {
        head = null;
        tail = null;
        numberOfEntries = 0;
    }

    /**
     * Gets the entry at the given position without removing it.
     *
     * @param index the zero-based position
     * @return the entry at that position
     * @throws IndexOutOfBoundsException if index is negative or
     *         index is greater than or equal to size()
     */
    public T get(int index)
    {
        if (index < 0 || index >= numberOfEntries)
        {
            throw new IndexOutOfBoundsException(
                "Index " + index + " out of bounds for size "
                + numberOfEntries);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.getNext();
        }
        return current.getData();
    }

    /**
     * Tests whether this chain contains a given entry.
     *
     * @param anEntry the entry to locate
     * @return true if the chain contains anEntry, or false if not
     */
    public boolean contains(T anEntry)
    {
        return count(anEntry) > 0;
    }

    /**
     * Counts the number of times a given entry appears in this chain.
     *
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears in the chain
     */
    public int count(T anEntry)
    {
        if (anEntry == null)
        {
            return 0;
        }
        int frequency = 0;
        Node<T> current = head;
        while (current != null)
        {
            if (anEntry.equals(current.getData()))
            {
                frequency++;
            }
            current = current.getNext();
        }
        return frequency;
    }

    /**
     * Gets the number of entries currently in this chain.
     *
     * @return the integer number of entries in the chain
     */
    public int size()
    {
        return numberOfEntries;
    }

    /**
     * Sees whether this chain is empty.
     *
     * @return true if the chain has no entries, or false if not
     */
    public boolean isEmpty()
    {
        return numberOfEntries == 0;
    }

    /**
     * Copies every entry in this chain into the given array, first entry
     * first.
     *
     * @param values an array of the correct type to fill; it must have
     *               length at least size()
     * @return the array containing all entries in the chain
     * @throws IllegalArgumentException if values is null or too small
     */
    public T[] toArray(T[] values)
    {
        if (values == null)
        {
            throw new IllegalArgumentException("Array must not be null");
        }
        if (values.length < numberOfEntries)
        {
            throw new IllegalArgumentException(
                "Array of length " + values.length
                + " is too small for " + numberOfEntries + " entries");
        }
        int index = 0;
        Node<T> current = head;
        while (current != null)
        {
            values[index] = current.getData();
            index++;
            current = current.getNext();
        }
        return values;
    }

    /**
     * Returns a readable listing of the chain, first entry first,
     * e.g. "[a, b, c]".
     *
     * @return a string representation of this chain
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null)
        {
            sb.append(current.getData());
            if (current.getNext() != null)
            {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Rejects null entries.
     *
     * @param entry the entry to check
     * @throws IllegalArgumentException if entry is null
     */
    private void requireNonNull(T entry)
    {
        if (entry == null)
        {
            throw new IllegalArgumentException("Cannot add null to chain");
        }
    }

}