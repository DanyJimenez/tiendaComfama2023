package org.example.classes;

public class Producto {
    private  Integer id;
    private  String  nombre;
    private  String  costoUnitario;
    public final  Double IVA = 0.19;
    private Proveedor proveedor;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String costoUnitario, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
        this.proveedor = proveedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(String costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Double getIVA() {
        return IVA;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
