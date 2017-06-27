package br.feevale.movery.activities.async;

/**
 * Created by dagneserodrigo on 6/24/17.
 */

public interface CallbackActivity<T> {
    void onSucess(T response);
    void onError(T error);
}
