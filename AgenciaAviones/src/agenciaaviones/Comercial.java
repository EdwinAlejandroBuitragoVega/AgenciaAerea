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
import java.util.*;
public class Comercial extends Aviones {

    private final int numMaxPasajeros;
    private int numPasajeros = 0;
    private final ArrayList<Pasajero> pasajeros = new ArrayList<>();

    public Comercial(int numMaxPasajeros, int velocidad, String matricula,String origen, String destino) {
        super(velocidad, matricula,origen,destino);
        this.numMaxPasajeros = numMaxPasajeros;
    }

    public void addPasajero(Pasajero pasajero) {
        System.out.println("Agregando a... "+pasajero.getNombre()+"...");
        if (numPasajeros != numMaxPasajeros) {
            pasajeros.add(pasajero);
            numPasajeros++;
        } else {
            System.out.println("Avión comercial lleno. No es posible agregar a "+ pasajero.getNombre() );}

    }

    @Override
    public void Visualisar() {
        System.out.println("Avión comercial matrícula: " + this.getMatricula() + ", capacidad: " + this.numMaxPasajeros + ", Velocidad: " + this.getVelocidad() + " Km/h");
        System.out.println("Hora de Partida: "+this.getHora()+"     Destino: "+this.getDestino());
        pasajeros.forEach((auxpas) -> {
            System.out.println(auxpas.toString());
        });
    }
}

