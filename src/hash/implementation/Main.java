package hash.implementation;

public class Main {
    public static void main(String[] args) {
//        String name = "DaveLee";
//        System.out.println(name.charAt(0));
//        System.out.println((int)(name.charAt(0)));
//        System.out.println((int)(name.charAt(0)) % 20 );

        Hash mainObject = new Hash(20);
        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        System.out.println(mainObject.getData("fun-coding"));
    }
}
