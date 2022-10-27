package adactin_Helper;

public class FileReadManager {
	
	public static FileReadManager fm = new FileReadManager();
	
	public static FileReadManager getInstance() {
		return fm;
	}
	public static Configuration_Manager cm;
	
	public Configuration_Manager getCm() {
		if(cm==null) {
			cm = new Configuration_Manager();
		}
		return cm;
	}
}
