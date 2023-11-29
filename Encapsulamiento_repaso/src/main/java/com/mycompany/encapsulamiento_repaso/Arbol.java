
package com.mycompany.encapsulamiento_repaso;


public class Arbol {
    // si ponemos delante private, ya no se puede acceder a ella, tenemos que usar "metodos" para q podamos acceder a ella
    
    int ramas;
    private String tipo; // caduco o permenne
    private double hojas;
    
    public void setTipo(String tipo){
        this.tipo = tipo;
        //ahr esto q acabo de escribir se conectara con el private, para que pueda acceder a ella en el main(Encapsulamiento_repaso.java(en esta caso))
    }   //es decir el public es "poco seguro" y el private es para q halla mas segurirdad;
    
    
    public String getTipo(){
        return this.tipo;
    }

    /**
     * @return the hojas
     */
    public double getHojas() {
        return hojas;
    }

    /**
     * @param hojas the hojas to set
     */
    public void setHojas(double hojas) {
        this.hojas = hojas;
    }
    
   
    
}
