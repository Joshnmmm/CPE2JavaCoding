package FruitJuiceMachine;

import java.util.Scanner;

public class FruitJuiceMachineMain {

    public static void main(String[] args) {
        ClassRegister c = new ClassRegister(200);
        Scanner s = new Scanner(System.in);
        DispenserType AppleJuice = new DispenserType(3, 10);
        DispenserType OrangeJuice = new DispenserType(3, 10);
        DispenserType MangoLassi = new DispenserType(3, 10);
        DispenserType FruitPunch = new DispenserType(3, 10);

        System.out.println("Products available: ");
        System.out.println("[1] Apple Juice\n[2] Orange Juice\n[3] Mango Lassi\n[4] Fruit Punch\n ");
        System.out.print("Select the product you want to buy: ");
        int selection = s.nextInt();
        int amount;

        switch (selection) {
            case 1:
                System.out.println("Apple Juice");
                System.out.println("It costs: " + AppleJuice.getCost());
                System.out.println("Available stocks: " + AppleJuice.getNoOfItems() + " units");
                System.out.print("Please enter the amount you are paying: ");
                amount = s.nextInt();

                if (AppleJuice.getNoOfItems() > 0) {
                    if (amount >= AppleJuice.getCost()) {
                        c.acceptAmount(amount);      
                        AppleJuice.makeSale();     
                        System.out.println("Dispensing Apple Juice.");
                        if (amount > AppleJuice.getCost()) {
                            System.out.println("You have a change :) => " + (amount - AppleJuice.getCost()));
                        } else {
                            System.out.println("Enjoy your drink :)");
                        }
                    } else {
                        System.out.println("Your amount is insufficient :(");
                    }
                } else {
                    System.out.println("Apple Juice is sold out :( ");
                }
                break;

            case 2:
                System.out.println("Orange Juice");
                System.out.println("It costs: " + OrangeJuice.getCost());
                System.out.println("Available stocks: " + OrangeJuice.getNoOfItems() + " units");
                System.out.print("Please enter the amount you are paying: ");
                amount = s.nextInt();

                if (OrangeJuice.getNoOfItems() > 0) {
                    if (amount >= OrangeJuice.getCost()) {
                        c.acceptAmount(amount);
                        OrangeJuice.makeSale();
                        System.out.println("Dispensing Orange Juice.");
                        if (amount > OrangeJuice.getCost()) {
                            System.out.println("You have a change :) => " + (amount - OrangeJuice.getCost()));
                        } else {
                            System.out.println("Enjoy your drink :)");
                        }
                    } else {
                        System.out.println("Your amount is insufficient :(");
                    }
                } else {
                    System.out.println("Orange Juice is sold out :( ");
                }
                break;

            case 3:
                System.out.println("Mango Lassi");
                System.out.println("It costs: " + MangoLassi.getCost());
                System.out.println("Available stocks: " + MangoLassi.getNoOfItems() + " units");
                System.out.print("Please enter the amount you are paying: ");
                amount = s.nextInt();

                if (MangoLassi.getNoOfItems() > 0) {
                    if (amount >= MangoLassi.getCost()) {
                        c.acceptAmount(amount);
                        MangoLassi.makeSale();
                        System.out.println("Dispensing Mango Lassi.");
                        if (amount > MangoLassi.getCost()) {
                            System.out.println("You have a change :) => " + (amount - MangoLassi.getCost()));
                        } else {
                            System.out.println("Enjoy your drink :)");
                        }
                    } else {
                        System.out.println("Your amount is insufficient :(");
                    }
                } else {
                    System.out.println("Mango Lassi is sold out :( ");
                }
                break;

            case 4:
                System.out.println("Fruit Punch");
                System.out.println("It costs: " + FruitPunch.getCost());
                System.out.println("Available stocks: " + FruitPunch.getNoOfItems() + " units");
                System.out.print("Please enter the amount you are paying: ");
                amount = s.nextInt();

                if (FruitPunch.getNoOfItems() > 0) {
                    if (amount >= FruitPunch.getCost()) {
                        c.acceptAmount(amount);
                        FruitPunch.makeSale();
                        System.out.println("Dispensing Fruit Punch.");
                        if (amount > FruitPunch.getCost()) {
                            System.out.println("You have a change :) => " + (amount - FruitPunch.getCost()));
                        } else {
                            System.out.println("Enjoy your drink :)");
                        }
                    } else {
                        System.out.println("Your amount is insufficient :(");
                    }
                } else {
                    System.out.println("Fruit Punch is sold out :( ");
                }
                break;

            default:
                System.out.println("Please enter a valid number selection");
                break;
        }

        s.close();
    }
}
