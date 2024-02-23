
public class MainProgram {

    public static void main(String[] args) {

//        PaymentCard card = new PaymentCard(50);
//        System.out.println(card);
//
//        card.eatAffordably();
//        System.out.println(card);
//
//        card.eatHeartily();
//        card.eatAffordably();
//        System.out.println(card);
        // Scanner scanner = new Scanner(System.in);

//        PaymentCard card = new PaymentCard(5);
//        card.eatHeartily();
//        System.out.println(card);
//        card.eatHeartily();
//        System.out.println(card);

//        PaymentCard card = new PaymentCard(10);
//        System.out.println(card);
//
//        card.addMoney(15);
//        System.out.println(card);
//
//        card.addMoney(10);
//        System.out.println(card);
//
//        card.addMoney(200);
//        System.out.println(card);


//        PaymentCard card = new PaymentCard(10);
//        System.out.println(card);
//
//        System.out.println("Paul: " + card);
//
//        card.addMoney(-15);
//        System.out.println("Paul: " + card);

        PaymentCard paulsCard = new PaymentCard (20);
        PaymentCard mattsCard = new PaymentCard (30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matt's card: " + mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matt's card: " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matt's card: " + mattsCard);





        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}
