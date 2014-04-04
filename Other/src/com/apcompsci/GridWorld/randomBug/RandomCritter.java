package com.apcompsci.GridWorld.randomBug;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class RandomCritter extends Critter{
	public ArrayList<Location> getMoveLocations(){
		Location loc = getLocation();
		ArrayList<Location> locs = new ArrayList<Location>();
		for (int i = Location.NORTH; i < Location.FULL_CIRCLE; i += Location.RIGHT){
			Location adjacentLocation = loc.getAdjacentLocation(i);
			if (getGrid().isValid(adjacentLocation)) {
				Location[] diag = new Location[2];
				diag[0] = adjacentLocation.getAdjacentLocation((i+Location.HALF_LEFT+Location.FULL_CIRCLE) % Location.FULL_CIRCLE);
				diag[1] = adjacentLocation.getAdjacentLocation((i+Location.HALF_RIGHT+Location.FULL_CIRCLE) % Location.FULL_CIRCLE);
				
				for (Location d : diag) {
					if (getGrid().isValid(d)) {  
						Actor a = getGrid().get(d);
						Actor b = getGrid().get(d);
						if (a == null || a instanceof Rock) {
							locs.add(d);
						}
						if(a == null || a instanceof Critter){
							locs.add(d);
						}
					}
				}
			}
		}
		return locs;
	}
}
