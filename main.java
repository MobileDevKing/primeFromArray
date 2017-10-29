
public class Main {

    public static void main(String[] args) {

 int[] arr=new int[10];
        Random r=new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(100);
         if(prime(arr[i]))
         {
             System.out.println(arr[i]);
         }
        }
    }
    public static boolean prime(int a)
    {
        boolean t=true;
        if(a<=1)
        {
            t=false;
        }
        for (int k=2;k<=Math.sqrt((double) a);k++)
        {
            if(a%k==0)
            {
                t=false;break;
            }
        }
        return t;
    }
}
