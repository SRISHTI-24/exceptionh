class InvalidCountryException extends RuntimeException
{
    InvalidCountryException(String msg)
    {
        super(msg);
    }
}
class main
{
    public void registerUser(String username, String usercountry)
    {
        if(usercountry == "India")
        {
            System.out.println("user registration done successfully");
        }
        else
        {
            throw new InvalidCountryException("user outside India cannot be registered");
        }

    }
}
public class portal {
    public static void main(String[] args) {
       main m =new main();
       m.registerUser("Mickey", "India");

    }
}
