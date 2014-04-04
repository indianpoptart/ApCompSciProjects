package com.apcompsci.GridWorld.knightBug;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

import java.util.ArrayList;


public class KnightCritter extends Critter
{	
	public ArrayList getMoveLocations()
	{
		Location loc = getLocation();
		ArrayList locs = new ArrayList();
		for (int i = Location.NORTH; i < Location.FULL_CIRCLE; i += Location.RIGHT) {
			Location adjacentLocation = loc.getAdjacentLocation(i);
			if (getGrid().isValid(adjacentLocation)) {
				Location[] diag = new Location[2];
				diag[0] = adjacentLocation.getAdjacentLocation((i+Location.NORTH+Location.FULL_CIRCLE) % Location.FULL_CIRCLE);
				diag[1] = adjacentLocation.getAdjacentLocation((i+Location.NORTH+Location.FULL_CIRCLE) % Location.FULL_CIRCLE);
				for (Location d : diag) {
					if (getGrid().isValid(d)) { 
						Actor a = getGrid().get(d);
						if (a == null || a instanceof Actor) {
							locs.add(d);
						}
						if(a == null || a instanceof Flower){
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