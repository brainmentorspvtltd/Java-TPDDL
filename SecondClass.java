//import java.lang.*;
import java.math.*;
strictfp class FirstClass{
public static void main(String arr[]){
int x ;
x = 100;
int y =200;
int z= x + y;
System.out.println("Sum is "+z);
// Value Data Types
byte a = (byte)130;  // 1 byte
short b = 20 ; // 2 byte
int c = 11; // 4 byte
long d = 20L; // 8 Byte
float e = 90.20f; // 4 byte
double f = 90.2545440;  // 8 byte
boolean h = true;  // 1 byte , 2 byte , 4 byte
char i = 'A'; // 2 Byte

// Reference Data Type
String v = "Amit";
BigInteger bi = new BigInteger("123443657748833");
BigInteger bi2 = new BigInteger("988876634343343");
BigInteger bi3 = bi.add(bi2);
System.out.println("After Add "+bi3);
BigDecimal  bd;


System.out.println("Hello Java "+a);
}
}
/*
class System{
private System(){
}
static InputStream in;
static PrintStream out
static PrintStream err;
}
System s = new System();

class PrintStream{
println(){
print();
newLine();
}
print(){
}
}
*/