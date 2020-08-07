package com.company;

public interface MainPresenterContact {
    public static String classifyMessage(String message) {
        if (message.contains("halo")) return "welcome";
        else if (message.contains("konfirmasi")) return "confirmation";
        else if (message.contains("produk")) return "product";
        else return "default";
    }

}
