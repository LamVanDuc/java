package Session5;

public class WhileLoop {
    public static void main(String[] args){
        int i =0  ,sum = 0 ;

        // interates until the sum of first 10 even numbers is computed
        while (i <=20){
            if (i% 2 ==0){
                sum += i;
            }
            i ++;
        }


        System.out.println("Sum of first 10 even numbers is : "+ sum);
    }
}
