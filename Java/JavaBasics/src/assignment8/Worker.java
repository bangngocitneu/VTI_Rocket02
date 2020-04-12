package assignment8;
/**
 * 
 * This class is Worker Bee 
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 31, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 31, 2020
 */
public class Worker extends Bee {

	/**
	 * check status of Worker Bee
	 */
	public boolean checkHealthStatus() {
		super.checkHealthStatus();
		if (getHealth() < 70) {
			return false;
		} else
			return true;

	}
}
