package study_1;
// 배열을 매개변수로 받아서 중복 원소가 있다면 True를 반환하는 has_duplicates 함수를 작성하라.
// 원본 배열을 수정해서는 안 된다. ( 배열 대신 dynamic array사용가능 )

public class study82 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 3, 4, 5};

        boolean hasDuplicates1 = has_duplicates(arr1);
        boolean hasDuplicates2 = has_duplicates(arr2);

        System.out.println("arr1: " + hasDuplicates1);
        System.out.println("arr2: " + hasDuplicates2);
    }

    public static boolean has_duplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}