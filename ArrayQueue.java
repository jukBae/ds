class ArrayQueue {
  private int front;
  private int rear;
  private int cnt;
  private int size;
  int[] node;

  public ArrayQueue() {
    front = rear = cnt = 0;
    size = 5;
    node = new int[size];
  }
  public ArrayQueue(int _size) {
    front = rear = cnt = 0;
    size = _size;
    node = new int[size];
  }
  public void enqueue(int _node) throws Exception {
    if ( cnt < size ) {
      node[rear] = _node;
      rear = (rear+1)%size;
      cnt++;
    }
    else {
      throw new Exception();
    }
  }

  public int dequeue() throws Exception {
    int ret;

    if ( cnt > 0 ) {
      ret = node[front];
      node[front] = 0;
      front = (front+1)%size;
      cnt--;
      return ret;
    }
    else {
      throw new Exception();
    }
  }

  public int peek() throws Exception {
    if ( cnt > 0 ) {
      return node[front];
    }
    else {
      throw new Exception();
    }
  }

  public static void main(String[] args) {
    ArrayQueue test = new ArrayQueue(6);

    try {
      for ( int i = 0 ; i < 7; i++ ) {
        test.enqueue(i);
      }
    } catch(Exception ex) {
      System.out.println("error enqueue");
    }

    try {
      for ( int i = 0; i < 7; i++ ) {
        System.out.println(test.dequeue());
      }
    } catch(Exception ex) {
      System.out.println("error dequeue");
    }

    try {
      System.out.println(test.peek());
    } catch(Exception ex) {
      System.out.println("error peek");
    }
    try {
      for ( int i = 11 ; i < 17; i++ ) {
        test.enqueue(i);
      }
    } catch(Exception ex) {
      System.out.println("error enqueue");
    }

    try {
      for ( int i = 0; i < 3; i++ ) {
        System.out.println(test.dequeue());
      }
    } catch(Exception ex) {
      System.out.println("error dequeue");
    }

    try {
      for ( int i = 21 ; i < 25; i++ ) {
        test.enqueue(i);
      }
    } catch(Exception ex) {
      System.out.println("error enqueue");
    }

    try {
      for ( int i = 0; i < 7; i++ ) {
        System.out.println(test.dequeue());
      }
    } catch(Exception ex) {
      System.out.println("error dequeue");
    }
  }
}

