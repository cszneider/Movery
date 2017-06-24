package br.feevale.movery.services;

import android.content.Context;
import android.content.Intent;

import com.auth0.android.Auth0;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.BaseCallback;
import com.auth0.android.result.Credentials;

import br.feevale.movery.MainActivity;

/**
 * Created by rodrigo.dagnese on 08/06/2017.
 */

public class AuthenticationService {
    private Auth0 account;
    private AuthenticationAPIClient authentication;
    private Context context;

    public AuthenticationService(Context activityContext) {
        account = new Auth0(activityContext);
        authentication = new AuthenticationAPIClient(account);
        context = activityContext;
    }

    public void signIn(String email, String password) {
        authentication.login(email, password)
                .start(new BaseCallback<Credentials, AuthenticationException>() {
                    @Override
                    public void onSuccess(Credentials payload) {
                        Intent intent = new Intent(context, MainActivity.class);
                    }

                    @Override
                    public void onFailure(AuthenticationException error) {

                    }
                });
    }

    public void logout() {
    }
}
