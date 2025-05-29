public class DayThree{
    public static void main(String[] args){
        // This is a program for Switch case.


        int a=12;
        int b=5;
        int c='*';

        switch (c)
        {   
            
            case ('+') : { int result=a+b;
                System.out.println("a + b = "+result);
            break;}

            case ('*') : {
                int result=a*b;
                System.out.println("a * b "+result);
                break;
            }
            
            default : System.out.println("Incorrect Value");
            break;
        }
    }
}