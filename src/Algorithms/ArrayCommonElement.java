package Algorithms;

// Поиск общего элемента в массивах
public class ArrayCommonElement {

    public static void main(String[] args) {

        int[] arr1 = {2, 8, 17, 29, 20, 45, 56, 159, 239};
        int[] arr2 = {8, 12, 15, 29, 22, 34, 55, 150, 159};

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int arr1Index = 0;
        int arr2Index = 0;

        while (true) {
            if (arr1Index < arr1Length && arr2Index < arr2Length) {
                if (arr1[arr1Index] == arr2[arr2Index]) {
                    System.out.println(arr1[arr1Index]);
                    arr1Index++;
                    arr2Index++;
                } else {
                    if (arr1[arr1Index] < arr2[arr2Index]) {
                        arr1Index++;
                    } else {
                        arr2Index++;
                    }
                }
            } else {
                break;
            }
        }
    }
}