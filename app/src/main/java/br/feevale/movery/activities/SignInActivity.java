package br.feevale.movery.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import br.feevale.movery.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SignInActivity extends BaseActivity {
    @BindView(R.id.txtEmail) TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);
    }


}
