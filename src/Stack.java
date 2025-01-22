public class Stack<T> {
    private Object[] array;             //declaring the Object-Array as an attribute
    private int lastIndex;              //the last index of the array, that is not null

    public Stack() {
        array = new Object[10];
        lastIndex = -1;
    }
    public Stack(int länge) {
        array = new Object[länge];
        lastIndex = -1;
    }
    public void push(T element) throws StackFullException {
        if (lastIndex == array.length - 1) {
            throw new StackFullException();
        }else {
            array[++lastIndex] = element;
        }
    }

    public T pop() throws StackEmptyException {
        if (lastIndex == -1) {
            throw new StackEmptyException();
        }else {
            array[lastIndex] = null;
            lastIndex--;
            return (T) array[lastIndex];
        }
    }

    public T peek() throws StackEmptyException {
        if (lastIndex == -1) {
            throw new StackEmptyException();
        }else {
            return (T) array[lastIndex];
        }
    }

    public String list(){
        String list = "";
        for (int i = 0; i <= lastIndex; i++) {
            if (array[i] != null) {
                list += array[i].toString();
                if(i<lastIndex){
                    list += ";";
                }
            }
        }
        return list;
    }

}
