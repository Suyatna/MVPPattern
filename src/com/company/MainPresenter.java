package com.company;

public class MainPresenter implements MainPresenterContact {

    private MainViewContact viewContact = new MainViewContact() {
        @Override
        public String toString() {
            return super.toString();
        }
    };

    private IntentClassifier intentClassifier = IntentClassifier.getInstance();
    private ChatFactory chatFactory = new ChatFactory();

    public String classifyMessage(String message) {
        String intent = intentClassifier.classify(message);
        Chat chat = chatFactory.createChat(intent);

        if (chat instanceof ProductChat) ((ProductChat) chat).setProducts(new String[]{"Ayam", "Sate", "Kambing"});
        else if (chat instanceof PaymentConfirmationChat) ((PaymentConfirmationChat) chat).setOrderNum("112156");

        return intent;
    }
}
