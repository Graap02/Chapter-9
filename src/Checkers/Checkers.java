
/**
 * It's a checker board, with some pieces on it.
 *
 * @Jayden Graap
 * @version uhhhhhhhhhh 1.0
 */
public class Checkers
{
  public static void main( ) 
  {
      String[][] checkerBoard = new String[8][8];
      for (int i = 0; i < checkerBoard.length; i++) 
      {
          int countWhite = 0;
        int count = 0;
        for (int j = 0; j < checkerBoard.length; j++) 
        {
            count++;
            if ((j % 2) == (i % 2)) 
            {
                if(countWhite >= 5) 
                {
                    System.out.print(" WC ");
                }
                else
            System.out.print(" W ");
            }    
            else if ((j % 2) != (i % 2))
            if (countWhite <=1) {
                System.out.print(" BC "); 
            }
            else 
            System.out.print(" B ");
        
            countWhite++;
        }
        if (count == 8) 
        {
            System.out.println(" ");
        }
  }
}
}

// Failed methods: looping by using a if loop, do not do, will cause an infinite
// loop
// Attempt to hardcode in the pieces through the array spots ([1][0] = sop"R")
// Figure out a "System.out.print" method for reconstructing the sequence
// Tried adding another variable in by means of hardcoding, which ended up
// on the outside (if (count == 2) sop"R")
// Tried adding an else if method to replace specific locations in the array

               
  


        

    

