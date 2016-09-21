package gt.com.intecap.usuarios.data;


import android.content.ContentValues;

import java.util.UUID;

import gt.com.intecap.usuarios.data.DBUsuario.DBUsuarioEntidad;

public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String dpi;

    public Usuario (String nombre, String apellido, String direccion, String telefono, String dpi){
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dpi = dpi;
    }


    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDpi() {
        return dpi;
    }

    public String getDireccion() {
        return direccion;
    }


    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(DBUsuarioEntidad.ID, id);
        values.put(DBUsuarioEntidad.NOMBRE, nombre);
        values.put(DBUsuarioEntidad.APELLIDO, apellido);
        values.put(DBUsuarioEntidad.DIRECCION, direccion);
        values.put(DBUsuarioEntidad.TELEFONO, telefono);
        values.put(DBUsuarioEntidad.DPI, direccion);
        return values;
    }
}
