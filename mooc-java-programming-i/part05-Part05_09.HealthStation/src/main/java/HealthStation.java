
public class HealthStation {

    private int weighingsCounter;
//    public HealthStation(){
//        this.weighingsCounter = 0 ;
//    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighingsCounter++;
        return person.getWeight();

    }

    public void feed(Person person) {
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);

    }

    public int weighings() {
        return weighingsCounter;
    }

}
