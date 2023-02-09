public class Furniture {
    int width;
    int height;

    void display(String item) {
        System.out.println(item + " width " + width + " height " + height);
    }

    public static void main(String[] args) {
        Chair wow = new Chair();
        wow.foo();
    }
}

class Chair extends Furniture {
    void foo() {
        width = 19;
        height = 54;
        display("chair");
    }

    private void display(java.lang.String chair) {
    }
}

class Table extends Furniture {
    void foo() {
        width = 89;
        height = 94;
        display("Table");
    }

    private void display(java.lang.String table) {
    }
}

class Almirah extends Furniture {
    void foo() {
        width = 18;
        height = 94;
        display("Almirah");
    }

    private void display(java.lang.String almirah) {
    }

}
