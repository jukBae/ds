public interface Queue<T> {
  public void enqueue(T node);
  public T dequeue() throws Exception;
  public T peek() throws Exception;
}
