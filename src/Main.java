import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(45, 28));
        System.out.println(permission(5, -24));
        System.out.println(permission(35, -13));
        System.out.println(permission(65, 18));
        System.out.println(permission(16, 23));

        int randomage=generaterandomage();
        System.out.println(" сгенерируемый возраст "+ randomage);

    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 45) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 || temperature >= -10 && temperature <= 25)) {
            return (" можно гулять ");

        } else return (" остовайтесь дома ");


    }

    public static int generaterandomage() {
        Random random = new Random();
        int minage = 1;
        int maxage = 100;
        return random.nextInt(maxage-minage+1)+minage;
    }
}

