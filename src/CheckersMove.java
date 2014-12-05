class CheckersMove 
{
 private int fromRow;
 private int fromCol;
 private int toRow;
 private int toCol;

 // Position of piece to be moved.

 // Square it is to move to.
 
 // Constructor.  Just set the values of the instance variables.
 
 //Constructor
 public CheckersMove(int fromrow, int fromcol, int torow, int tocol)
 {
   fromRow=fromrow;
   fromCol=fromcol;
   toRow=torow;
   toCol=tocol;
 }
 
 // Accessors
 public int getFromRow()
 {
   return fromRow;
 }
 
 public int getFromCol()
 {
   return fromCol;
 }
 
 public int getToRow()
 {
   return toRow;
 }
 
 public int getToCol()
 {
   return toCol;
 }
 
 public boolean isJump()
 {
   boolean jump=false;
   if (fromCol-toCol==2)
   {
     jump=true;
     return jump;
   }
   else if (fromRow-toRow==2)
   {
     jump=true;
     return jump;
   }
   else
   {
     return jump;
   }
 }
}   // end class CheckersMove.
