import java.util.Stack;

class MainStack {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Batman arkham");
        stack.push("Hollow knight");
        stack.push("Deadcell");
        stack.push("Limbo");
        stack.push("Inside");
        stack.push("Middle earth");
        stack.push("Doom");
        stack.push("FFVII");
        System.out.println(stack.empty());
        
        String lastGame = stack.pop();
        System.out.println("Last Game pop was " + lastGame);
        System.out.println("Stack of all game left are \n" + stack);
        System.out.println("Check the last element without poping it " + stack.peek());

        System.out.println("The position of Limbo in stack is " + stack.search("Limbo"));

        
    }
}