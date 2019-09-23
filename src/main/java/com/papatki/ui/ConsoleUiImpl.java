package com.papatki.ui;

import com.papatki.api.ConsoleUi;

import java.util.Scanner;

public class ConsoleUiImpl implements ConsoleUi {
    @Override
    public void printMessage(String message) {

        System.out.println(message);

    }

    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[;\\r\\n]+");
        String text = scanner.nextLine();
        return text;
    }
}
