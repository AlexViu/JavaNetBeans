/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiocheck;

/**
 *
 * @author aledom
 */

    import java.awt.FlowLayout;
 import java.awt.Font;
 import java.awt.event.*;
 import javax.swing.*;

public class window extends JFrame{
    
    private JTextField fieldText;
    private JRadioButton simpleJRadioButton1;
    private JRadioButton simpleJRadioButton2;
    private JCheckBox CheckBoxDaughters;
    private JCheckBox CheckBoxSons;
    private ButtonGroup optionsGroup;
    
    public window() {
        setTitle( "Proving RadioButton" );
        setLayout( new FlowLayout() );

        fieldText = new JTextField( "", 28);
        add( fieldText );
        
        simpleJRadioButton1 = new JRadioButton( "Male", false );
        simpleJRadioButton2 = new JRadioButton( "Female", false );
        
        add( simpleJRadioButton1 );
        add( simpleJRadioButton2 );
        
        optionsGroup = new ButtonGroup(); // crea ButtonGroup
        optionsGroup.add( simpleJRadioButton1 );
        optionsGroup.add( simpleJRadioButton2 );
        
        
        CheckBoxDaughters = new JCheckBox( "Daughters" );
        CheckBoxSons = new JCheckBox( "Sons" );
         
        add( CheckBoxDaughters );
        add( CheckBoxSons );
        
        
        String male = "male";
        String female = "female";
        simpleJRadioButton1.addItemListener( new ManejadorBotonOpcion(male) );
        simpleJRadioButton2.addItemListener( new ManejadorBotonOpcion(female) );
         
    }

    private static class ManejadorBotonOpcion implements ItemListener {

        String resultado;
        
        public ManejadorBotonOpcion(String genero) {
            
        }

        @Override
        public void itemStateChanged(ItemEvent ie) {
            fieldText.setText(resultado);
        }
    }

    
}
