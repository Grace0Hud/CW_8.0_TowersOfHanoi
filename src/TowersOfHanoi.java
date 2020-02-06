public class TowersOfHanoi
{
    private int totalDisks;

    //sets up puzzle with specified number of disks
    public TowersOfHanoi(int disks)
    {
        totalDisks = disks;
    }//end constructor

    //initial call to solve
    //moves disks from tower 1 to tower3 using tower2
    public void solve()
    {
        moveTower(totalDisks, 1, 3, 2);
    }//end solve

    //Moves the specified disks from one tower to another.
    //moves subtower n-1 disks out of the way, moving one
    //then moving the subtower back. base case 1 disks
    private void moveTower(int numDisks, int start, int end, int temp)
    {
        if(numDisks == 1)
        {
            moveOneDisk (start, end);
        }//end if
        else
        {
            moveTower(numDisks-1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks-1, temp, end, start);
        }//end else
    }//end move tower

    //prints instruction to move one disk from the specified
    //start tower to the end tower
    private void moveOneDisk(int start, int end)
    {
        System.out.println("Move one disk from " + start + " to " + end);
    }//end moveOneDisk
}//end class
