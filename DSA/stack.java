import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Clash of Clan");
        stack.push("BGMI");
        stack.push("Call of duty");
        stack.push("Temple run");

        // stack.pop(); // Temple run, it can remove the item from stack 

        System.out.println(stack.peek()); // Temple run, it just to show the item, does not remove any item

        System.out.println(stack.search("BGMI")); // for searching the item from stack

        System.out.println(stack);
    }
}