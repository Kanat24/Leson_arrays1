import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1_2();
        Task3();
        Task4();
    }

    public static void Task1_2() {
        int[] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
            if (i!= arrays.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        double[] arrays2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrays2.length; i++) {
            System.out.print(arrays2[i]);
            if (i!= arrays2.length-1){
                System.out.print(",");}
        }
        System.out.println();
        int[] arrays3 = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int i = 0; i <= arrays3.length - 1; i++) {
            System.out.print(arrays3[i]);
            if (i!= arrays3.length-1){
                System.out.print(",");}
        }
        System.out.println();
    }

    public static void Task3() {

        int[] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        for (int i = arrays.length-1; i >= 0; i--) {
            System.out.print(arrays[i]);
            if (i!=0){
                System.out.print(",");}
        }
        System.out.println();

        double[] arrays2 = {1.57, 7.654, 9.986};
        for (int i = arrays2.length - 1; i >= 0; i--) {
            System.out.print(arrays2[i]);
            if (i!=0){
                System.out.print(",");}
        }
        System.out.println();

        int[] arrays3 = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int i = arrays3.length - 1; i >= 0; i--) {
            System.out.print(arrays3[i]);
            if (i!=0){
                System.out.print(",");}
        }
        System.out.println();
    }

    public static void Task4() {
        int[] arrays = {1, 2, 3};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]%2!=0){
                arrays[i]+=1;
            }
        }
            System.out.println(Arrays.toString(arrays));



    }
}