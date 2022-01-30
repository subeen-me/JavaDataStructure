package hash.implementation;

public class Hash {
    public Slot[] hashTable;

    public Hash(Integer size) { // 생성자로 미리 배열의 사이즈를 할당할 수 있도록 한다
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key; // 내부 클래스 슬롯
        String value;
        Slot next; // 포인터
        Slot(String key, String value) { // 생성자
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if(findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value); // key 값을 같이 저장
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key); // key 를 넣으면 address를 hashFunc로 가져오고
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if(findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }

}
