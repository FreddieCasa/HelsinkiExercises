
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        Money newMoney = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros() - decreaser.euros(), this.cents() - decreaser.cents());

        if(this.euros() - decreaser.euros()<0){
            return new Money(0,0);
        } else if(this.cents - decreaser.cents()<0){
            return new Money(this.euros() - decreaser.euros()-1, 100 - decreaser.cents());
        }

        return newMoney;

    }

}