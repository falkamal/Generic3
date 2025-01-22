public class Testklasse {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>(3);
        try{
            stack1.push(1);
            stack1.push(2);
            System.out.println(stack1.list());
            stack1.pop();
            System.out.println(stack1.list());



        }catch(StackFullException | StackEmptyException f){
            System.out.println(f.getMessage());
        }

        Stack<String> stack2 = new Stack<>(3);
        try{
            stack2.push("Ich");
            stack2.push("heiße");
            stack2.push("Faizan");
            System.out.println(stack2.list());
            stack2.pop();
            System.out.println(stack2.list());



        }catch(StackFullException | StackEmptyException f){
            System.out.println(f.getMessage());
        }
    }
}
