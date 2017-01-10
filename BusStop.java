import java.util.*;

class BusStop{
  private String name;
  private ArrayList<Passenger> queue;

  public BusStop(String name){
    this.name = name;
    this.queue = new ArrayList<Passenger>();
  }

  public String getName(){
    return this.name;
  }

  public int personCount(){
    return queue.size();
  }

  // public boolean theBusStopIsFull(){
  //   return personCount() == queue.length;
  // }

  public void add(Passenger passenger){
    queue.add(passenger);
  }
}