import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 7));
        System.out.println(permission(generateRandomAge(), 0));
        System.out.println(permission(10, 20));
        System.out.println(permission(generateRandomAge(), 30));
    }

    public static String permission(int ageMan, int temperature) {
        if ((ageMan >= 20 && ageMan < 45) && temperature >= -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (ageMan < 20 && temperature >= 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (ageMan > 45 && temperature >= -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random age = new Random();
        int ageMan = age.nextInt();
        return ageMan;
    }

}