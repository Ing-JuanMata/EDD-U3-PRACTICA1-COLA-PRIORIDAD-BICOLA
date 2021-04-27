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
public class ColaPrioridad {

    protected int ini, fin;
    protected TDAPrioridad[] datos;

    /**
     * Constructor para iniciar la cola con prioridad usando un numero
     * determinado de celdillas para el vector
     *
     * @param tam cantidad de celdillas que tendra el vector
     */
    public ColaPrioridad(int tam) {
        datos = new TDAPrioridad[tam];
        ini = fin = -1;
    }

    /**
     * funcion para hacer una insercion normal adelantando FIN para colocar el
     * nuevo valor
     *
     * @param dato caracter que se va a guardar en la cola
     * @param prioridad Se usa para colocar el caracter en la cola segun su
     * nivel de privilegio
     * @return TRUE - SE INSERTO, FALSE - NO SE INSERTO
     */
    public boolean insertar(char dato, int prioridad) {
        if (colaLlena()) {
            return false;
        }

        fin++;
        datos[fin] = new TDAPrioridad(prioridad, dato);
        ini = ini == -1 ? 0 : ini;
        priorizar();
        return true;
    }

    /**
     * Funcion para sacar un dato de cola normalmente usando el inicio del vecto
     *
     * @return TRUE - SE SACO UN DATO, FALSE - NO HAY DATOS
     */
    public boolean eliminar() {
        if (colaVacia()) {
            return false;
        }

        if (ini == fin) {
            ini = fin = -1;
        } else {
            ini++;
        }

        return true;
    }

    /**
     * Coloca el dato recien ingresado en su posicion correcta segun el nivel de
     * prioridad que este presente
     */
    private void priorizar() {
        if (ini == fin) {
            return;
        }

        int t1 = fin, t2 = fin - 1;
        TDAPrioridad aux = new TDAPrioridad(0, '0');
        while (t1 != ini) {
            if (datos[t1].getPrioridad() > datos[t2].getPrioridad()) {
                aux.setObjeto(datos[t1]);
                datos[t1].setObjeto(datos[t2]);
                datos[t2].setObjeto(aux);
                t2--;
                t1--;
            } else {
                break;
            }
        }
    }

    /**
     * Revisa si es posible ingresar mas caracteres al vector
     *
     * @return TRUE - COLA LLENA, FALSE - AUN TIENE ESPACIO
     */
    protected boolean colaLlena() {
        return fin == datos.length - 1;
    }

    /**
     * Revisa si la cola se encuentra sin datos
     *
     * @return TRUE - COLA SIMPLE, FALSE - TIENE DATOS
     */
    protected boolean colaVacia() {
        return ini == -1;
    }

    /**
     * Entrega el valor de control denominado INI
     * @return valor de la variable de control INI
     */
    public int getIni() {
        return ini;
    }

    /**
     * Entrega el valor de control denominado FIN
     * @return valor de la variable de control FIN
     */
    public int getFin() {
        return fin;
    }

    /**
     * Regresa el objeto con prioridad segun solicite el usuario
     *
     * @param pos posicion del vector donde se encuentra el objeto solicitado
     * @return Objeto de prioridad solicitado
     */
    public TDAPrioridad getDato(int pos) {
        return datos[pos];
    }

}
