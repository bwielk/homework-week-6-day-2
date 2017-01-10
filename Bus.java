import java.util.*;

class Bus{
  private int number;
  private ArrayList<Person> passengers;
  private String destination;
  public int limit;

  public Bus(int number, String destination, int limit){
    this.number = number;
    this.destination = destination;
    this.passengers = new ArrayList<Person>();
    this.limit = limit;
  }

  public int getNumber(){
    return this.number;
  }

  public String getDestination(){
    return this.destination;
  }

  public int passCount(){
    return passengers.size();
  }

  public boolean theBusIsFull(){
    return passCount() == this.limit;//checks if the buss is full
  }

  public void pickUp(Person person){
    passengers.add(person);
  }

  public void dropOff(){
    passengers.clear();
  }
}
