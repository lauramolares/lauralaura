/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class ProductosFrescos extends Producto {
    private String fechaDeEnvasado;
    private String paisDeOrigen;

    /**
     * @return the fechaDeEnvasado
     */
    public String getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    /**
     * @param fechaDeEnvasado the fechaDeEnvasado to set
     */
    public void setFechaDeEnvasado(String fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    /**
     * @return the paisDeOrigen
     */
    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    /**
     * @param paisDeOrigen the paisDeOrigen to set
     */
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
}
