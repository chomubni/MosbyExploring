package com.example.ivan.mosbyexploring.Model;

import android.os.AsyncTask;

/**
 * Created by ivan on 28.09.17.
 */

public class GreetingGen extends AsyncTask<Void,Void,Void> {

    private String baseText;
    private GreetingTaskListener listener;

    public GreetingGen(String greeting, GreetingTaskListener listener){
        baseText = greeting;
        this.listener = listener;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    interface GreetingTaskListener{
        public void onGreetingGenerated(String greetingText);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        listener.onGreetingGenerated(baseText);
    }
}
