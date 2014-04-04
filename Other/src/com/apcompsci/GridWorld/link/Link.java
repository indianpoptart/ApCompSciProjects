package com.apcompsci.GridWorld.link;

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class Link extends Critter {
  public void processActors(ArrayList<Actor> link) {
    //link.get((int)(Math.random() * link.size())).removeSelfFromGrid();
  }

  public ArrayList<Location> getMoveLocations() {
    ArrayList<Location> moveLocs = new ArrayList<Location>();
    Location loc = getLocation();

    moveLocs.add(loc.getAdjacentLocation(Location.NORTHEAST));
    moveLocs.add(loc.getAdjacentLocation(Location.SOUTHEAST));
    moveLocs.add(loc.getAdjacentLocation(Location.SOUTHWEST));
    moveLocs.add(loc.getAdjacentLocation(Location.NORTHWEST));
    System.out.println(moveLocs);
    return moveLocs;
  }

  //if link is trapped(all diagonals occupied), he will teleport to any empty location in the grid
  //if link is not trapped, he will move to the new location
  public void makeMove(Location loc) {
    if (loc == null) {
      int col = loc.getCol() + 3;
      int row = loc.getRow() + 3;
      moveTo(new Location(col, row));
    }
    else if(loc.getCol() < 0){
    }
    else {
      moveTo(loc);
    }
  }

  public Color getColor() {
    return getColor();
  }
}