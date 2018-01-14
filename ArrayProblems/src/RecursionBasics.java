public class RecursionBasics {
    public static void main(String[] args) {
        int a = fib(6);
        int b = fib1(5);
        int c = fact(4);
        int d = factRec(5);
        int e = power(5, 3);
        int g = sumDigits(5496);
        boolean f = isPrime(21);
        System.out.println("is prime " + f);
        System.out.println("fib " + a);
        System.out.println("fibRec " + b);
        System.out.println("factorial " + c);
        System.out.println("factorial using recursion " + d);
        System.out.println("power " + e);
        System.out.println("sum of digits" + g);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fib1(int n) {
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int factRec(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else
            return (n * factRec(n - 1));
    }

    public static int power(int a, int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * a;
        }
        return res;
    }

    public static boolean isPrime(int a) {
        int m = a / 2;
        for (int i = 2; i <= m; i++) {
            if (a % i == 0)
                return false;
        }

                return true;
        }
    
    
    
    //Optimised Version
    // Every Prime Number can be Represented in form of 6k+1 or 6k-1 
    
     public static boolean isPrime(int a) {
         if(a<=1){
           return false;
         }else if(a<=3){
           return true;
         }else if(a%2==0 || a%3==0){
           return false;
         }
         for(int x = 5 ; x<= math.sqrt(a) ;x=x+6){
                if(a % x == 0  || a % (x+2)==0){
                   return false;
                }
          }   
            return true;
     }
    
    
    

        public static int sumDigits(int n){

        if (n==0) {
            return 0;
        }
        else {

            return sumDigits(n / 10)+(n%10);
        }
        }



    }

