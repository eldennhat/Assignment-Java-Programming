package Bai3;

public class Test3 {
    public static void main(String[] args) {
        //a.
        Pair<String, Integer> id = new OrderedPair<>("MSSV", 121026);
        //b.
        Pair<String, String> name = new OrderedPair<>("Fullname", "Nhat Minh Quang");
        System.out.println("Student Infomation");
        System.out.println(id.getKey() + ": " + id.getValue());
        System.out.println(name.getKey() + ": " + name.getValue());
    }
}
