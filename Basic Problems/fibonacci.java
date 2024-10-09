class solution{
  public static int fibo(int n){
    if(n <= 1 ){
      return n;
    }
    return fibo(n-1) + fibo(n-2);
}

//Helps to find the nth fibonacci number 
