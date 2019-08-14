package enumexample;

public class TennisCoach implements Coach {

	private String name;
	private Level level;
	
	public TennisCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice back volley today..";
	}
	
	public  void createCoach(String name,Level level)
	{
		this.setName(name);
		this.setLevel(level);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
  public String getCoachDetails() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("todays workout plan :"+getDailyWorkout()+"\n");
	  sb.append("name: of the coach:"+getName()+"\n");
	  sb.append("level of the coach is:"+level+"\n");
	  sb.append("coach level rank is:"+level.getLevelCode());
	  return sb.toString();
  }
}
