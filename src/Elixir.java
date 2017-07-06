
public class Elixir {
         
        int bElixir =  80;    //barbarians 
        int aElixir =  160;   //archers
        int gtElixir = 1750;  //giants
        int gbElixir = 60;    //goblins
        int wbElixir = 2000;  //wall brakers
        int blElixir = 3000;  //ballons
        int wzElixir = 2500;  //wizards
        int hElixir =  5000;  //healers  
        int sElixir = 18000;  // spell elixir
        int dElixir = 25000;  // dragon elixir
        int Elixir = 0;
    
        

    public int cal_Elixir  (int train, int number) {
         switch (train) {
             case 1: Elixir = bElixir*number;
             break;
             case 2: Elixir = aElixir*number;
             break;
             case 3: Elixir = gtElixir*number;
             break;
             case 4: Elixir = gbElixir*number;
             break;
             case 5: Elixir = wbElixir*number;
             break;
             case 6: Elixir = blElixir*number;
             break;
             case 7: Elixir = wzElixir*number;
             break;
             case 8: Elixir = hElixir*number;
             break;
             case 9: Elixir = sElixir*number;
             break;
             case 10:Elixir = dElixir*number;
             break;
             default: Elixir = 0;
             break;
         }
        return Elixir;
    }     

}