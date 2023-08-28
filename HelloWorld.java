public class HelloWorld{
public static void main(String[] args){
  System.out.println("Hello World!");
  System.out.println("Siri");

// Addition
int learners = 28;
int trainers = 2;
int vinsys = learners + trainers;
System.out.println(vinsys);
// Substraction
int totalnum = learners-2;
System.out.println(totalnum);
// Multiplication
double chocolates = 3;
double biscuits = 2;
double total = 3*2;
System.out.println(total);
// Division
double perperson = total/2;
System.out.println(perperson);
// Remainder of Two Numbers
int students = 16;
int leftout = 16%3;
System.out.println(leftout);
  
// Swapping Numbers With Using Third Variable
int a=10,b=20,temp;
temp=a;
a=b;
b=temp;
System.out.println("value of a:"+a);
System.out.println("value of b:"+b);
// Swapping Numbers Without Using Third Variable
int X=20;
int Y=30;
X=X+Y;
Y=X-Y;
X=X-Y;
System.out.println("value of X:"+X);
System.out.println("value of Y:"+Y);
  
// Area of Circle
int radius;
double pi = 3.142, area;
radius = 6;
//calculating area of circle
area = pi*radius*radius;
// printing area of circle
System.out.println("Area of circle is:"+area);
// character whose ASCII value to be found
char ch1 = 'a';
char ch2 = 'b';
int asciivalue1 = ch1;
int asciivalue2 = ch2;
System.out.println("The ASSCII value of " +ch1+"is:"+asciivalue1);
System.out.println("The ASSCII value of " +ch2+"is:"+asciivalue2);



    }
}