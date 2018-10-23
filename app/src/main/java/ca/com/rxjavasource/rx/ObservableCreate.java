package ca.com.rxjavasource.rx;

/**
 * Created by wscjw on 2018/10/23.
 */

public class ObservableCreate<T> extends Observable<T> {
    private ObservableOnSubscribe<T> source;

    public ObservableCreate(ObservableOnSubscribe<T> source) {
        this.source = source;
    }

    @Override
    protected void subscribeActual(Observer<? super T> observer) {
        CreateEmitter<T> parent = new CreateEmitter<T>(observer);
        observer.onSubscribe(parent);
        try {
            source.subscribe(parent);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static final  class  CreateEmitter<T> implements ObservableEmitter<T>,Disposable{
         private Observer<? super T> observer;
       public CreateEmitter(Observer observer) {
           this.observer = observer;
       }

        @Override
        public void setDisposable() {

        }
        @Override
        public void onNext(T value) {
            observer.onNext(value);
        }

        @Override
        public void onError(Throwable error) {
            observer.onError(error);
        }

        @Override
        public void onComplete() {
            observer.onComplete();
        }


        @Override
        public void setCancellable() {

        }

        @Override
        public void dispose() {

        }

        @Override
        public boolean isDisposed() {
            return false;
        }

        @Override
        public ObservableEmitter serialize() {
            return null;
        }

    }
}
