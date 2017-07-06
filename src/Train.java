
import javax.swing.JOptionPane;


public class Train {

    public static void main(String[] args) {

        String selection, quantity, troop_name;     // input selection & quantity string
        String selixir_earned;
        int iselection, iquantity;     // selection & quantity integer
        int elixir, total_elixir = 0;
        int ielixir_earned, elixir_remain;

        Prompt p = new Prompt();       // create new Train class
        Elixir c = new Elixir();

        selection = p.menu();         // call 
        iselection = Integer.parseInt(selection); // convert selection to int

        while (iselection != 0) {

            troop_name = p.troop_selection(iselection);
            quantity = JOptionPane.showInputDialog("Enter Quantity"
                    + " For " + troop_name);
            iquantity = Integer.parseInt(quantity);
            elixir = c.cal_Elixir(iselection, iquantity);
            JOptionPane.showMessageDialog(null, iquantity + " "
                    + troop_name + " Will cost " + elixir);
            System.out.println(iquantity + " "
                    + troop_name + " Will cost " + elixir);
            total_elixir = total_elixir + elixir;
            selection = p.menu();
            iselection = Integer.parseInt(selection);

        }

        if (total_elixir != 0) {
            JOptionPane.showMessageDialog(null, "Total Elixir "
                    + total_elixir);
            System.out.println("Total Elixir " + total_elixir);
            selixir_earned = JOptionPane.showInputDialog("Enter Elixir won");
            ielixir_earned = Integer.parseInt(selixir_earned);

            if (ielixir_earned < total_elixir) {

                elixir_remain = total_elixir - ielixir_earned;
                JOptionPane.showMessageDialog(null, "Elixir Lost "
                        + elixir_remain);
                System.out.println("Elixir Earned" + ielixir_earned);
                System.out.println("Elixir Lost " + elixir_remain);
            } else {
                elixir_remain = ielixir_earned - total_elixir;
                JOptionPane.showMessageDialog(null, "Elixir Won "
                        + elixir_remain);
                System.out.println("Elixir Earned" + ielixir_earned);
                System.out.println("Elixir Won " + elixir_remain);
            }

        } else {
            System.out.println("End");
        }

    }
}
