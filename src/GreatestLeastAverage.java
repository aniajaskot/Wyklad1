import java.util.Scanner;

public class GreatestLeastAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int first = getValue(scan);
        System.out.println("Podaj druga liczbe");
        int second = getValue(scan);
        System.out.println("Podaj trzecia liczbe");
        int third = getValue(scan);

        System.out.println("Największa : " + greatest(first, second, third));
        System.out.println("Najmniejsza : " + least(first, second, third));
        System.out.println("Srednia : " + average(first, second, third));

    }

    private static int greatest(int first, int second, int third) {
        if(first>second && first>third){
            return first;
        } else if(second > first && second > third){
            return second;
        } else {
            return third;
        }
    }

    private static int least (int first, int second, int third ){
        if(first < second && first < third){
            return first;
        } else if (second < third && second < first){
            return second;
        } else {
            return third;
        }
    }

    private static double average(int first, int second, int third){
        return ((double)(first + second + third)) / 3;
    }

    private static int getValue(Scanner scan){
        int value = scan.nextInt();
        scan.nextLine();
        return value;
    }
}
