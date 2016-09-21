package gt.com.intecap.usuarios.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import gt.com.intecap.usuarios.data.DBUsuario.DBUsuarioEntidad;


public class DataBase extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Usuarios.db";

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DBUsuarioEntidad.TABLE_NAME + " ("
                + DBUsuarioEntidad._ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + DBUsuarioEntidad._ID + "TEXT NOT NULL,"
                + DBUsuarioEntidad.NOMBRE + "TEXT NOT NULL,"
                + DBUsuarioEntidad.APELLIDO + "TEXT NOT NULL,"
                + DBUsuarioEntidad.DIRECCION + "TEXT NOT NULL,"
                + DBUsuarioEntidad.TELEFONO + "TEXT NOT NULL,"
                + DBUsuarioEntidad.DPI + "TEXT NOT NULL,"
                + "UNIQUE(" + DBUsuario.DBUsuarioEntidad.ID + "))");
    }
    public long guadarUsuario(Usuario usuario){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.insert(
                DBUsuarioEntidad.TABLE_NAME,
                null,
                usuario.toContentValues());
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
