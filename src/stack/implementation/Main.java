package stack.implementation;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> ms = new Stack<Integer>();
        ms.push(1);
        ms.push(2);
        System.out.println(ms.pop());
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
    }
}
