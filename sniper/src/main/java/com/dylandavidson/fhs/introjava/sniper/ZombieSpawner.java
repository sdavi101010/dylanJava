package com.dylandavidson.fhs.introjava.sniper;

import java.util.Random;

import processing.core.PApplet;
import processing.core.PImage;


public class ZombieSpawner {
	private PApplet p;
		
	public ZombieSpawner(PApplet p) {
		this.p = p;
	}
	
	
	public Zombie zombieSpawn(){
		Random gen = new Random();
		int rx = gen.nextInt(750)+10;
		int yloc=600;
		int health=100;
		int picwidth = 100;
		int picheight = 125;
		int zombieselector = gen.nextInt(2);
		
		Zombie a = new Zombie(p, rx, yloc, picwidth, picheight, health);
		
		
		if(zombieselector == 1){
			a.setImage(p.loadImage("zombie2.png"));
		}else{
			a.setImage(p.loadImage("MaleZombie.png"));
		}
		
		
		
		return a;
	}

}
