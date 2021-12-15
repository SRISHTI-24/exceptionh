import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        try
        {
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
            int j = s.nextInt();
            System.out.println(arr[j]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
        catch(NumberFormatException e)
        {

            System.out.println(e.toString());
        }

    }
}
