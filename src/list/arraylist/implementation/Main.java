package list.arraylist.implementation;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

//        for(int i=0; i<numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

        ArrayList.ListIterator li = numbers.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }
}
