public class MaxRepititions {
    static  int element;
    public static void main(String[] args) {

        int arr[]={4,4,4,4,2,2};
        int a=maxRepititions(arr);
        System.out.println("counter"+a+element);
    }

    public static int maxRepititions(int arr[]){
        int counter=0;int max=0;
        for(int i=0;i<arr.length;i++) {
            counter = 0;
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j])
                    counter++;

            if (counter > max ) {
                max = counter;
                element = arr[i];
            }
        }
        return max;

    }
}
