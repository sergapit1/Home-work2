package by.academy.homework2.task2;

public class Main {
    public static void main(String[] args) {
        Array a = new Array();
        int[] array1 = new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int[] array2 = new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] array3 = new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] array4 = new int[]{10};
        int[] array5 = new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int[] array6 = new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};

        System.out.println("Array1 :" + a.find(array1));
        System.out.println("Array2 :" + a.find(array2));
        System.out.println("Array3 :"+ a.find(array3));
        System.out.println("Array4 :"+ a.find(array4));
        System.out.println("Array5 :"+ a.find(array5));
        System.out.println("Array6 :"+ a.find(array6));

    }
}