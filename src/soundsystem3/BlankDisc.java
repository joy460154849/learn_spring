package soundsystem3;

import java.util.List;

public class BlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	@Override
	public void play() {
		System.out.println("playing "+ title+" by "+artist);
		for(String track:tracks){
			System.out.println("=Track: "+track);
		}
	}
	
	
	
	
	
	

}
