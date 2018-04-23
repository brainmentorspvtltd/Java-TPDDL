class StringExamples{
public static void main(String args[]){
String a = "Amit".intern();  // 1 or 0 
String b = "Amit".intern();
String c = new String("Amit").intern();  // 2 or 1
System.out.println(a==c?"Same Ref ":"Not Same Ref ");
System.out.println(a.equalsIgnoreCase(b)?"Same Value ":"Not Same Value ");
a = "ram";
System.out.println(a==b?"Same Ref ":"Not Same Ref ");
}
}