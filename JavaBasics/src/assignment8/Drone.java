package assignment8;

/**
 * 
 * This class is Drone Bee
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 31, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 31, 2020
 */
public class Drone extends Bee {
	/**
	 * Check status of Drone Bee
	 */
	public boolean checkHealthStatus() {
		super.checkHealthStatus();
		if (getHealth() < 50) {
			return false;
		} else
			return true;

	}

}
