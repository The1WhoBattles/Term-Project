/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termpproject;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author c0704435
 */

public class TermpProject extends JFrame {
   String[] columnNames = {"Type", "HP", "Atk"
, "Def", "Spd", "Spec Atk", "Spec Def" };
   
Object[][] data =  new Object[][] {
{"Bug", "31", "31", "31", "30", "31", "30", false },
{"Dark", "31", "31", "31","31", "31", "31", false },
{"Dragon", "30", "31", "31","31", "31", "31", false },
{"Electric", "31", "31", "31","31", "30", "31",false },
{"Fighting", "31", "31", "30", "30", "30", "30",false},
{"Fire", "31", "30", "31", "30", "30", "31", false},
 {"Flying", "31", "31", "31","30", "30", "30", false },
{"Ghost", "31", "30", "31", "31", "31", "30", false },
{"Grass","30", "31", "31", "31", "30", "31", false },
{"Ground", "31", "31", "31","31", "30", "30", false },
{"Ice", "31", "31", "31", "30", "31", "31", false },
{"Poison", "31", "31", "30" , "31", "30", "30", false},
{"Psychic", "30" ,"31", "31","30", "31", "31", false },
{"Rock", "31", "31", "30", "30", "31", "30", false},
{"Steel", "31", "31", "31","31", "31", "30", false },
{"Water", "31", "31", "31", "30", "30", "31", false }
};

JTable table = new JTable(data, columnNames);
 JScrollPane tableScrollPane = new JScrollPane(table);
}
  
    /**
     * @param args the command line arguments
     */
  


    
    

