package br.feevale.movery.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.feevale.movery.R;
import br.feevale.movery.services.AuthenticationService;
import br.feevale.movery.utils.Constants;
import br.feevale.movery.utils.Validate;
import butterknife.BindView;

public class SignUpActivity extends AppCompatActivity {
    @BindView(R.id.txtName) EditText txtName;
    @BindView(R.id.txtEmail) EditText txtEmail;
    @BindView(R.id.txtPhone) EditText txtPhone;
    @BindView(R.id.txtPassword) EditText txtPassword;
    @BindView(R.id.btnSignUp) Button btnSignUp;

    private AuthenticationService authenticationService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initComponents();
    }

    private void initComponents() {
        authenticationService = new AuthenticationService(this);

        txtName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Validate.name(txtName)) {
                    txtName.setError(Constants.INVALID_NAME);
                }
            }
        });

        txtEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Validate.email(txtEmail)) {
                    txtName.setError(Constants.INVALID_EMAIL);
                }
            }
        });

        txtPhone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Validate.phone(txtPhone)) {
                    txtName.setError(Constants.INVALID_PHONE);
                }
            }
        });

        txtPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Validate.password(txtPassword)) {
                    txtName.setError(Constants.INVALID_PASSWORD);
                }
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validate.name(txtName)   &&
                    Validate.email(txtEmail) &&
                    Validate.phone(txtPhone) &&
                    Validate.password(txtPassword)) {

                    authenticationService.signUp(
                        txtName.getText().toString(),
                        txtEmail.getText().toString(),
                        txtPhone.getText().toString(),
                        txtPassword.getText().toString()
                    );
                }
            }
        });
    }
}
