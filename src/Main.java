import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int iteration=sc.nextInt();
        String input;
        int i=0;
        for(i=0;i<=iteration;i++)
        {
            input=sc.nextLine();
            if(i!=0)
            {
                String[] inputarr=input.split("\\s");
                int firstInt=Integer.parseInt(inputarr[0]);
                int secondInt=Integer.parseInt(inputarr[1]);

                if(firstInt>secondInt)
                    System.out.println(">");
                
                else if(firstInt<secondInt)
                    System.out.println("<");
                
                else
                    System.out.println("=");
                
            }
        }
    }
}