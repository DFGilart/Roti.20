

package com.mycompany.encapsulamiento_repaso;
//irse al com.mycomnapy.enpacpuslamiento boton derecho new javaclass= Arbol

public class Encapsulamiento_repaso {
    
    public static void main(String[] args) {
        Arbol objeto_arbol = new Arbol();
        
        objeto_arbol.setHojas(100);
        objeto_arbol.setTipo("caduca");
        
        System.out.println(objeto_arbol.getTipo());
                
        
    }
}
