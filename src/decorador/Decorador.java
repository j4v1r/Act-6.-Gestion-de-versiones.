/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

import java.awt.Shape;

/**
 *
 * @author Rogelio Colunga R
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Figura rectangulo = new Rectangulo();
        
        Figura rectanguloRojo = new DecoratorFiguraRoja(new Rectangulo());
        
        rectangulo.dibujar();
        
        rectanguloRojo.dibujar();
        
        
    }
    
}
