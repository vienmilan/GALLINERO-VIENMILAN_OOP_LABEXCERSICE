import java.util.Arrays;

public class Exer1_functional{

            public static void main(String[] args) {
                int[] number = {1,2,3,4,5,6,7,8,9,10};


                int sumOfEvens = Arrays.stream(number)
                                        .filter(n->n % 2 == 0)
                                        .sum();

                                        System.out.println("Functional Programming");
                                        System.out.println("Sum of even numbers = "+ sumOfEvens);
            }


}