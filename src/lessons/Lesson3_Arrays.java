package lessons;

import java.util.Arrays;

public class Lesson3_Arrays {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 25;
//        int j = a + b;
//        System.out.println(j);
//        System.out.println(a + b);
//        System.out.println(Math.abs(a + b));
//        System.out.println(Math.pow(2,Math.abs(a + b)));
//        int h = (int)Math.pow(2,Math.abs(a + b));
//        System.out.println(h);

        //Arrays_________________________________________________________________

//        int[] arr = {1, 2, -4, 7, 1, 30_000, -2_000_000, 0};
//        System.out.println(arr[1]);
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));
//
////        int[] arr2 = new int[3];
////        arr[0] = 1;
////        arr[1] = 2;
////        arr[2] = 3;
////
//        int[] arr2 = {1, 2, 3, 2, -4, 7, 1, 30_000, -2_000_000, 0};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("\ti=" + i + "arr2[i]=" + arr2[i]);
//            if(arr[i] == -4) {
//
//                //System.out.println("found -4 index is " + i);
//                //break;
//                continue;
//            }
//                System.out.println("\ti=" + i + "arr[i]" + arr[i]);
//
//            }
//
//        //Dimensional array______________________________________________________
//        int [][] c1 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//                {1,2,3}
//        };
//        System.out.println(Arrays.toString(c1[2]));
//        System.out.println(c1[1][2]);//6
//
//        int [][][] c3 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//                {1,2,3}
//        };
//        System.out.println(Arrays.toString(c1[2]));
//        System.out.println(c3[1][1][2]);//15?

        //Max Min__________________________________________________________
//
//        int[] arr = {33,-2,4,67,4,9,4};
//        int min = arr[0];
//        int minIndex = 0;
//        for(int i = 1; i < arr.length; i++){
//            if(min >arr[i]){
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//        System.out.println(String.format("minimal element is arr[%d] and value is %d", minIndex, min));
//
        int[] arr2 = {33, -2, 4, 67, 4, 9, 4};
//        int max = arr2[0];
//        int maxIndex = 0;
//        for(int i = 1; i < arr2.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println(String.format("maximal element is arr2[%d] and value is %d", maxIndex, max));

        //Sum_________________________________________________________
        int sum = 0;
        for (int i = 1; i < arr2.length; i++) {
            sum += arr2[i];
            System.out.println(sum);

        };

        //While_____________________________





        //do while_______________________________
    }
    }



