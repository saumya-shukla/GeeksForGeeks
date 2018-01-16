public class ReversingNumber  {
    public static void main(String[] args) {
            int a=reverseNumber(2345);
        int b=reverseNumberRec(2345);
        System.out.println("reversed number"+a);
        System.out.println("reversed number using recursion"+b);
    }

    //without using recursion
    public static int reverseNumber(int a){
        int reverse=0;
        while(a!=0){
            reverse=reverse*10;
            reverse=reverse+(a%10);
            a=a/10;
        }
        return reverse;
    }

    //Reversing a number using recursion

    public static int reverseNumberRec(int a) {
        return reverseNumberRec(a,0);
    }
    private static int reverseNumberRec(int n,int rev){
        if(n==0){
            return rev;
        }
        else{
            return reverseNumberRec(n/10,rev*10+(n%10));
        }


    }
}
