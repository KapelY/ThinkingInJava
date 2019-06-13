package com.company.enumerater;

//: enumerated/SpaceShip.java 815
public enum SpaceShip {
  SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;
  public String toString() {
    String lower = name().substring(1).toLowerCase();
    return name().charAt(0) + lower;
  }
  public static void main(String[] args) {
    for(SpaceShip s : values()) {
      System.out.println(s);
    }
  }
}
/* Output:
Scout
Cargo
Transport
Cruiser
Battleship
Mothership
*///:~
