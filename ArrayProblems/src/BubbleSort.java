public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={11,6,2,9,7};
        bubbleSort(arr);
        printArray(arr);

    }

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j <  a.length- i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
    }
    public static void printArray(int a[])
        {
            for (int i = 0; i < a.length; i++) {
                System.out.println(" " + a[i]);
            }
        }
}

