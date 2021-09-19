package benchmark;

public class Benchmark {
    
    public static void main(String[] args) {
        byte a = 127; // -128:127
        int b;
        long start = System.currentTimeMillis(); //начало
        for (long i = 1; i < 2147483647; ++i) {
            b = a * a;
        }
        long finish = System.currentTimeMillis(); //конец
        long elapsed = finish - start; //время
        System.out.println(elapsed + " миллисек.");
    }    
}
