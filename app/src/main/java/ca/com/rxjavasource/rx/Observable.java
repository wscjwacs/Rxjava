package ca.com.rxjavasource.rx;

/**
 * Created by wscjw on 2018/10/23.
 */

public abstract class Observable<T> implements ObservableSource<T> {


    @Override
    public void subscribe(Observer<T> observer) {
        subscribeActual(observer);
    }
    protected abstract void subscribeActual(Observer<? super T> observer);

    public static <T> Observable<T> create(ObservableOnSubscribe<T> source) {
         return RxJavaPlugins.onAssembly(new ObservableCreate<T>(source));
    }
}
