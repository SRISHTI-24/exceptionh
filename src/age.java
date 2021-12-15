class invalidage extends RuntimeException
{
    invalidage(String msg)
    {
        System.out.println(msg);
    }
}
class invalidname extends RuntimeException
{
    invalidname(String msg)
    {
        System.out.println(msg);
    }
}
public class age {
    public static void main(String args[]) {

        if((Integer.parseInt(args[0]) > 0))
        {
            throw new invalidname("invalid name entered");
        }
        else
        {
            int age = Integer.parseInt(args[1]);
            if(age>=18 && age<=60)
            {
                System.out.println("valid age");
            }
            else
            {
                throw new invalidage("age is not proper");
            }

        }


    }
}
