package ca.com.rxjavasource.rx;


/**
 * Created by wscjw on 2018/10/23.
 */

public interface ObservableOnSubscribe<T> {
    void subscribe( ObservableEmitter<T> e) throws Exception;
}
