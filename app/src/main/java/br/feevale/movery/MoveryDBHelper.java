package br.feevale.movery;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by carlosschneider on 27/05/17.
 */
public class MoveryDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "MoveryDB";
    private static final int DB_VERSION = 1;

    public MoveryDBHelper(Context context) {
        super( context, DB_NAME, null, DB_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        StringBuilder cmd = new StringBuilder();
        cmd.append( "create table DadosUsuario (" );
        cmd.append( "  dsEmail varchar( 120 ) not null," );
        cmd.append( "  dsNome varchar( 120 ) not null," );
        cmd.append( "  dsToken varchar( 120 )," );
        cmd.append( "  primary key ( dsEmail ) );" );

        sqLiteDatabase.execSQL( cmd.toString() );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {



    }
}
