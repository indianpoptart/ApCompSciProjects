package com.apcompsci.GridWorld.randomBug;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

import com.apcompsci.GridWorld.critters.ChameleonCritter;

public class RandomCritterRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
        int x = (int)(Math.random() * 10) + 1;
        int y = (int)(Math.random() * 10) + 1;
        
        //System.out.println(x + " " + y);
        world.add(new Location(y, x), new RandomCritter());
        world.add(new Location(4, 5), new RandomCritter());
        world.add(new Location (4,2), new Rock());
        world.add(new Location (1,3), new Rock());
        world.add(new Location (3,5), new Rock());
        world.add(new Location (5,7), new Rock());
        world.show();
        	
	}

}
