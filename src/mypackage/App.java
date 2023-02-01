package mypackage;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//inheritance
class parent 
{
    private
    int id;
    public
    String name;
    //final variable impossible to inherit or override or change its value
    final int rollnum=99;
    //constructor
    public parent()
    {
        System.out.println("\n Base class cons called\n");
    }

    public void set_data(int i , String n)
    {
        id=i;
        name=n;
    }
    
    public void print_data()
    {
        System.out.println("\nName "+name + '\n');
        System.out.println("\nId "+id + '\n');
    }

    public void overriding()
    {
        System.out.println("\nParent class func \n");
    }

}

class derived extends parent
{
    private
    int ID;
    String NAME;
    //constructor
    public derived()
    {
       
        System.out.println("\n derived class cons called\n");
    }

    public void display()
    {
        print_data();
    }

    public void set_values(int n , String val)
    {
        set_data(n, val);
    }

    @Override
    public void overriding()
    {
        System.out.println("\nDerived class func \n");
    }
}




//A classs implementing interface
//for interface use implemts while for class use extends //in order to inherit or use base/parent stuff
class interface_example implements myinterface{
public void method1()
{
    System.out.println("im a function in an interface");
}
public void method2()
{
    System.out.println("im am another function in an interface");
}
}


//forming template class
class mytemplate
{
    public static <T> void print(T var)
    {
        System.out.println(var );
    }
}


//main class
public class App {
    public void main_cofunc()
    {
        System.out.println("im a function in main class");
    }
    //static memeory allocation isnt a llowed in java
    public static void main(String[] args) {
      
        //cout
        System.out.println("Enter id");
        //cin
       // Scanner sc = new Scanner(System.in);
        //initialization
       // int id= sc.nextInt();

        System.out.println("Enter a name\n");
      //  Scanner s=new Scanner(System.in);
       // String name= s.nextLine();
        
        //object creation
        parent p= new parent();
       derived d=new derived();

       //d.set_values(id, name);
       d.display();

       //Method overriding
       p.overriding();
       d.overriding();

       //string use
       int fatima_age= 19;
       System.out.println("My age is " +fatima_age );

       //array
       int arr[]={1 , 2 , 3 , 4};
       for(int i =0 ; i<4 ; i++)
       {
            System.out.println(arr[i]);
       }
       //trying to make a function in main class
       App a=new App();
       a.main_cofunc();

       //using string builder
       StringBuilder s= new StringBuilder("fatima ");
       s.append("bilal");
       System.out.println(s.toString()); //to string method used

       //using string buffer
       StringBuffer ss= new StringBuffer("fatima ");
       ss.append("bilal");
       System.out.println(ss); //simple string buffer or builder object printed



       //interface parent and derived class
       myinterface my= new interface_example();
       my.method1();
        //  myinterface mmy = new myinterface(); this cannot be done :) ...cannot allocate memory to an object of interface
        interface_example in= new interface_example();
        in.method2();


        //testing a template class
        int year=2003;
        short date = 16;
        String month ="june";
        mytemplate myt=new mytemplate();
        myt.print(date);
        myt.print(month);
        myt.print(year);
    }

}