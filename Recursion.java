class Recursion {
public static int factorial(int n) {
if(n<=1) {
return 1;
}
else
{
return n*factorial(n-1);
}
}
public static void main(String[] args) {
int n=5;
int r=factorial(n);
System.out.println("factorial of"+n+"is"+r);
}
}