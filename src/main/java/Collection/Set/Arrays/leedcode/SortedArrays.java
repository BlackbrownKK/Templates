package Collection.Set.Arrays.leedcode;

import Classes.Eхес;

import java.util.Arrays;

public class SortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = new int[]{6, 7, 8, 9};
        int[] nums3 = new int[]{1, 3};
        int[] nums4 = new int[]{2};
//        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(findMedianSortedArrays(nums3, nums4));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] totalNums = new int[nums1.length + nums2.length]; // определена длина итоговая конечного массива

        for (int i = 0; i < nums1.length; i++) { // переписываем все данные в конечный массив из первого массива
            totalNums[i] = nums1[i];
        }
        Arrays.stream(totalNums).forEach(System.out::println);
        System.out.println();


        for (int i = 0; i < nums2.length; i++) { // переписываем все данные в конечный массив из второго массива
            totalNums[nums1.length + i] = nums2[i];
        }

        Arrays.sort(totalNums);

        Arrays.stream(totalNums).forEach(System.out::println);// проверка как соеденился
        System.out.println();
        System.out.println(totalNums.length);


        if (totalNums.length % 2 == 0) { // проверка четный или не четный итоговый массив

            int e = totalNums[totalNums.length / 2 - 1];
            System.out.println(e);
            int r = totalNums[totalNums.length / 2 ];
            System.out.println(r);
            double result = ((double)e+(double)r)/2;
            return result;
        }
        double result = totalNums[(totalNums.length - 1) / 2 ]; // если не четный
        return result;
    }
}
