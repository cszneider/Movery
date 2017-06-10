package br.feevale.movery.services;

import android.content.Context;

import com.auth0.android.Auth0;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.BaseCallback;
import com.auth0.android.result.Credentials;

/**
 * Created by rodrigo.dagnese on 08/06/2017.
 */

public class AuthenticationService {
  private Auth0 account;
  private AuthenticationAPIClient authentication;

  public AuthenticationService(Context context) {
    account = new Auth0(context);
    authentication = new AuthenticationAPIClient(account);
  }

  public void signIn(String name, String password) {
    authentication.login(name, password)
      .start(new BaseCallback<Credentials, AuthenticationException>() {
        @Override
        public void onSuccess(Credentials payload) {

        }

        @Override
        public void onFailure(AuthenticationException error) {

        }
      });
  }

  public void logout() {}
}
