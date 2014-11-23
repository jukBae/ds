public interface List<T> {
  public void insert(int position, T data);
  public void insertFirst(T data);
  public void insertLast(T data);
  public void remove(int position);
  public void clear();
  public T get(int position);
  public T getFirst();
  public T getLast();
  public boolean isEmpty();
  public int size();
}

