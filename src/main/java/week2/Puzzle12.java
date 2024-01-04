package week2;

public class Puzzle12 {
    public static void main(String [] args){
        System.out.println(remainder(111,4) );
    }

    public static int remainder(int m , int n){
        return m - (m/n * n);
    }
}
