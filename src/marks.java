import java.util.Scanner;
class Negativenoexception extends RuntimeException
{
    Negativenoexception(String msg)
    {
        super(msg);
    }
}
class outofrangeexception extends RuntimeException
{
    outofrangeexception(String msg)
    {
        super(msg);
    }
}
public class marks {
    public static void main(String[] args) throws NumberFormatException {
      Scanner s = new Scanner(System.in);
      String a,b;
      a = s.next();
      b = s.next();
      int a1,a2,b1,b2;
      a1 = s.nextInt();
      a2 = s.nextInt();
      b1 = s.nextInt();
      b2 = s.nextInt();
      if((a1 < 0 || a2<0 ||b1<0||b2<0))
        {
            throw new Negativenoexception("negative value entered");
        }
        else if((a1<0 && a1<100) || (a2<0 && a2<100) || (b1<0 && b1<100) || (b2<0 && b2<100))
        {
            throw new outofrangeexception("out of range exception");
        }
      float avg1 = Float.intBitsToFloat((a1 +a2)/2);
        System.out.println("average of one student"+avg1);
        float avg2 = Float.intBitsToFloat((b1+b2)/2);
        System.out.println("average of second student"+avg2);
    }
}
