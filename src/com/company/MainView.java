package com.company;

public class MainView implements MainViewContact {


    private MainPresenterContact presenter = new MainPresenterContact() {
        @Override
        public String toString() {
            return super.toString();
        }

        public void showResponse(){

        }



        public void onMessageReceived(String message) {
            MainPresenterContact.classifyMessage(message);
        }

    };
}
