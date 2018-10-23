package ca.com.rxjavasource.rx;

/**
 * Created by wscjw on 2018/10/23.
 */

public interface Observer<T> {
    void onSubscribe( Disposable d);
    void onNext( T t);
    void onError( Throwable e);
    void onComplete();

}
