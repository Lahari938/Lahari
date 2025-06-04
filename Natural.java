class Natural {
public static int sumNatural(int n) {
if(n<=1) {
return 1;
}
else
{
return n+sumNatural(n-1);
}
}
public static void main(String[] args) {
int n=10;
int r=sumNatural(n);
System.out.println("sum of first"+n+"Natural numbers is"+r);
}
}