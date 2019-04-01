import javax.swing.*;

public class FindRecent
{
    public static void main(String[] args)
    {
        int[] [] rents = {
                {400, 450, 520, 580},
                {500, 560, 630, 673},
                {625, 676, 740, 820},
                {1000, 1250, 1600, 2000},
                {1100, 1550, 1750, 1900},
                {2000, 2250, 2300, 2500}};


         String entry;
          int floor;
          int bedrooms;

          entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
          floor = Integer.parseInt(entry);
          entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms ");
          bedrooms = Integer.parseInt(entry);

        JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + " bedroom apartment on floor "
        + floor + " is $" +rents[floor][bedrooms]);
    }


}
