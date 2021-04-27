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

    public ColaPrioridad(int tam) {
        datos = new TDAPrioridad[tam];
        ini = fin = -1;
    }

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

    protected boolean colaLlena() {
        return fin == datos.length - 1;
    }

    protected boolean colaVacia() {
        return ini == -1;
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

    public TDAPrioridad getDato(int pos) {
        return datos[pos];
    }

}
