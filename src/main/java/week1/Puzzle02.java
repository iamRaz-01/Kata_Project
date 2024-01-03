package week1;
//Puzzle02 of FSSAKataProject
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9.The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000
public class Puzzle02 {
    public static void main(String[]args){
        int [] arr  = {3,5};
        System.out.println(NaturalNumbers.sumOfNaturalNumbers(1000,arr));
    }
}
class NaturalNumbers{

    public static int sumOfNaturalNumbers(int limit , int[] divisibleBy){
        int sum = 0 ;
        int n =  divisibleBy.length;
        for(int i = 1 ; i < limit ; i++){
            switch (n){
                case 1 : if(i%divisibleBy[0] ==0){sum+=i;break;}
                case 2 : if(i%divisibleBy[0] ==0 || i%divisibleBy[1] ==0 ){sum+=i;break;}
                default: for(int num : divisibleBy){
                    if(i%num ==0){
                        sum+=i;
                    }
                }
                break;
            }
        }
        return sum;

    }

}
