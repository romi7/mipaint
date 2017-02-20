/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author ruben
 */
public class Linea extends Forma{
    
    
     Color color = null;
    
    
    boolean relleno = false;
    
    public Linea(int _posX, int _posY, Color _color, boolean _relleno){
        super(_posX, _posY,new int[2],new int[2],_color,_relleno, 2);
    
    }
    

}
