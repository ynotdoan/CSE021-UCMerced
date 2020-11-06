
public class Preference {
	int quietTime;
	int music;
	int reading;
	int chatting;
	
	//Constructors 	
	public Preference (int quietTime, int music, int reading, int chatting) {
		if (quietTime >= 0 && quietTime <= 10) {
			this.quietTime = quietTime; 
		}
		if (music >= 0 && music <= 10) {
			this.music = music; 
		}
		if (reading >= 0 && reading <= 10) {
			this.reading = reading;
		}
		if (chatting >= 0 && chatting <= 10) {
			this.chatting = chatting; 
		}	
	}
	
	//Accessors 	
	public int getquietTime() {
		return quietTime;
	}
	
	public int getmusic() {
		return music;
	}
	
	public int getreading() {
		return reading;
	}
	
	public int getchatting() {
		return chatting;
	}
	
	//Difference
	public int compare(Preference pref) {
		return (Math.abs(quietTime - pref.quietTime) + Math.abs(music - pref.music) +
				Math.abs(reading - pref.reading) + Math.abs(chatting - pref.chatting)) ;
	}
}
