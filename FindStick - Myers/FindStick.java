public class FindStick
{

    public static void main(String[] args)
    {
        String[][] myBoard = new String[5][5];
        String[][] realBoard = new String[5][5];
        int randRow = (int)(Math.random()*4);
        int randCol = (int)(Math.random()*4);
        
        for(int row = 0; row < realBoard.length; row++)
        {
            for(int col = 0; col < realBoard[row].length; col++)
            {
                realBoard[row][col] = ".";
            }
        }

        for(int row = 0; row < myBoard.length; row++)
        {
            for(int col = 0; col < myBoard[row].length; col++)
            {
                myBoard[row][col] = ".";
                
                myBoard[randRow][randCol] = "s";
            }
        }
        
        for(int row = 0; row < myBoard.length; row++)
        {
            for(int col = 0; col < myBoard[row].length; col++)
            {
                myBoard[row][col] = ".";
             
                myBoard[randRow][randCol] = "s";
                myBoard[randRow][randCol+1] = "s";
                myBoard[randRow][randCol+2] = "s";
            }
        }

        for(int row = 0; row < myBoard.length; row++) {
            for(int col = 0; col < myBoard[row].length; col++) {
                if(col == 0) {
                    System.out.print(" ");
                }
                System.out.print(myBoard[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
