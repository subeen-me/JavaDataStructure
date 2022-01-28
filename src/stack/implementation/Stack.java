package stack.implementation;
import java.util.ArrayList;

// JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
// pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
// 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기

public class Stack<T> {
    // 실제 데이터를 외부에서 접근할 수 없도록 private로 만든다
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) { // 인자를 받아 데이터를 넣는다
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        // 특정 인덱스 값을 리턴해주고 해당 값은 리스트에서 삭제, 맨 마지막에 있는 것이 리턴되도록 한다
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
