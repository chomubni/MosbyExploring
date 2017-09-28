package com.example.ivan.mosbyexploring.Presnter;

import com.example.ivan.mosbyexploring.Model.GreetingGen;
import com.example.ivan.mosbyexploring.View.Greeting;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

/**
 * Created by ivan on 28.09.17.
 */

public class GreetingPresenter extends MvpBasePresenter<Greeting> {
    private GreetingGen greetingGen;

    public void showHello(){
        greetingGen = new GreetingGen("Hello, how r u?", new GreetingGen.GreetingTaskListener() {
            @Override
            public void onGreetingGenerated(String greetingText) {
                getView().showHello(greetingText);
            }
        });
        greetingGen.execute();
    }

    public void showGoodbye(){
        greetingGen = new GreetingGen("Goodbeye, have a nice day", new GreetingGen.GreetingTaskListener() {
            @Override
            public void onGreetingGenerated(String greetingText) {
                getView().showGoodbye(greetingText);
            }
        });
        greetingGen.execute();
    }
}
