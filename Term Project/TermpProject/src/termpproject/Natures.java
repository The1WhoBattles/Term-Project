/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termpproject;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Renderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author c0704435
 */

public class Natures extends JFrame  {

    String[] columnNames = {"Nature", "Increases", "Decreases"
    };

    public Natures() {
        Object[][] data = new Object[][]{
            {"Lonely", "Atk", "Def", false},
            {"Adamant", "Atk", "Spec Atk", false},
            {"Naughty", "Atk", "Spec Def", false},
            {"Brave", "Atk", "Spd", false},
            {"Bold", "Def", "Atk", false},
            {"Impish", "Def", "Spec Atk", false},
            {"Lax", "Def", "Spec Def", false},
            {"Relaxed", "Def", "Spd", false},
            {"Modest", "Spec Atk", "Atk", false},
            {"Mild", "Spec Atk", "Def", false},
            {"Rash", "Spec Atk", "Spec Def", false},
            {"Quiet", "Spec Atk", "Spd", false},
            {"Calm", "Spec Def", "Atk", false},
            {"Gentle", "Spec Def", "Def", false},
            {"Careful", "Spec Def", "Spec Atk", false},
            {"Sassy", "Spec Def", "Spd", false},
            {"Timid", "Spd", "Atk", false},
            {"Hasty", "Spd", "Def", false},
            {"Jolly", "Spd", "Spec Atk", false},
            {"Naive", "Spd", "Spec Def", false},
            {"Hardy", "N/A", "N/A", false},
            {"Docile", "N/A", "N/A", false},
            {"Bashful", "N/A", "N/A", false},
            {"Quirky", "N/A", "N/A", false},
            {"Serious", "N/A", "N/A", true}
        };
        JTable table = new JTable(data, columnNames);

        //add the table to the frame
        this.add(new JScrollPane(table));

        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Natures();
            }
        });
    }
}
