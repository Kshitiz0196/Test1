import java.util.Scanner;
import java.lang.String;

class Test
{

static int stringCalc(String a, String b) throws Ne
{
 int x,y=0;
 if(a.isEmpty()||b.isEmpty())
return 0;

else
{

    x=Integer.parseInt(a);
     y=Integer.parseInt(b);

    if(x<0 || y<0)
    {
      throw new Ne("negatives not allowed");
    }
    else
    return x+y;

}
  }

void add(t,m)
{
t=t+m;
System.out.println("result is="+t);

}

public static void main(String [] args)
{
  String s1,s2,c;
  int val,res=0;

System.out.println("enter the values to be added-")
  s1=new Scanner(System.in).nextLine();
  s2=new Scanner(System.in).nextLine();
  try{res=stringCalc(s1,s2)}

catch(Ne e){System.out.println(e);}

System.out.println("result is"+res);
while(1){
System.out.println("want to add more numbers?? (y/n)");
 c=new Scanner(System.in).nextLine();

 switch (c){
case y: System.out.println("enter value-");
        val=new Scanner(System.in).nextInt();
        add(res,val);
        continue;
   case n: break;
 }
}




}


}
