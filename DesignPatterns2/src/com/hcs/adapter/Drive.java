package com.hcs.adapter;

public class Drive {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "mp3filename");
		audioPlayer.play("wav", "wavfilename");
		
		audioPlayer.play("mp4", "mp4filename");
		audioPlayer.play("vlc", "vlcfilename");
	}

}
