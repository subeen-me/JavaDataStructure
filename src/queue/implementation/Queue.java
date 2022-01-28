package queue.implementation;
import java.util.ArrayList;

// JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
// dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함
// 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기

public class Queue<T> {
    private ArrayList<T> queue = new ArrayList<T>(); // 내부에 큐를 위한 저장공간 만듬

    public void enqueue(T item) { // 추가하는 메서드
        queue.add(item);
    }
    public T dequeue() { // 데이터를 꺼내오는 것이기 때문에, 인자 없음
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0); // 비어있지 않으면 맨 앞의 데이터(해당 데이터)를 삭제
    }

    public boolean isEmpty() { // 비어있으면 true를 리턴하는 메서드
        return queue.isEmpty();
    }
}
