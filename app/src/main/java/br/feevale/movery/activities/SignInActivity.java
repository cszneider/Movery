package br.feevale.movery.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.feevale.movery.R;
import br.feevale.movery.activities.async.CallbackActivity;
import br.feevale.movery.services.AuthenticationService;
import br.feevale.movery.utils.Constants;
import br.feevale.movery.utils.Validate;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SignInActivity extends BaseActivity {
    @BindView(R.id.txtEmail) TextView txtEmail;
    @BindView(R.id.txtPassword) TextView txtPassword;
    @BindView(R.id.btnSignIn) Button btnSignIn;
    @BindView(R.id.lblSignUp) TextView lblSignUp;

    private AuthenticationService authenticationService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);

        initComponents();
    }

    private void initComponents() {
        authenticationService = new AuthenticationService(this);

        txtEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Validate.email(txtEmail)) {
                    txtEmail.setError(Constants.INVALID_EMAIL);
                }
            }
        });

        txtPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Validate.password(txtPassword)) {
                    txtPassword.setError(Constants.INVALID_PASSWORD);
                }
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validate.password(txtPassword)) {
                    signIn(txtEmail.getText().toString(), txtPassword.getText().toString());
                }
            }
        });

        lblSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }

    private void signIn(String email, String password) {
        authenticationService.signIn(email, password);
    }

    private void signUp() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
