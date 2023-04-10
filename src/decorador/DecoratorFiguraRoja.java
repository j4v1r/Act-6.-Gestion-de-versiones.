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
public class DecoratorFiguraRoja extends DecoratorFigura {

    public DecoratorFiguraRoja(Figura figuraDecorada) {
        super(figuraDecorada);
    }

    @Override
    public void dibujar() {
        figuraDecorada.dibujar();
        setContornoRojo(figuraDecorada);
    }

    private void setContornoRojo(Figura figuraDecorada) {
        System.out.println("Color Contorno: Rojo");
    }
}
