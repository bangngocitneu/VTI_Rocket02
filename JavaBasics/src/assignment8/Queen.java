package assignment8;
/**
 * 
 * This class is Queen Bee
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 31, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 31, 2020
 */
public class Queen extends Bee {

	/**
	 * check status of Queen Bee
	 */
	public boolean checkHealthStatus() {
		super.checkHealthStatus();
		if (getHealth() < 20) {
			return false;
		} else
			return true;

	}
}
