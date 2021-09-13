import java.util.Scanner;


public class exercise23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?");
        String ans1 = input.next();

        if(ans1.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            String ans2 = input.next();
            if(ans2.equals("n"))
            {
                System.out.println("Replace cables and try again.");
                return;
            }
            else
            {
               System.out.println("Clean terminals and try starting again");
               return;
            }
        }
        else if(ans1.equals("n"))
        {
            System.out.println("Does the car make a slicking noise?");
            String ans3 = input.next();
            if(ans3.equals("n"))
            {
                System.out.println("Does the car crank up but fail to start?");
                String ans4 = input.next();
                if(ans4.equals("n"))
                {
                    System.out.println("Does the engine start and then die?");
                    String ans5 = input.next();
                    if(ans5.equals("y"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        String ans6 = input.next();
                        if(ans6.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            return;
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                        return;
                    }
                }
                else
                {
                    System.out.println("Check spark plug connections.");
                    return;
                }

            }
            else
            {
                System.out.println("Replace the battery.");
                return;
            }
        }

    }

}
