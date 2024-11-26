import java.util.Scanner;

public class Loops {
    Scanner input = new Scanner(System.in);

    public void multiplicationTable(){
        int size = 12;
        for(int i = 0; i <= size; i++){
            for(int j = 0; j <= size; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    public void greatestCommonDivisor(){
        System.out.println("Enter first positive numeber: ");
        int n1 = input.nextInt();

        System.out.println("Enter second positive numeber: ");
        int n2 = input.nextInt();

        int gcd = 1;
        for(int k = 1; k <= n1; k++){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
        }
        System.out.println("Greatest Common Divisor is: " + gcd);
    }
    public void futureTuition(){
        double tuition = 10000;
        double targetTuition = 20000;
        double yearlyIncrease = .07;
        int years = 0;

        while (tuition < targetTuition){
            tuition += tuition * yearlyIncrease;
            years++;
        }
        System.out.println(years + " years to double tuition");//11 years

    }
}
