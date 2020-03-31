package assignment8;
/**
 * 
 * This class is define Bee
 * 
 * @Description: Bee has health = 100
 * @author: NNgoc
 * @create_date: Mar 31, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 31, 2020
 */
public class Bee {
	
	protected float health = 100;

	public float getHealth() {
		if(health <= 0)
			return 0;
		else 
		return health;
	}
	/**
	 * 
	 * This method is attack bee
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @param damage
	 */
	public void damage(int damage){
		if(damage >= 0 && damage <= 100){
			health -= damage;
		}
		else if(damage < 0){
			health = 0;
		}
	}
	/**
	 * 
	 * This method is checked status of bee
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @return
	 */
	public boolean checkHealthStatus(){
		return true;
	}
	
}
