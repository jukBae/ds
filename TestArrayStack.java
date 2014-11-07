class TestArrayStack {
  public static void main(String[] args) {
    ArrayStack<Integer> test = new ArrayStack<Integer>();

    for( int i = 0; i < 6; i++ ) {
        test.push(i);
    }

  
    for( int i = 0; i < 7; i++ ) {
      try {
        System.out.println(test.pop());
      } catch(Exception ex) {
        System.out.println("pop error");
      }
    }

    try {
      System.out.println(test.peek());
    } catch(Exception ex) {
      System.out.println("peek error");
    }


    for( int i = 0; i < 6; i++ ) {
        test.push(i);
    }

  
    for( int i = 0; i < 7; i++ ) {
      try {
        System.out.println(test.pop());
      } catch(Exception ex) {
        System.out.println("pop error");
      }
    }

    try {
      System.out.println(test.peek());
    } catch(Exception ex) {
      System.out.println("peek error");
    }
  }
}
