
package com.portfolio.bcs.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author BENJO
 */
public class dtoProyecto {
    
    @NotBlank
    private String nombre;
     @NotBlank
    private String descripcion;
     @NotBlank
    private String imag;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcion, String imag) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imag = imag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }

  

     
     
}
