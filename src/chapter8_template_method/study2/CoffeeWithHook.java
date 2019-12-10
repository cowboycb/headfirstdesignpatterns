package chapter8_template_method.study2;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected boolean doesCustomerWantCondiments() {
        return askAndGetAnswerFromUser();
    }

    private boolean askAndGetAnswerFromUser(){
        System.out.println("Would you like milk and sugar with your coffee? (y/n)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean result = false;
        switch (answer){
            case "y":
            case "Y": result = true; break;
            case "n":
            case "N": result = false; break;
        }
        return result;
    }
}
