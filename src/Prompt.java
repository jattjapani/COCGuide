
import javax.swing.JOptionPane;



public class Prompt {
    
    int itroop, iselection;
    String troopname, selection;
    
    
    public String menu (){
        
         selection =  JOptionPane.showInputDialog("Which Troop you like" +
                                 "to train?\n" + "Barbarian     Enter 1\n" +
                                 "Archers       Enter 2\n" + "Giants        " +
                                 "Enter 3\n" + "Goblins       Enter 4\n" +
                                 "Wall Breakers Enter 5\n" +"Ballons       " +
                                 "Enter 6\n" + "Wizards       " + "Enter 7\n" +
                                 "Healers       Enter 8\nSpells       " +
                                 "Enter 9\n Dragons       Enter 10\n Finished" +
                                 "    Enter 0\n");
        return selection;
     }
    public String troop_selection(int troop) {
        
        switch (troop) {
            case 1: troopname = "Barbarian";
            break;
            case 2: troopname = "Archer";
            break;
            case 3: troopname = "Giant";
            break;
            case 4: troopname = "Goblin";
            break;
            case 5: troopname = "Wall Breaker";
            break;
            case 6: troopname = "Ballon";
            break;
            case 7: troopname = "Wizard";
            break;
            case 8: troopname = "Healer";
            break;
            case 9: troopname = "Spell";
            break;
            case 10: troopname = "Dragon";
            break;
            default: troopname = "Invalid Troop";
            break;
         }
        return troopname;
    }
    
}
