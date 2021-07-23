package com.ust.examples;

abstract interface MusicPlayer{
	public static final int defaultvolume = 30;
	public abstract void play(String s);
	public abstract void stop(String s);
	
}
class VLCplayer implements MusicPlayer{
	public void play(String s) {
		if(s =="melody" || (s == "dance"))
		{
			System.out.println("play" );
		}else {
			System.out.println("stop " );
		}
	}
	

public void stop(String s) {
	if(s =="jazz")
	{
		System.out.println("stop" );
	}else {
		System.out.println("play" );
	}
}

}
public class InterfaceMusic {

	public static void main(String[] args) {
		VLCplayer v = new VLCplayer();
		v.play("melody");
		v.stop("jazz");

	}

}
