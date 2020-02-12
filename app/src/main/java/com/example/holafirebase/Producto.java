package com.example.holafirebase;

public class Producto {


  private String id;
  private String nombre;
  private String precio;
  public Producto(String id, String nombre, String precio) {
    this.id = id;
    this.nombre = nombre;
    this.precio= precio;
  }
  public Producto(String nombre, String precio) {

    this.nombre = nombre;
    this.precio= precio;
  }

  public Producto(){

  }
  public String getId() {
    return id;
  }
  public String getNombre() {
    return nombre;
  }
  public String getPrecio() {
    return precio;
  }



  public void setId(String id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPrecio(String precio) {
    this.precio = precio;
  }
}