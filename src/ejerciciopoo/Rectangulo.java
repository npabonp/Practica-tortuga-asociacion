
package ejerciciopoo;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class Rectangulo {
   private int ancho;
   private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
      
    public void dibujar (Turtle turtle){
      //Dibujar
      turtle.setPos(-100,-150);
      turtle.setColor (Color.orange);
      turtle.forward(this.alto);
      turtle.right (90);
      turtle.forward(this.ancho);
      turtle.right(90);
      turtle.forward
      
    
      
    }
}
