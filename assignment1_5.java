/*7. Create a flowchart which uses a loop
to display the following:
0
1
2
3
4
5
*/


public class assignment1_5 {

    public static void Display(int ino)
    {

        for(ino = 0 ; ino<=5 ; ino++)
        {
            System.out.println(ino);
        }

    }

    public static void main(String[] args) 
    {
        int ivalue=0;

        Display(ivalue);
        
    }
    
}
