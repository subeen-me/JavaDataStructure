package list.arraylist.implementation;

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
}
