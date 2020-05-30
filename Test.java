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
}
