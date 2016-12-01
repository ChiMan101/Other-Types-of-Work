import java.util.Scanner;
public class Battleship
{
    public static void main(String[] args)
    {
        String[][] realBoard = new String[10][10];
        String[][] fakeBoard = new String[10][10];

        int randRowS = (int)(Math.random()*9);
        int randColS = (int)(Math.random()*9);
        int randRowD = (int)(Math.random()*9);
        int randColD = (int)(Math.random()*9);
        int randRowP = (int)(Math.random()*9);
        int randColP = (int)(Math.random()*9);
        int randRowA = (int)(Math.random()*9);
        int randColA = (int)(Math.random()*9);

        Scanner scan = new Scanner(System.in);

        for(int row = 0; row < fakeBoard.length; row++)
        {
            for(int col = 0; col < fakeBoard[row].length; col++)
            {
                fakeBoard[row][col] = ".";
            }
        }

        for(int row = 0; row < realBoard.length; row++)
        {
            for(int col = 0; col < realBoard[row].length; col++)
            {
                realBoard[row][col] = ".";
            }
        }

        for(int row = 0; row < realBoard.length; row++)
        {
            for(int col = 0; col < realBoard[row].length; col++)
            {
                realBoard[row][col] = ".";

                if(randRowS == 0 || randRowS == 0)
                {
                    realBoard[randRowS][randColS] = "S";
                    if(randRowS == 0 || randRowS == 10)
                    {
                        realBoard[randRowS+1][randColS] = "S";
                        realBoard[randRowS+2][randColS] = "S"; 
                    }
                    else
                    {
                        realBoard[randRowS+1][randColS] = "S";
                        realBoard[randRowS-1][randColS] = "S";
                    }
                }
                else
                {
                    realBoard[randRowS][randColS] = "S";
                    if(randColS == 0 || randColS == 10)
                    {
                        realBoard[randRowS][randColS+1] = "S";
                        realBoard[randRowS][randColS+2] = "S";                        
                    }
                    else
                    {
                        realBoard[randRowS][randColS+1] = "S";
                        realBoard[randRowS][randColS-1] = "S";                        
                    }
                }

                if(randRowD == 0 || randRowD == 0)
                {
                    realBoard[randRowD][randColD] = "D";
                    if(randRowD == 0 || randRowD == 10)
                    {
                        realBoard[randRowD+1][randColD] = "D";
                        realBoard[randRowD+2][randColD] = "D"; 
                    }
                    else
                    {
                        realBoard[randRowD+1][randColD] = "D";
                        realBoard[randRowD-1][randColD] = "D";
                    }
                }
                else
                {
                    realBoard[randRowD][randColD] = "D";

                    if(randColD == 0 || randColD == 10)
                    {
                        realBoard[randRowD][randColD+1] = "D";
                        realBoard[randRowD][randColD+2] = "D";

                    }
                    else
                    {
                        realBoard[randRowD][randColD+1] = "D";
                        realBoard[randRowD][randColD-1] = "D";                        
                    }

                }

                if(randRowP == 0 || randRowP == 0)
                {
                    realBoard[randRowP][randColP] = "P";

                    if(randRowP == 0 || randRowP == 10)
                    {
                        realBoard[randRowP+1][randColP] = "P"; 
                    }
                    else
                    {
                        realBoard[randRowP+1][randColP] = "P";;
                    }
                }
                else
                {
                    realBoard[randRowP][randColP] = "P";

                    if(randColP == 0 || randColP == 10)
                    {
                        realBoard[randRowP][randColP+1] = "P";                       
                    }
                    else
                    {
                        realBoard[randRowP][randColP+1] = "P";                      
                    }

                }
                /*
                if(randRowA == 0 || randRowA == 10)
                {
                    realBoard[randRowA][randColA] = "A";
                    realBoard[randRowA+1][randColA] = "A"; 
                    realBoard[randRowA+2][randColA] = "A";;
                }
                else
                {
                    realBoard[randRowA][randColA] = "A";

                    if(randColA == 0 || randColA == 10)
                    {
                        realBoard[randRowA][randColA+1] = "A";
                        realBoard[randRowA][randColA-1] = "A";    
                        realBoard[randRowA][randColA+2] = "A";
                        realBoard[randRowA][randColA-2] = "A"; 
                    }
                    else
                    {
                        realBoard[randRowA][randColA+1] = "A";
                        realBoard[randRowA][randColA-1] = "A";    
                        realBoard[randRowA][randColA+2] = "A";
                        realBoard[randRowA][randColA-2] = "A";                    
                    }
                }
                */
            }
        }

        int l = 0;

        while(l != -1)
        {

            for(int row = 0; row < realBoard.length; row++) 
            {
                for(int col = 0; col < realBoard[row].length; col++) {
                    System.out.print(realBoard[row][col] + " ");
                }
                System.out.println("");
            }
            l = scan.nextInt();

        }
    }
}

