
package Boleto;

import java.util.Scanner;

public class Cotizacion {
    //Atributos
    public int numeroCotizacion;
    public String descripcion;
    public double precio;
    public int porcentaje;
    public int plazo;
    
    
        //Constructor Vacio
    public Cotizacion() {
        this.numeroCotizacion = 0;
        this.descripcion = "";
        this.precio = 0;
        this.porcentaje = 0;
        this.plazo = 0;
                
    }
        //Constructor Parametros
    public Cotizacion(int numeroCotizacion, String descripcion, double precio, int porcentaje, int plazo) {
        this.numeroCotizacion = numeroCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentaje = porcentaje;
        this.plazo = plazo;
    }
        //Constructor Copia
    public Cotizacion(Cotizacion cotizacion){
        this.numeroCotizacion = cotizacion.numeroCotizacion;
        this.descripcion = cotizacion.descripcion;
        this.precio = cotizacion.precio;
        this.porcentaje = cotizacion.porcentaje;
        this.plazo = cotizacion.plazo;
    }

    /**
     * @return the numeroCotizacion
     */
    public int getNumeroCotizacion() {
        return numeroCotizacion;
    }

    /**
     * @param numeroCotizacion the numeroCotizacion to set
     */
    public void setNumeroCotizacion(int numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentaje
     */
    public int getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    public void capturarInformacion (){
        Scanner s = new Scanner(System.in);
        System.out.println("Numero de Cotizacion: ");
        this.numeroCotizacion = s.nextInt();
        System.out.println("Descripcion: ");
        this.descripcion = s.nextLine();
        System.out.println("Precio: ");
        this.precio = s.nextDouble();
        System.out.println("Porcentaje inicial: ");
        this.porcentaje = s.nextInt();
        System.out.println("Plazo: ");
        this.plazo = s.nextInt();
        
    }
     public double pagoInicial(){   
        return ((this.precio)/(100/this.porcentaje));
    }
    public double totalFinanciar(){
        int aux = (100 - this.porcentaje);
        return ((this.precio)/(100/aux));
    }
    public double pagoMensual(){
        return totalFinanciar() / this.plazo;
    }
}
