class Rev {
public static string reverse(String[]args) {
if(str.isEmpty()) {
return str;
}
else
{
return reverse(str.substring(1))+str.charAt(0);
}
public static void main(String[]args) {
String s="AITS";
System.out.println("Reverse of string is"+reverse(s));
}
}
}