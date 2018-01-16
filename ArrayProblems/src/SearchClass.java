import java.util.Scanner;

public class SearchClass {
    public static void main(String[] args) {
            int arr[]={2,5,8,13,19};
            int n=arr.length;
            Scanner s=new Scanner(System.in);
        System.out.println("Enter the key to be searched");
        int key=s.nextInt();
       int a= linearSearch(arr,key);
       int b=binarySearchRec(arr,0,n-1,key);

        System.out.println("found at"+b);
    }
    public static int linearSearch(int a[],int key){
        for(int i=0;i<a.length;i++) {
            if (a[i] == key)
                return i;

        }
        return -1;
    }
    //Iterative binary Search
    public static int binarySearch(int a[],int key) {

        int l = 0;

        int h = a.length - 1;

        while (l <= h){
            int  mid = (l + h) / 2;
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
              l = mid + 1;
            else
                h = mid - 1;
    }
        return -1;

    }


    //Recursive Binary Search
    public static int binarySearchRec(int a[],int low,int high,int key){
        int mid=(low+high)/2;
        if(a[mid]==key)
            return mid;
        else if(a[mid]<key)
            return binarySearchRec(a,mid+1,high,key);
        else
            return binarySearchRec(a,low,mid-1,key);

    }
}
