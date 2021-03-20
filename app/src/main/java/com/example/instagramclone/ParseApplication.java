package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("03KvnFKa0S00ymT9CDIJJLsGLdmJuri66wJI5aUq")
                .clientKey("tCmv7BNRokEDjfrTqoKJYxnHaYEEPnYaQ5YAp0Gb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
