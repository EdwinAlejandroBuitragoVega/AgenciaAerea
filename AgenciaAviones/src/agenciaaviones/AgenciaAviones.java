/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaaviones;

/**
 *
 * @author Edwin Alejandro Buitrago Vega
 */
public class AgenciaAviones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario in = new Inventario();
        Comercial av1 = new Comercial(4,350, "HK345","12:50","New york");
        Carga c1 = new Carga(320000, 250, "N7224N","19:45","Cali");
        Paquete p = new Paquete("Pera", 120000.0);
        c1.addPaquete(p);
        Paquete p2 = new Paquete("Papa", 150000.0);
        c1.addPaquete(p2);
        Paquete p3 = new Paquete("Zanahoria", 170000.0);
        c1.addPaquete(p3);
        String[] nombres = {"Hannah Abbott", "Bathsheda Babbling", "Regulus Arcturus Black", "Fleur Delacour", "Gregory Goyle"};
        String[] ids = {"1EFAA", "AM27363", "US27272", "GBR2828", "US35353"};
        for (int i = 0; i < nombres.length; i++) {
            av1.addPasajero(new Pasajero(nombres[i], ids[i]));
        }
        in.addAvion(av1);
        in.addAvion(c1);
        in.listaAviones();
    }
    
}

