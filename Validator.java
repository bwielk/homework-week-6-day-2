import java.util.*;

public class Validator{

  private ArrayList<Integer> validator;

  public Validator(){
    this.validator = new ArrayList<Integer>();
  }

  public void chargePassengers(Passenger person){
    validator.add(person.getFare());
  }

  public int cashUp(){
    int total = 0;
    for(Integer fare : validator){
      total += fare;
    }
    return total;
  }
}