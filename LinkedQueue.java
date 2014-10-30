import java.util.ArrayList;

class LinkedQueue<T> {
  private ArrayList<T> _node;

  public LinkedQueue() {
    _node = new ArrayList<T>();
  }

  public void enqueue(T node) {
      _node.add(node);
  }

  public T dequeue() throws Exception {
    T ret;

    if ( !(_node.isEmpty()) ) {
      ret = _node.get(0);
      _node.remove(0);
      return ret;
    }
    else {
      throw new Exception();
    }
  }

  public T peek() throws Exception {
    T ret;

    if ( !(_node.isEmpty()) ) {
      ret = _node.get(0);
      return ret;
    }
    else {
      throw new Exception();
    }
  }

}

