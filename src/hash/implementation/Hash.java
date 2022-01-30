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

}
