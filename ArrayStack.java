class ArrayStack {
  private int top_num;
  private int max_size;
  private int[] node;
  
  public ArrayStack(int _max_size) {
    top_num = 0;
    max_size = _max_size;
    node = new int[max_size];
  }

  public ArrayStack() {
    top_num = 0;
    max_size = 5;
    node  = new int[max_size];
  }

  public void push(int _node) throws Exception {
  	if ( top_num < max_size ) {
  		node[top_num] = _node;
  		top_num++;
  	}
  	else {
   		throw new Exception();
  	}
  }
  
  public int pop() throws Exception {
    if (top_num > 0 ) {
      int ret;
      ret = node[top_num-1];
      node[top_num-1] = 0;
      top_num--;

      return ret;
    }

    else {
      throw new Exception();
    }
  }

  
  public int peek() throws Exception {
    int ret;

    if ( top_num > 0 ) {
      ret = node[top_num-1];
      return ret;
    }
    else {
      throw new Exception();
    }
  }
  
  public static void main(String[] args) {
    ArrayStack test = new ArrayStack(5);

    for( int i = 0; i < 6; i++ ) {
      try {
        test.push(i);
      } catch(Exception e) {
        System.out.println("push error");
      }
    }

    int tmp;
    try {
      tmp = test.peek();
      System.out.println(tmp);
    } catch(Exception ex) {
      System.out.println("peek error");
    }


    for( int i = 0; i < 6; i++ ) {
      try {
        System.out.println("test [" + i + "] = " + test.pop());
      } catch(Exception ex) {
        System.out.println("pop error");
      }
   }
    try {
      tmp = test.peek();
      System.out.println(tmp);
    } catch(Exception ex) {
      System.out.println("peek error");
    }
  }
}
