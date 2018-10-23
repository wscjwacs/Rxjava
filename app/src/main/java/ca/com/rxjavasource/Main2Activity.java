package ca.com.rxjavasource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ca.com.rxjavasource.rx.Disposable;
import ca.com.rxjavasource.rx.Observable;
import ca.com.rxjavasource.rx.ObservableEmitter;
import ca.com.rxjavasource.rx.ObservableOnSubscribe;
import ca.com.rxjavasource.rx.Observer;

/**
 * 以下是自己手写Rxjava的实现
 */

public class Main2Activity extends AppCompatActivity {
    public static final String TAG = "Main2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Observable.create(new ObservableOnSubscribe<String>() {
           @Override
           public void subscribe(ObservableEmitter<String> e) throws Exception {
               e.onNext("手写实现->这是事件的源头！！！！");
               e.onComplete();
           }
       }).subscribe(new Observer<String>() {
           @Override
           public void onSubscribe(Disposable d) {
               Log.e(TAG, "onSubscribe: ->这是第一个被调用" );
           }

           @Override
           public void onNext(String s) {
               Log.e(TAG, "onNext:-> "+s );
           }

           @Override
           public void onError(Throwable e) {

           }
           @Override
           public void onComplete() {
               Log.e(TAG, "onNext:-> onComplete" );
           }
       });
    }
}
