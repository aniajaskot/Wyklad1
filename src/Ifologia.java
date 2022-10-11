public class Ifologia {
    public static void main(String[] args) {
        int number = -5;
        if(number %2 ==0 ){
            System.out.printf("Liczba %d jest parzysta\n", number);
        } else if (number % 2 == 1){
            System.out.printf("Liczba %d jest nieparzysta \n", number);
        }else if (number % 2 == -1){
            System.out.printf("Liczba %d jest ujemna i nieparzysta\n", number);
        }

        switch (number % 2){
            case 0:
                System.out.printf("Liczba %d jest parzysta\n", number);
                break;
            case 1:
                System.out.printf("Liczba %d jest nieparzysta \n", number);
                break;
            case -1:
                System.out.printf("Liczba %d jest ujemna i nieparzysta\n", number);
                break;
        }
    }
}
