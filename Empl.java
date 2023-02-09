import java.lang.String;
public class Empl {
    int id;
    String dept;

    public Empl(int idd, String dep) {
        id = idd;
        dept = dep;
    }

    public static void main(String[] args) {
        Empl vro = new Empl(34,"boomer");
        System.out.println(vro.dept);
    }
}
