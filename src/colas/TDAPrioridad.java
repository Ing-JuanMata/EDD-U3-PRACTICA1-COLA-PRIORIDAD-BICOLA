/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author ING-JUANMATA
 */
public class TDAPrioridad {

    private int prioridad;
    private char dato;

    /**
     * Constructor para la creacion de un objeto con prioridad
     * @param prioridad Orden de privilegio para el objeto
     * @param dato caracter a guardar en el objeto
     */
    public TDAPrioridad(int prioridad, char dato) {
        this.dato = dato;
        this.prioridad = prioridad;
    }

    /**
     * Regresa el orden de prioridad
     * @return Orden de prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * Establece el orden de prioridad
     * @param prioridad Nuevo orden de prioridad
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Muestra el dato que tiene guardado el objeto
     * @return caracter almacenado
     */
    public char getDato() {
        return dato;
    }

    /**
     * Establece el dato guardado en el objeto
     * @param dato Nuevo dato a almacenar
     */
    public void setDato(char dato) {
        this.dato = dato;
    }

    /**
     * Copia los valores del objeto prioridad en el objeto actual
     * @param obj Objeto del que se planeo obtener los datos
     */
    public void setObjeto(TDAPrioridad obj) {
        this.prioridad = obj.prioridad;
        this.dato = obj.dato;
    }
    
    @Override
    public String toString(){
        return String.format("%c, %d", dato, prioridad);
    }

}
