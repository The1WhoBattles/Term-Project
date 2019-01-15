/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termpproject;

/**
 *
 * @author c0704435
 */
/**
 *
 * @author c0704435
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.SwingUtilities;

public class HiddenPowerChecker extends JFrame {

    public HiddenPowerChecker() {
        //headers for the table
        String[] columnNames = {"Type", "HP", "Atk", "Def", "Spd", "Spec Atk", "Spec Def"
        };

        //actual data for the table in a 2d array
        Object[][] data = new Object[][]{
            {"Bug", "31", "31", "31", "30", "31", "30", false},
            {"Dark", "31", "31", "31", "31", "31", "31", false},
            {"Dragon", "30", "31", "31", "31", "31", "31", false},
            {"Electric", "31", "31", "31", "31", "30", "31", false},
            {"Fighting", "31", "31", "30", "30", "30", "30", false},
            {"Fire", "31", "30", "31", "30", "30", "31", false},
            {"Flying", "31", "31", "31", "30", "30", "30", false},
            {"Ghost", "31", "30", "31", "31", "31", "30", false},
            {"Grass", "30", "31", "31", "31", "30", "31", false},
            {"Ground", "31", "31", "31", "31", "30", "30", false},
            {"Ice", "31", "31", "31", "30", "31", "31", false},
            {"Poison", "31", "31", "30", "31", "30", "30", false},
            {"Psychic", "30", "31", "31", "30", "31", "31", false},
            {"Rock", "31", "31", "30", "30", "31", "30", false},
            {"Steel", "31", "31", "31", "31", "31", "30", false},
            {"Water", "31", "31", "31", "30", "30", "31", true}
        };
        //create table with data
        JTable table = new JTable(data, columnNames);

        //add the table to the frame
        this.add(new JScrollPane(table));

        this.setTitle("Hidden Power Checker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HiddenPowerChecker();
            }
        });
    }
}
