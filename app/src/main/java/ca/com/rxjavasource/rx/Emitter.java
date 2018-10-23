package ca.com.rxjavasource.rx;

/**
 * Created by wscjw on 2018/10/23.
 */

public interface Emitter<T> {

    void onNext( T value);
    void onError( Throwable error);
    void onComplete();
}
