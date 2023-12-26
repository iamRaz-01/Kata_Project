package week1;
//Today's problem: Puzzle 01 of FSSAKataProject
//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1
//and 2
// the first 10
//terms will be:
// 1,2,3,5,8,13,21,34,55,89,…
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. If you have solved this say solved and ping me the answer.
import java.util.ArrayList;

public class Day01 {
    public static void main(String[]args){
        System.out.println(FibonacciSeries.sumOfEvenFibonacci(4000000));
    }
}
 class FibonacciSeries {
    static ArrayList<Numbers> memory = new ArrayList<>();

    public static long fibonacciSeries(int n){
        long value =  Numbers.findKey(memory,n);
        if(value != -1) return value;
        else {
            if(n <= 2 ) return 1 ;
            long fib = fibonacciSeries(n-1) + fibonacciSeries(n-2);
            memory.add(new Numbers(n,fib));
            return fib;
        }
    }
     public static long sumOfEvenFibonacci(int limit){
         long sum = 0 ;
         int n  = 1 ;
         long value  = fibonacciSeries(n);
         while(value<limit){
             if(value%2 ==0){
                 sum+=value;
             }
             value = fibonacciSeries(++n);

         }
         return sum;

     }
}
class Numbers {
    public  Numbers(int key , long value)
    {
        this.value = value;
        this.key = key ;
    }
    int key ;
    long value ;
    public static  long findKey(ArrayList<Numbers> arrayList, int key){
        for (Numbers numbers : arrayList){
            if(key == numbers.key) return numbers.value;
        }
        return -1;
    }
}