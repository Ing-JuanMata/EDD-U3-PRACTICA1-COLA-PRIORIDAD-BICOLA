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

    public ColaPrioridadBicola(int tam) {
        super(tam);
    }

    public boolean insertarINI(char dato, int prioridad) {
        if (ini == 0) {
            return false;
        }

        ini--;
        datos[ini] = new TDAPrioridad(prioridad, dato);
        priorizar();
        return true;
    }

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
