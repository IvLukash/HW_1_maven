package goit.edu;

public class Main {
    public static void main(String[] args) {
        MyName myName = new MyName("Ivan", "Lukash");
        System.out.println(Util.parseToJson(myName));
    }
}