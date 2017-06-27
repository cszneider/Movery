package br.feevale.movery.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.auth0.android.Auth0;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.BaseCallback;
import com.auth0.android.result.Credentials;

import br.feevale.movery.MainActivity;
import br.feevale.movery.activities.BaseActivity;

/**
 * Created by rodrigo.dagnese on 08/06/2017.
 */

public class AuthenticationService {
    private Auth0 account;
    private AuthenticationAPIClient authentication;
    private BaseActivity activity;
    private Context context;

    public AuthenticationService(BaseActivity activityContext) {
        account = new Auth0(activityContext);
        authentication = new AuthenticationAPIClient(account);
        activity = activityContext;
        context = (Context) activity;
    }

    public void signIn(String email, String password) {
        authentication.login(email, password)
                .start(new BaseCallback<Credentials, AuthenticationException>() {
                    @Override
                    public void onSuccess(Credentials payload) {
                        Intent intent = new Intent(context, MainActivity.class);
                        context.startActivity(intent);
                    }

                    @Override
                    public void onFailure(AuthenticationException error) {
                    }
                });
    }

    public void signUp(String name, String email, String phone, String password) {
        //TODO endpoint to sign up user;
    }

    public void logout() {
    }
}
