package br.feevale.movery.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by rodrigo.dagnese on 08/06/2017.
 */

public class BaseActivity extends AppCompatActivity {
  private ProgressDialog progressDialog;
  private AlertDialog alertDialog;

  public void longToast(String message) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
  }

  public void alertMessage(String message) {}
}
