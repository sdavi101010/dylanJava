package com.dylandavidson.fhs.introjava.sniper;

import processing.core.PApplet;
import processing.core.PImage;


public class Zombie {
	int health;
	private float x;
	private float y;
	private float picwidth;
	private float picheight;
	private PImage img;
	private int width;
	private int height;
	PApplet p;
	

	public Zombie(PApplet p, float x, float y, float w, float h, int health){
		this.x=x;
		this.y=y;
		picwidth = w;
		picheight = h;
		this.health=health;
		this.p=p;
	}
	
	public void draw(){
		
		p.image(img, x, y, picwidth, picheight);
		
	}
	
	public void update(){
		picwidth=(float) (picwidth+.2);
		picheight=(float) (picheight+.2);
		x=(float) (x-.1);
		y = (float) (y-.05);
	}


	public float getPicwidth() {
		return picwidth;
	}

	public void setPicwidth(float picwidth) {
		this.picwidth = picwidth;
	}

	public float getPicheight() {
		return picheight;
	}

	public void setPicheight(float picheight) {
		this.picheight = picheight;
	}

	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public float getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public void setImage(PImage i) {
		this.img = i;
		this.width = img.width;
		this.height = img.height;
	}
	
	public String toString() {
		return "x: " + x + " y: " + y;
	}
	
	public boolean isOver(Zombie w, int mouseX, int mouseY){
		if(mouseX > x && mouseX < (x+picwidth) && mouseY > y && mouseY < (y+picheight)){
			return true;
		}
		return false;
	}
	
	public boolean tooClose(){
		if(picwidth > 400){
			return true;
		}
		return false;
	}

}
