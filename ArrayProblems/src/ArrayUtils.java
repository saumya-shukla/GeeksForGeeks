public class ArrayUtils {
    public static void main(String[] args) {
        int arr[] = {6, 8, 5, 4, 3};
        int arr1[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        long s = sum(arr);
        int max = max(arr, n);
        int min = min(arr, n);
        int m2 = secondMax(arr, n);
        int m3 = secondMin(arr, n);
        boolean flag = isIncreasingSeq(arr1, n);
        boolean flag1 = isDecreasingSeq(arr1, n);
        System.out.println("sum " + s);
        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("Increasing " + flag);
        System.out.println("Decreasing " + flag1);
        System.out.println("second max-- " + m2);
        System.out.println("second min-- " + m3);
    }

    public static long sum(int a[]) {
        int n = a.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int max(int a[], int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;

    }

    public static int min(int a[], int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;

    }

    public static boolean isIncreasingSeq(int a[], int n) {
        boolean b = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1])
                b = false;
        }
        return b;
    }

    public static boolean isDecreasingSeq(int a[], int n) {
        boolean b = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1])
                b = false;
        }
        return b;
    }

    public static int secondMax(int a[], int n) {
        int max1 = a[0];
        int max2 = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            }
        }
        return max2;
    }
    public static int secondMin(int a[], int n) {
        int min1 = a[0];
        int min2 = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            }
        }
        return min2;
    }


}
