package br.feevale.movery;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if( usuarioNaoRegistrado() ) {
//            setContentView( );
        }

        setContentView(R.layout.tela_inicial);
    }

    private boolean usuarioNaoRegistrado() {

        MoveryDBHelper mdbh = new MoveryDBHelper( this );
        SQLiteDatabase sqlDB = mdbh.getReadableDatabase();




        return true;
    }
}
