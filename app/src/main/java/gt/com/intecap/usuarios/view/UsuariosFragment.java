package gt.com.intecap.usuarios.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gt.com.intecap.usuarios.R;


public class UsuariosFragment extends Fragment {
    public UsuariosFragment() {
        // Required empty public constructor
    }


    public static UsuariosFragment newInstance() {
        return new UsuariosFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_usuarios, container, false);
        return vista;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}
