 package pkg1;

public class Student 
{
 static int age;
 static int roll_no;	
 
 public void display1()
 {
 System.out.println("Welcome ALL");
 }
 public void display2()
 {
	 System.out.println("Welcome to New World");
 }
 
 public static void main(String[] args) 
 
 {
	Student Vineet = new Student();
	Vineet.age=25;
	Vineet.roll_no=1001;
    System.out.println(Vineet.age);
    System.out.println(Vineet.roll_no);
    Vineet.display1();
    Vineet.display2();
}
}
 