import static org.junit.Assert.*;
import org.junit.*;

public class BusTest{
  Bus bus;
  Adult adult;
  BusStop stop;
  Pet pet;
  Child child;
  Validator validator;

  @Before
  public void before() {
    bus = new Bus(10, "Bonaly", 30);
    adult = new Adult(3);
    stop = new BusStop("Heaven");
    pet = new Pet(1);
    child = new Child(2);
    validator = new Validator();
  }

  @Test 
  public void hasLineNumber(){
    assertEquals(10, bus.getNumber());
  }

  @Test
  public void hasDestination(){
    assertEquals("Bonaly", bus.getDestination());
  }

  @Test
  public void theBusIsEmpty(){
    assertEquals(0, bus.passCount());
  }

  @Test 
  public void theBusIsFull(){
    for(int i=0; i<bus.limit; i+=1){ //makes the array FULL!
      bus.pickUp(adult);
    }
    assertEquals(true, bus.theBusIsFull());
  }

  @Test 
  public void passengerCanGetIn(){
    bus.pickUp(adult);
    assertEquals(1, bus.passCount());
  }

  @Test
  public void passengerGetsOff(){
    bus.pickUp(adult);
    bus.dropOff();
    assertEquals(0, bus.passCount());
  }

  @Test 
  public void acceptsPetsAndChildren(){
    bus.pickUp(pet);
    bus.pickUp(child);
    assertEquals(2, bus.passCount());
  }

  @Test 
  public void canThrowOutADrunkPassenger(){
    bus.pickUp(adult);
    Passenger irritator = bus.throwOut(0);
    Adult original = (Adult) irritator;
    assertNotNull(irritator);
    assertEquals("Good afternoon, Sir!", original.adultGreet());
  }

  @Test
  public void canThrowOutANoistKid(){
    bus.pickUp(adult);
    bus.pickUp(child);
    Passenger noisyBoy = bus.throwOut(1);
    Child original = (Child) noisyBoy;
    assertNotNull(noisyBoy);
    assertEquals("Heeeyaaaa!", original.childGreet());
  }

  //////////////////////////////////VALIDATOR////////////////////////////////////////
  @Test
  public void canChargePassengers(){
    validator.chargePassengers(adult);
    validator.chargePassengers(pet);
    validator.chargePassengers(child);
    assertEquals(6, validator.cashUp());
  }

  ///////////////////////////////////BUS_STOP///////////////////////////////////
  @Test
  public void busStopHasName(){
    assertEquals("Heaven", stop.getName());
  }

  @Test
  public void canAddToQueue(){
    stop.add(adult);
    assertEquals(1, stop.personCount());
  }

}