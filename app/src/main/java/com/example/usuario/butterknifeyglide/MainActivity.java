package com.example.usuario.butterknifeyglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.nombre) EditText nombre;
@BindView(R.id.apellidos) EditText apellidos;
@BindView(R.id.telefono) EditText telefono;
@BindView(R.id.button) Button boton1;
@BindView(R.id.button2) Button boton2;
@BindView(R.id.imagen) ImageView img;
@BindView(R.id.imagen2) ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String url="http://jakewharton.github.io/butterknife/static/logo.png";

        String url2="https://3.bp.blogspot.com/-DXP3XwTj9F4/Vbr-I9uny6I/AAAAAAAA3lo/qkAv40mjYM8/s640/glide_logo.png";

        Glide.with(this)
                .load(url)
                .into(img);
        Glide.with(this)
                .load(url2)
                .into(img2);

    }
    @OnClick({R.id.button,R.id.button2})
    public void funciones(View v){
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(this,nombre.getText().toString()+
                        " "+apellidos.getText().toString()+" "+telefono.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                nombre.setText("");
                apellidos.setText("");
                telefono.setText("");
                break;
            default:
                break;
        }
    }
}
