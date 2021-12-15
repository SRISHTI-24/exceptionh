public class Mathoperation {
    public static void main(String args[]) {
        try
        {
            int s = 0;
            int l = args.length;
            int[] arr  = new int[l];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            for(int i=0;i < args.length; i++)
                s = s + arr[i];
            int avg = s/l;
            System.out.println(s);
            System.out.println(avg);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }


    }
}
