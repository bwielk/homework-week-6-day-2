import java.util.*;

class Bus{

  private int number;
  private ArrayList<Passenger> passengers;
  private String destination;
  public int limit;

  public Bus(int number, String destination, int limit){
    this.number = number;
    this.destination = destination;
    this.passengers = new ArrayList<Passenger>();
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

  public void pickUp(Passenger person){
    passengers.add(person);
  }

  public void dropOff(){
    passengers.clear();
  }

  public Passenger throwOut(int index){
    if(passCount() > 0){
      return passengers.remove(index);
    }
    return null;
  }
}
