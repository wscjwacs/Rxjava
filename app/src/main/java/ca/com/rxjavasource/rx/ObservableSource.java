package ca.com.rxjavasource.rx;

/**
 * Created by wscjw on 2018/10/23.
 */

public interface ObservableSource<T> {
    void  subscribe( Observer<T> observer);
}
