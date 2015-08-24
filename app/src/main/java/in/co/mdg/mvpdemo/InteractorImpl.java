package in.co.mdg.mvpdemo;

import android.os.Handler;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 21-Aug-15
 */
public class InteractorImpl implements Interactor{

    @Override
    public void fetchData(final OnRequestFinishedListener listener) {

        final boolean temp = Math.random()<0.5; //random boolean
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(temp){
                    listener.onSuccess();
                }else{
                    listener.onError();
                }
            }
        },2000);
    }
}