
public class Student {
	
	private String name;
	private char gender;
	private Date birthDay;
	private Preference pref;
	private boolean matched;
	private int compatibilityScore;
	
	//instance variable constructors
	public Student (String name, char gender, Date birthDay, Preference pref) {
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.pref = pref;
	}
	
	//Accessor
	public String getname() {
		return name;
	}
	
	public char getgender() {
		return gender;
	}
	
	public Date getbirthDay() {
		return birthDay;	
	}
	
	public Preference getpref() {
		return pref;
	}
	
	public boolean getmatched() {
		return matched;
	}
	
	//matched  
	public void setmatched(boolean matched) {
		this.matched = matched;
	}
	
	// Method giving Compatibility Scores
	public int compare(Student st) {
		if(gender != st.gender){
			return 0;
		}
		
		//Calculation, calling values from Preference.java
		compatibilityScore = (40 - pref.compare(st.pref)) + (60 - birthDay.compare(st.birthDay));

		if (compatibilityScore < 0) {
			return 0;
		}
		
		else if (compatibilityScore > 100) {
			return 100;
		}
		
		return compatibilityScore;	
	}
}
