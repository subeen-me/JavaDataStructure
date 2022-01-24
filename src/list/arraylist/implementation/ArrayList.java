package list.arraylist.implementation;

import java.util.ListIterator;

public class ArrayList {
    private int size = 0; // 몇 개의 데이터가 리스트에 들어있는가
    private Object[] elementData = new Object[100];

    // add 메소드를 응용
    public boolean addFirst(Object element) {
        return add(0, element);
    }

    public boolean addLast(Object element) {
        elementData[size] = element; //element가 들어오면
        size++;
        return true;
    }

    public boolean add(int index, Object element) {
        for(int i = size - 1; i >=index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public String toString() {
        String str = "[";
        for(int i=0; i<size; i++) {
            str += elementData[i];
            if(i < size -1) {
                str += ",";
            }
        }
        return str + "]";
    }

    public Object remove(int index) {
        //삭제한 값을 removed에 저장
        Object removed = elementData[index];
        for(int i = index+1; i<= size-1; i++) {
            elementData[i -1] = elementData[i];
        }
        size--;
        elementData[size] = null;
        return removed;
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size-1);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object o) {
        for(int i=0; i<size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1; //찾는 값이 없을 때 -1을 리턴
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private int nextIndex = 0; //변수 초기화

        public boolean hasNext() {
            return nextIndex < size();
        }

        //next 메소드가 호출될 때 마다 nextIndex가 1씩 증가해야 한다
        public Object next() {
//          Object returnData = elementData[nextIndex];
//          nextIndex++;
//          return returnData;
            // 위의 코드를 간단히 정리. nextIndex가 현재 가지고 있는 값이
            // 일단 사용되고 그 다음에 nextIndex 값이 ++로 1이 증가하게 된다.
            return elementData[nextIndex++];
        }


    }
}


