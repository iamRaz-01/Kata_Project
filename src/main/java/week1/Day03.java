package week1;

import java.util.ArrayList;

//Puzzle 03 of FSSAKataProject
//The prime factors of 13195 are 5,7,13 and 29. What is the largest prime factor of the number 600851475143?
public class Day03 {
    public static void main(String [] args ){
        Factorization factor =  new Factorization();
        ArrayList<Integer> arr = factor.primeFactors(600851475143L);
        System.out.println(arr);
    }
}

class Factorization{
    public  ArrayList<Integer> primeFactors(long number){
        ArrayList<Integer> factors =  new ArrayList<>();
        int primeValue = 3;
        while(number != 1){
            if(number%primeValue == 0 )factors.add(primeValue);
            while (number%primeValue == 0 ){
                number/=primeValue;
            }
            int nextPrime = primeValue *2;
            for (int i = primeValue+1 ; i < nextPrime ; i++){
                if(isPrime(i)){
                    primeValue = i ;
                    break;
                }
            }

        }

        return  factors;
    }
    private  boolean isPrime(long number){
        boolean check =  true ;
        for(long i = 3 ; i<number ; i+=2 ){
            if(number % i == 0 ){
                check = false;
                break;
            }

        }
        return check;
    }


}