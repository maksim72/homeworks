import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        /*printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(challenge2_1(3, 14));
        challenge2_2(5);
        System.out.println(challenge2_3(4));
        challenge2_4("psk", 5);
        System.out.println(challenge2_5(400));*/
        challenge3_1();
        challenge3_2();
        challenge3_3();
        challenge3_4();
        challenge3_5(7, 10);
        challenge3_6();
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

    public static void challenge3_1(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void challenge3_2(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void challenge3_3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void challenge3_4(){
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i] == arr[j]){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void challenge3_5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void challenge3_6(){
        int[] arr = {3, 4, 6, 1, 10, 15, 100, 55, 0};
        int max = arr[0];
        int min = arr[1];
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }
        for (int j : arr){
            if (j < min){
                min = j;
            }
        }
        System.out.println("Минимальное число = " + min);
        System.out.println("Максимальное число = " + max);
    }



}

