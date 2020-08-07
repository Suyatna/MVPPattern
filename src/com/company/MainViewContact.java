package com.company;

public interface MainViewContact {

    public static void showResponse(){

    }

    public default void onMessageReceived(String message) {
        MainPresenterContact.classifyMessage(message);
    }

}
