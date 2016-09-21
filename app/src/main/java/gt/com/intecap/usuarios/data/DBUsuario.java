package gt.com.intecap.usuarios.data;

import android.provider.BaseColumns;

public class DBUsuario {


    public static abstract class DBUsuarioEntidad implements BaseColumns{
        public static final String TABLE_NAME = "usuarios";
        public static final String ID = "id";
        public static final String NOMBRE = "nombre";
        public static final String APELLIDO = "apellido";
        public static final String DIRECCION = "direccion";
        public static final String TELEFONO = "telefono";
        public static final String DPI = "dpi";
    }
}
