
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
//        PaymentCard petesCard = new PaymentCard(10);
//
//        System.out.println("money " + petesCard.balance());
//        boolean wasSuccessful = petesCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
//
//        wasSuccessful = petesCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());

        PaymentTerminal unicafeExactum = new PaymentTerminal();

//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change " + change);

//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//         change = unicafeExactum.eatHeartily(4.30);
//        System.out.println("remaining change " + change);
//        System.out.println(unicafeExactum);

//        PaymentCard annesCard = new PaymentCard(7);
//        boolean wasSuccesful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("the was enough money: " + wasSuccesful);
//        wasSuccesful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("the was enough money: " + wasSuccesful);
//        wasSuccesful = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("the was enough money: " + wasSuccesful);
//        System.out.println(unicafeExactum);


        PaymentCard annesCard = new PaymentCard(2);
        System.out.println("amount of money on te card is " + annesCard.balance() + " euros");
        boolean wasSuccesful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccesful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccesful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccesful);

        System.out.println("amount of money on the cards is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);



         }
}

