/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author Rogelio Colunga R
 */
public abstract class DecoratorFigura implements Figura{
    
    protected Figura figuraDecorada;
    
    public DecoratorFigura(Figura figuraDecorada){
        this.figuraDecorada = figuraDecorada;
    }
    
    public void dibujar() {figuraDecorada.dibujar();}
    
}
