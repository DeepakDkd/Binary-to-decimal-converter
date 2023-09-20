import java.util.Scanner;
class binarytodecimal {
    private int ar[];
    public void B2D(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter binary code ");
        String nstr=sc.next();
        int len = nstr.length();
        int num =Integer.valueOf(nstr);
        int decimal=0;
        int base=1;
        for(int i=1;i<=len;i++)
        {
            int last = num%10;
            num=num/10;
            decimal += last * base;
            base = base * 2;
        }
        System.out.println("Decimal : "+decimal);
    }
    public void D2B()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter decimal digit  ");
        int n = sc.nextInt();
        String res="";
        while(n>0)
        {
            int a=n%2;
            res +=((char)(a+'0'));
            n=n/2;
        }
        int len = res.length();
        char charar[] = new char[len];
        for(int i=0;i<len;i++)
        {
            charar[i]=res.charAt(len-1-i);//reverse string
        }
        String binary = new String(charar);
        System.out.println(binary);

    }
}
class convert
{
    public static void main(String args[])
    {
        binarytodecimal b1 = new binarytodecimal();
        b1.B2D();
        b1.D2B();
    }
}