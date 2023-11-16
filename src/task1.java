public class task1 {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(9, "ulit");

        Calculator calculator = new Calculator();

        System.out.println(box.a + " from box");
        System.out.println(box.name);
        System.out.println(box1.a);
        System.out.println(box1.name);
        System.out.println(calculator.fac(5));
        box.out(1,5,4,3,6,7,543,6,5,4,3);


        Person person = new Person();

        Person person1 = new Person("vlad",18);

        person1.talk("hello");
        person1.move();

    }
}
