import java.awt.Button;


public class Cell extends Button {
    boolean bIsAMine;
    int myRow;
    int myCol;
    
    public Cell()
    {
        bIsAMine = false;
        myRow = 0;
        myCol = 0;
    }
    public Cell(boolean mine,int row, int col)
    {
        bIsAMine = mine;
        myRow = row;
        myCol = col;
    }
    
    public int getRow()
    {
        return myRow;
    }
    public int getCol()
    {
        return myCol;
    }
     public boolean getBomb()
    {
        return bIsAMine;
    }
    
    public void setRow(int row)
    {
        myRow = row;
    }
    public void setCol(int col)
    {
        myCol = col;
    }
    public void setBomb(int row, int col)
    {
        bIsAMine = true;
    }
    
}
