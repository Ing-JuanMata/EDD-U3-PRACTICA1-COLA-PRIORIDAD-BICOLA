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
public class ColaPrioridadBicola extends ColaPrioridad {

    /**
     * Constructor para iniciar el vector con un numero de celdillas estandar
     *
     * @param tam cantidad de celdillas a utilizar
     */
    public ColaPrioridadBicola(int tam) {
        super(tam);
    }

    /**
     * Metodo de insercion de datos propio de la bicola, usando el inicio para
     * encolar el dato nuevo
     *
     * @param dato caracter a almacenar
     * @param prioridad orden de privilegio para entrar en la cola
     * @return TRUE - SE INSERTO, FALSE - COLA LLENA POR INI
     */
    public boolean insertarINI(char dato, int prioridad) {
        if (ini == 0) {
            return false;
        }

        ini--;
        datos[ini] = new TDAPrioridad(prioridad, dato);
        priorizar();
        return true;
    }

    /**
     * Metodo de eliminacion propio de la bicola, usando el final para borrar
     * logicamente un dato
     *
     * @return TRUE - SE ELIMINO UN DATO, FALSE - NO HAY DATOS
     */
    public boolean EliminarFin() {
        if (super.colaVacia()) {
            return false;
        }

        if (fin == ini) {
            ini = fin = -1;
        } else {
            fin--;
        }

        return true;
    }

    /**
     * Dado que se ingresa desde otro punto se prioriza bajo otras condiciones,
     * al ser privado los metodos del padre y del hijo estos no se sobreescriben
     */
    private void priorizar() {
        if (ini == fin) {
            return;
        }

        int t1 = ini, t2 = ini + 1;
        TDAPrioridad aux = new TDAPrioridad(0, 'o');
        while (t1 != fin) {
            if (datos[t1].getPrioridad() <= datos[t2].getPrioridad()) {
                aux.setObjeto(datos[t2]);
                datos[t2].setObjeto(datos[t1]);
                datos[t1].setObjeto(aux);
                t1 = t2++;
            } else {
                break;
            }
        }
    }

}
