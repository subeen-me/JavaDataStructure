package list.linkedlist.implementation;

public class LinkedList {
    private Node head; // 누가 첫번째 노드인가
    private Node tail; // 누가 끝에 있는 노드인가
    private int size = 0; // 몇 개의 엘리먼트가 이 리스트에 포함되어있는가

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null) { // 다음 노드가 존재하지 않는다면
            tail = head; // 마지막 노드는 head와 같다
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);
        if(size == 0) { // 데이터가 존재하지 않는다면
            addFirst(input); // addFirst 메서드로 데이터를 넣어도 좋다
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    private class Node {
        private Object data; // 각각의 노드가 저장할 데이터
        private Node next; // 누가 다음 노드인가를 가르킨다
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
        public String toString() {
            return String.valueOf(this.data);
        }
    }
}
