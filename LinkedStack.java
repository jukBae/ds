import java.util.ArrayList;

class LinkedStack<T> {
  private ArrayList<T> _node;
  
  public LinkedStack() {
    _node = new ArrayList<T>();
  }

  public void push(T node) {
  	_node.add(node);
  }
  
  public T pop() throws Exception {
    if ( !(_node.isEmpty()) ) {
      T ret;
      ret = _node.get(_node.size()-1);
      _node.remove(_node.size()-1);

      return ret;
    }

    else {
      throw new Exception();
    }
  }
  
  public T peek() throws Exception {
    T ret;

    if ( !(_node.isEmpty()) ) {
      ret = _node.get(_node.size()-1);
      return ret;
    }
    else {
      throw new Exception();
    }
  }
}
