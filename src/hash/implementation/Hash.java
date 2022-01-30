package hash.implementation;

public class Hash {
    public Slot[] hashTable;

    public Hash(Integer size) { // 생성자로 미리 배열의 사이즈를 할당할 수 있도록 한다
        this.hashTable = new Slot[size];
    }

    public class Slot { // 내부 클래스 슬롯
        String value;
        Slot(String value) { // 생성자
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key); // key 를 넣으면 address를 hashFunc로 가져오고
        if(this.hashTable[address] != null) { // 해당 슬롯이 있다면
            return this.hashTable[address].value; // value를 리턴
        } else { // 해당 address에 객체가 없다면 null
            return null;
        }
    }

}
