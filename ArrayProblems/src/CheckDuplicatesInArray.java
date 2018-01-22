import java.util.Arrays;

public class CheckDuplicatesInArray {

    public static void main(String[] args) {
        int a[]={5,1,2,2,6,3};
            Arrays.sort(a);
            System.out.println("sorted is"+Arrays.toString(a));
        checkDuplicatesOpt(a);

    }
    public static void checkDuplicates(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
                if(a[i]==a[j]) {
                    System.out.println("duplicates exist");
                    return;
                }

        }
        System.out.println("no duplicates");
    }


    public static void checkDuplicatesOpt(int a[]){
        for(int i=0;i<a.length-1;i++){

                if(a[i]==a[i+1]) {
                    System.out.println("duplicates exist");
                    return;
                }

        }
        System.out.println("no duplicates");
    }


}
