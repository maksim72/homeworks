public class MainApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(challenge2_1(3, 14));
        challenge2_2(5);
        System.out.println(challenge2_3(4));
        challenge2_4("psk", 5);
        System.out.println(challenge2_5(400));
    }

    public static void printThreeWords(){
        System.out.print("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign(){
        int a, b;
        a = 3;
        b = 5;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 5;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value < 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 4;
        int b = -4;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean challenge2_1(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        } return false;
    }

    public static void challenge2_2(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    public static boolean challenge2_3(int a) {
        if (a < 0){
            return true;
        } return false;
    }

    public static void challenge2_4(String str, int a){
        for (int i = 0; i < a; i++){
            System.out.println(str);
        }
    }

    public static boolean challenge2_5(int a){
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)){
            return true;
        } return false;
    }

}
