public class ArrayStackMain {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the top element
        System.out.println("Top element: " + stack.top()); // Output: Top element: 3

        // Pop elements from the stack
        System.out.print("Popped elements: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // Output: Popped elements: 3 2 1
        }

        // Push more elements onto the stack
        stack.push(4);
        stack.push(5);

        // Test isFull method
        System.out.println("\nIs stack full? " + stack.isFull()); // Output: Is stack full? false

        // Push more elements until the stack grows
        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }

        // Test isFull method after stack growth
        System.out.println("Is stack full? " + stack.isFull()); // Output: Is stack full? false

        // Pop all elements from the stack
        while (!stack.isEmpty()) {
            stack.pop();
        }

        // Test isEmpty method
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? true

    }
    
}
