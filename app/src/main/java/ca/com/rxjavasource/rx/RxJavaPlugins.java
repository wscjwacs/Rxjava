package ca.com.rxjavasource.rx;

/**
 * Created by wscjw on 2018/10/23.
 */

public class RxJavaPlugins {
    public static <T> Observable<T> onAssembly(ObservableCreate<T> observable) {
        return observable;
    }
}
