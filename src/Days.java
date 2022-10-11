import java.util.Random;

public class Days {
    public static void main(String[] args) {
        Random random = new Random();

        int day = random.nextInt(7) + 1;

        System.out.println("Numer dnia: " + day);
        String dayName = getDayName(day);
        System.out.println("Dzień tygodnia: " + dayName);

        dayInfo(day);
    }

    private static String getDayName(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Poniedzialek";
                break;
            case 2:
                dayName = "Wtorek";
                break;
            case 3:
                dayName = "Sroda";
                break;
            case 4:
                dayName = "Czwartek";
                break;
            case 5:
                dayName = "Piatek";
                break;
            case 6:
                dayName = "Sobota";
                break;
            case 7:
                dayName = "Niedziela";
                break;
            default:
                dayName = "Nieznany dzien";
        }
        return dayName;
    }

    private static void dayInfo(int day) {
        if(day == 6 || day == 7){
            System.out.println("Jest weekend");
        } else if(day>0 && day<6){
            System.out.println("Dzien pracujacy");
        } else {
            System.out.println("Nieznany dzien");
        }
    }
}