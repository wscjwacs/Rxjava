package ca.com.rxjavasource.rx;

/**
 * Created by wscjw on 2018/10/23.
 */

public interface ObservableEmitter<T> extends Emitter<T> {

    void setDisposable( );
    void setCancellable( );
    boolean isDisposed();
    ObservableEmitter<T> serialize();
}
