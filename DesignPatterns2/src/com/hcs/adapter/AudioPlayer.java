//2
package com.hcs.adapter;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 files. File name: " + fileName);
		} 
		//6
		else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else{
			System.out.println("Invalid media type. File name: " + fileName);
		}
	}

}
