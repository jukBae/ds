class DouLinkedList<T> implements List<T> {
  ////////////////////////////////////
  class Node<E> {
    public E m_data;
    public Node<E> pre;
    public Node<E> next;

    public Node(E data) {
      m_data = data;
      pre = null;
      next = null;
    }
  }
  ////////////////////////////////////
  private Node<T> header;
  private int size;

  DouLinkedList() {
    header = new Node<T>(null);
    size = 0;
  }

  public Node<T> nodeFinder(int position) throws NullPointerException {
    if (position >= size) {
      throw new NullPointerException();
    }

    Node<T> ret;

    if (position <= size-position) { // find from head of list
      ret = header.next;

      for (int i = 0; i < position; i++) {
        ret = ret.next;
      }
    
      return ret;
    }
    else {  // find from end of list
      ret = header.pre;

        for (int i = 0; i < size-position-1; i++) {
          ret = ret.pre;
        }

        return ret;
     }
  }

  public void insert(int position, T data) {
    Node<T> tmp;

    if (position == 0) {
      insertFirst(data);
    }
    else if (position == size) {
    	insertLast(data);
    }
    else {
      tmp = nodeFinder(position-1);
    	tmp.next.pre = new Node<T>(data); //tmp.next.pre is new node and connect new node <- after node
      tmp.next.pre.next = tmp.next; //connect new node -> after node
      tmp.next = tmp.next.pre; //connect before node -> new node
      tmp.next.pre = tmp; // connect before node <- new node

      size++;
    }
  }

  public void insertFirst(T data) {
    Node<T> new_node = new Node<T>(data);

    if (isEmpty()) {
    	header.pre = new_node;
    }
    else {
    	header.next.pre = new_node;
    }
    
    new_node.next = header.next;
    header.next = new_node;

    size++;
  }

  public void insertLast(T data) {
    if (isEmpty()) {
    	header.next = header.pre = new Node<T>(data);
    }
    else {
    	header.pre.next = new Node<T>(data);
    	header.pre.next.pre = header.pre;
      header.pre = header.pre.next;
    }
    	
    size++;
   }

  public void remove(int position) {
	  if (position == 0) {
		  removeFirst();
	  }
	  else if (position == size-1) {
		  removeLast();
	  }
	  else {
		  Node<T> tmp = nodeFinder(position);
	  
		  tmp.pre.next = tmp.next;
		  tmp.next.pre = tmp.pre;
	  
		  size--;
	  }
  }
  
  public void removeFirst() throws NullPointerException {
	  if (isEmpty()) {
		  throw new NullPointerException();
	  }
	  
	  if (size == 1) {
		  header.pre = header.next = null;
	  }
	  else {
	    header.next.next.pre = header;
	    header.next = header.next.next;
	  }
	  
	  size--;
  }
  
  public void removeLast() throws NullPointerException {
	  if (isEmpty()) {
		  throw new NullPointerException();
	  }
	  
	  if (size == 1) {
	    header.pre = header.next = null;
    }
	  else {
	    header.pre.pre.next = null;
	    header.pre = header.pre.pre;
	  }
	    
	  size--;
  }

  public void clear() {
	  while(!isEmpty()) {
		  removeFirst();
	  }
  }

  public T get(int position) {
    Node<T> tmp = nodeFinder(position);

    return tmp.m_data;
  }

  public T getFirst() throws NullPointerException {
    if (isEmpty()) {
      throw new NullPointerException();
    }
    else {
      return header.next.m_data;
    }
  }

  public T getLast() throws NullPointerException {
    if (isEmpty()) {
      throw new NullPointerException();
    }
    else {
      return header.pre.m_data;
    }
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public int size() {
    return size;
  }
}