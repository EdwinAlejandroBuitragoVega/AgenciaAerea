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
public abstract class Aviones {

    private int velocidad;
    private String matricula;
    private String hora;
    private String Destino;

    public Aviones(int velocidad, String matricula,String hora, String Destino) {
        this.velocidad = velocidad;
        this.matricula = matricula;
          this.hora = hora;
        this.Destino = Destino;
    }

    public Aviones() {
      
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract void Visualisar();
}