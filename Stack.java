import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> list;

    public void push(T element) {
        list.add(list.size(), element);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public T top() {
        return list.get(list.size() - 1);
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public

    Stack() {
        list = new ArrayList<T>();
    }
}
