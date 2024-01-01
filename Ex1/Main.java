package Ex1;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.StackIsEmpty());

        // Add elements to the stack
        stack.AddElement(1);
        stack.AddElement(2);
        stack.AddElement(3);

        // Check if the stack is full
        System.out.println("Is the stack full? " + stack.StackIsFull());

        // Print the last element in the stack
        try {
            System.out.println("Last element in the stack: " + stack.LastInStack());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Remove elements from the stack
        try {
            System.out.println("Removed element: " + stack.RemoveElement());
            System.out.println("Removed element: " + stack.RemoveElement());
            System.out.println("Removed element: " + stack.RemoveElement());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the stack is empty again
        System.out.println("Is the stack empty? " + stack.StackIsEmpty());
    }
}