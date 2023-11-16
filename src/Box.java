public class Box {

    int a = 5;

    int b = 10;



    public Box() {
    }
    public Box(int a, String name, int b) {
        this(a, name);
        this.b = b;

    }

    public Box(int a, String name) {
        if (a >= 0) {
            this.a = a;
        }
        this.name = name;
    }

    public int test(){
        return 10;
    }

    public void out(int ...a ){
        for (int temp: a) {
            System.out.print(temp + " ");
        }
    }

    String name;
}
