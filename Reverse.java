package git_learn;

public class Reverse {
    public static void main(String[] args) 
    {
        int a=1234, rem, rev=0;

        while(a!=0)
        {
            rem=a=10;
            rev= rev*10+rem;
            a=a/10;


        }
        System.out.println("This is the change you want to see"+rev);
    }
    
}

