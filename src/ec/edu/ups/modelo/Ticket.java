/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.time.LocalDateTime;

/**
 *
 * @author HI andres
 */
public class Ticket {

    private int numero;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;
    private double total;
    private Vehiculo vehiculo;
    
    //atributo extra
    private int fracciones;

    public Ticket(LocalDateTime fechaEntrada, Vehiculo vehiculo) {
        this.fechaEntrada = fechaEntrada;
        this.vehiculo = vehiculo;
    }

    public Ticket(int numero, LocalDateTime fechaEntrada, LocalDateTime fechaSalida, double total, Vehiculo vehiculo) {
        this.numero = numero;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.total = total;
        this.vehiculo = vehiculo;
    }

    public Ticket() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        if (fechaSalida == null) {
            return "";
        } else {
            return fechaSalida.toString();
        }
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getFracciones() {
        return fracciones;
    }
    
    public String calcularTiempo() {
        int dias = (fechaSalida.getMonth().length(esAñoBisiesto(fechaSalida.getYear()))) - (fechaEntrada.getMonth().length(esAñoBisiesto(fechaEntrada.getYear())));
        int horas = fechaSalida.getHour() - fechaEntrada.getHour();
        int minutos = fechaSalida.getMinute() - fechaEntrada.getMinute();
        int segundos = fechaSalida.getSecond() - fechaEntrada.getSecond();
        
        if (segundos < 0) {
            --minutos;
            segundos += 60;
            
        }
        if (minutos < 0) {
            --horas;
            minutos += 60;
            
        }
        if (horas < 0) {
            --dias;
            horas += 24;
        }
        
        minutos += (dias * 1440) + (horas * 60);
        fracciones = 1 + (minutos/10);
        total = Double.valueOf(fracciones + "") * 0.25;
        
        if (dias > 0) {
            return dias + "dias, " + horas + "horas, " + minutos + "minutos, " + segundos + "segundos.";
            
        } else if (horas > 0) {
            return horas + "horas, " + minutos + "minutos, " + segundos + "segundos.";
            
        } else {
            return minutos + "minutos, " + segundos + "segundos."; 
        }
    }

    public boolean esAñoBisiesto(int año) {
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            return true;
            
        } else {
            return false;
            
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

}
