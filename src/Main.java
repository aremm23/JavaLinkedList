public class Main {
    public static void main(String []args){
        MyList<String> a = new MyList<>();
        a.add("Hello");
        a.add("world");
        a.add("!");
        a.add("Hello");
        a.add("world");
        a.add("!");
        a.print();
        a.deleteElement("Hello");
        System.out.println("   ");
        a.print();
        System.out.println(a.toString());

        MyList<Integer> b = new MyList<>();
        b.add(4);
        b.add(1);
        b.add(213123);
        b.print();
    }
}
