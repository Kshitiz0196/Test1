import java.util.Scanner;

class Test
{
int z[];

void show(int [] a)
{
  System.out.println("your entered array is-");
  for(int i=0; i<a.length;i++)
  {
  System.out.println(a[i]);

  }

}

public static void main(String [] args)
{
System.out.println("enter the size of array-");
int x=new Scanner(System.in).nextInt();

Test a1=new Test();
a1.z= new int[x];

for(int i=0; i<a1.z.length;i++)
{
a1.z[i]=new Scanner(System.in).nextInt();

}

a1.show(a1.z);
}


}
