public class Person {
    String fullName;
    int age;
    public void talk(String text){
        System.out.println(fullName);
        System.out.println(age);
        System.out.println(text);
    }

    public Person(){

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName);
        int walk = 4;
        System.out.println(walk);
    }
}
