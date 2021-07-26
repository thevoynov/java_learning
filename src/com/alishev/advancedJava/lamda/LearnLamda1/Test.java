package com.alishev.advancedJava.lamda.LearnLamda1;

interface Executable {
    int execute(int x);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10);
        System.out.println(a);
    }
}



public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {

            @Override
            public int execute(int x) {
                System.out.println("Hello!");
                return x + 1;
            }
        });
        runner.run((x) -> {
            System.out.println("Hello_lambda");
            return x + 5;
        });

        runner.run((x) -> x + 5);
    }
}
