package com.apcompsci.GridWorld.knightBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

import com.apcompsci.GridWorld.critters.ChameleonCritter;

public class KnightCritterRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
        
        world.add(new Location(4, 4), new KnightCritter());
        world.add(new Location(5, 4), new KnightCritter());
        world.add(new Location(3, 4), new KnightCritter());
        world.add(new Location(1, 4), new KnightCritter());
        world.add(new Location(5,5), new Rock());
        world.show();
        
	}

}
