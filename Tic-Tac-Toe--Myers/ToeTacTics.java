import java.util.Scanner;
public class ToeTacTics
{

    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int input1 = 0;
        int input2 = 0;
        String userPiece;
        piece[][]myBoard =  new piece[2][2];

        System.out.println("Hello welcome to Toe-Tac-Tic.\nWould you like to play as the X or the O?");
        userPiece = sc.nextLine();
        System.out.println(userPiece+ " Are you sure this is your piece?");

        for(int row = 0; row< myBoard.length; row++)
        {
            for(int col = 0; col< myBoard[row].length; col++)
            {
                myBoard[row][col] = new piece();
            }
        }

        while(input1 < 999 && input2 < 999)
        {
            System.out.println("Pick a row between 0-2");
            input1 = sc.nextInt();
            if(input1 > myBoard.length)
            {
                System.out.println("That is not on the game board");
            }
            System.out.println("Pick a column between 0-2");
            input2 = sc.nextInt();
            if(input2 > myBoard.length)
            {
                System.out.println("That is not on the game board");
            }
            else
            {

                myBoard[input1][input2].description = userPiece;

            }


            /*
            for(int i =0; )
            {

            }
             */
        }

    }
}
