/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendec.dao.beans;

/**
 *
 * @author William
 */
public class ProductoDTO {
    
    private String codigo;
    private String descripcion;
    private String detalle;
    private int stock;
    private double precio;
    private String imagen;
    
    public ProductoDTO(String codigo, String descripcion, String detalle, int stock, double precio, String imagen) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.stock = stock;
        this.precio = precio;
        this.imagen = imagen;
    }
    
      public ProductoDTO(String codigo) {
        this.codigo = codigo;
 
    }
      
     public String getCodigo() {
        return codigo;
    }
   
      public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
      
      public String getDescripcion() {
        return descripcion;
    }
      
       public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
    public String getDetalle() {
      return detalle;
    }
    
     public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
 
      public int getStock() {
        return stock;
    }
 
      public void setStock(int stock) {
        this.stock = stock;
    }
      
       public double getPrecio() {
        return precio;
    }
       
     public void setPrecio(double precio) {
        this.precio = precio;
    }
     
     public String getImagen() {
        return imagen;
    }
     
      public void setImagen(String imagen) {
        this.imagen = imagen;
    }
      
     
}

   
