public class CArrayDeque<T> {
  
  private T[] items;
  private int front;
  private int back;
  private int size;
  final static int CAPACITY=10;
  
  // Default constructor
  public  CArrayDeque() {
    front = 0;
    back = CAPACITY - 1;
    size = 0;
    items = (T[]) new Object[CAPACITY];
  }
  

  
  /** Sees whether this queue is empty.
   @return  True if the queue is empty, or false if not. */
  public boolean isEmpty() {
    if (size == 0)
    {
      return true;
    }
    
    return false;
  }

  /** Adds a new entry to this queue at front.
    @param newEntry  The object to be added as a new entry.
    @return  True if the addition is successful, or false if not. */
  public boolean addFront(T newEntry) {
    if (size < CAPACITY)
    {     
      if(front == 0)
      {
        front = CAPACITY-1;
      }
      else
      {
        front--;
      }      
      items[front] = newEntry;
      size++;
      return true;
    }       
    return false;
  }
  
  /** Adds a new entry to this queue at back.
    @param newEntry  The object to be added as a new entry.
    @return  True if the addition is successful, or false if not. */  
  public boolean addBack(T newEntry) {
    if(size < CAPACITY)
    {
      if(back == CAPACITY - 1)
      {
        back = 0;
      }
      else
      {
        back++;
      }
      items[back] = newEntry;     
      size++;
    }
    return false;
  }
  
  /** Removes the entry at front from the queue, if possible.
    @return True if the removal was successful, or false if not. */
  public boolean removeFront() {
    if(size > 0)
    {  
      items[front] = null; 
      if(front == CAPACITY-1)
      {
        front = 0;
      }
      else
      {
        front++;
      }
            
      size--;
      return true;
    }
    return false;

  }
  
  /** Removes the entry at back from the queue, if possible.
    @return True if the removal was successful, or false if not. */
  public boolean removeBack() {
    items[back] = null;
    if(back == 0)
      {
        back = CAPACITY - 1;
      }
      else
      {
        back--;
      }
      size--;
      return false;
  }
  
  /** Retrieve the entry at front in the queue, if possible.
    @return the front entry if the retrieve was successful, or null if not. */
  public T retrieveFront() {    
      if(size > 0) {
      return items[front];  
      }
      return null;
  }

  /** Retrieve the entry at back in the queue, if possible.
    @return the front entry if the retrieve was successful, or null if not. */
  public T retrieveBack() {
    if (size > 0)
    {    
      return items[back];     
    }
    return null;
  }
  
  /** Retrieves all entries that are in this queue.
    @return  A newly allocated array of all the entries in this queue. */
  public T[] toArray(){
    T[] temp = (T[]) new Object[CAPACITY];
    for (int i = 0; i < temp.length; i++)
    {
      temp[i] = items[i];
    }
    return temp;      
  }
  
}