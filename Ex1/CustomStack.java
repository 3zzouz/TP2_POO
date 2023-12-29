package Ex1;
public class CustomStack {
    private int[] stack;
    private int dernier;
    private int taille;

    public CustomStack(int taille) {
        this.stack = new int[taille];
        this.dernier = -1;
        this.taille = taille;
    }

    public void AddElement(int element) {
        if (StackIsFull()) {
            throw new IndexOutOfBoundsException("Stack is full");
        }
        this.stack[++this.dernier] = element;
    }

    public int RemoveElement() throws Exception {
        if (StackIsEmpty()) {
            throw new Exception("Stack is empty");
        }
        return this.stack[this.dernier--];
    }

    public int LastInStack() throws Exception {
        if (StackIsEmpty()) {
            throw new Exception("Stack is empty");
        }
        return this.stack[this.dernier];
    }

    public boolean StackIsEmpty() {
        return this.dernier == -1;
    }

    public boolean StackIsFull() {
        return this.dernier == this.taille - 1;
    }
}