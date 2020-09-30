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
    private JTextField fieldText2;
    private JTextField fieldText3;
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
        fieldText2 = new JTextField( "", 28);
        add( fieldText2 );
        fieldText3 = new JTextField( "", 28);
        add( fieldText3 );
        
        
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
        
        ListenerCheckBox manejador = new ListenerCheckBox();
         
        CheckBoxDaughters.addItemListener( manejador );
        CheckBoxSons.addItemListener( manejador );
    }

    private class ManejadorBotonOpcion implements ItemListener {

        String resultado;
        
        public ManejadorBotonOpcion(String genero) {
            resultado = "you gender is " + genero;
        }
        
        @Override
        public void itemStateChanged(ItemEvent ie) {
            fieldText.setText(resultado);
        }
    }

    private class ListenerCheckBox implements ItemListener {

        String daughters = "you have daughters";
        String sons = "you have sons";

         public void itemStateChanged(ItemEvent ie) {
            if ( ie.getSource() == CheckBoxDaughters ){
                fieldText2.setText(daughters);
            }
            
            if ( ie.getSource() == CheckBoxSons ){
                fieldText3.setText(sons);
            }
        }
    }
    
}
