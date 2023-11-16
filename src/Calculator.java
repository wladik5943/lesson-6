public class Calculator {
    int weigt;
    int cost;
    int color;

    public Calculator() {

    }

    public Calculator(int weigt, int cost, int color) {
        this.weigt = weigt;
        this.cost = cost;
        this.color = color;
    }

    public int summ(int a, int b) {
        return a + b;
    }

    public int razn(int a, int b) {
        return a - b;
    }

    public int proiz(int a, int b) {
        return a * b;
    }

    public int del(int a, int b) {
        return a / b;
    }

    public int fact(int a) {
        int fact = 1;
        for (int i = 2; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public int fac(int a){
        if(a != 1){
            return fac(a - 1) * a;
        }
        return 1;
    }

}
