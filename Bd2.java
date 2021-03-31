class Bd2{
    public static boolean isPrime(int num) {
        for(int i = 2; i< num; i++)        
        {
            if(num%i == 0)
                return false;
        }
        return true;
    }
    public static int nextPrime(int currentPrime) {
        int Number = currentPrime +1;   
        boolean primeNotFound = true;     
            while(primeNotFound)
            {
                if(isPrime(Number)){
                    primeNotFound = false;
                    break;
                }
                Number++;  
            }
            return Number;              
    }
    public static void fibo(int num) {
        int a = 0;
        int b = 1;
        int temp;
        int currentPrime = 2;
        for(int i=0; i< num/2; i++)
        {
            System.out.print(a+" ");
            System.out.print(currentPrime+" ");
            temp = a;
            a = b;
            b = a + temp;
            currentPrime = nextPrime(currentPrime);
        }
    }
    public static void main(String[] args) {
        fibo(20);
    }
}