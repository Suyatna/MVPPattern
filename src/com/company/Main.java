package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MainViewContact mainViewContact = new MainViewContact() {
        };
        Scanner scanner = new Scanner(System.in);
        String inputMessage = "";
        System.out.println("Halo kak, ada yang bisa di bantu?");
        while (!inputMessage.equals("keluar")) {
            inputMessage = scanner.nextLine();
            mainViewContact.onMessageReceived(inputMessage);
            System.out.println("Aku bisa bantu kakak apa lagi nih? Hehehe seneng deh bisa bantu kakak...");
        }
        System.out.println("Selamat jalan, aku akan selalu ada buat menemani kamu belanja ~");
	// write your code here
    }
}
