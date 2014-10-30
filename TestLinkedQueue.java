class TestLinkedQueue {
  public static void main(String[] args) {
    LinkedQueue<Integer> test = new LinkedQueue<Integer>();

      for ( int i = 0 ; i < 7; i++ ) {
        test.enqueue(i);
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

    for ( int i = 11 ; i < 17; i++ ) {
      test.enqueue(i);
    }

    System.out.println("//////////////");
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

