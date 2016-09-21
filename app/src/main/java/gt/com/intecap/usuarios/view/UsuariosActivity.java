package gt.com.intecap.usuarios.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import gt.com.intecap.usuarios.R;


public class UsuariosActivity extends AppCompatActivity {
    public static final String EXTRA_LAWYER_ID = "extra_lawyer_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        UsuariosFragment fragment = (UsuariosFragment)
                getSupportFragmentManager().findFragmentById(R.id.usuarios_container);
        if (fragment == null){
            fragment = UsuariosFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.usuarios_container, fragment)
                    .commit();
        }
    }
}