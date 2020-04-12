package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainProgram {

	static Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	static List<Bee> bees;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("-----------Menu---------------");
			System.out.println("1. Tạo 1 danh sách Bee");
			System.out.println("2. Tấn công Bee");
			System.out.println("3. Thoát");
			System.out.println(" Mời bạn chọn: ");
			int choose = ScannerUtil.readInt(scanner,"Vui lòng nhập vào số nguyên!" );
			switch (choose) {
			case 1:
				bees = new ArrayList<Bee>();
				createBeeList(bees);
				showStatus(bees);
				break;
			case 2:
				if (bees == null){
					System.out.println("Vui lòng tạo danh sách bee!");
					break;
				}else {
					attackBee(bees);
					showStatus(bees);
				}
				
			case 3:
	
				System.exit(0);
				break;

			default:
				System.out.println(" vui lòng chọn 1 -> 3!");
				break;
			}
		}
		
	}

	

	private static void showStatus(List<Bee> bees) {
		int i =1;
		for(Bee bee1: bees){
			if (bee1 instanceof Drone)
				System.out.println(i +":"+" Drone");
			if (bee1 instanceof Queen)
				System.out.println(i +":"+" Queen");
			else {
				System.out.println(i +":"+" Worker");
			}
			i++;
			System.out.println(bee1.getHealth());
			if(bee1.checkHealthStatus()==false) 
				System.out.println("Đã chết rồi");
			System.out.println("-----------------");
		}
		
	}
/**
 * 
 * This method is create Bee List
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 31, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 31, 2020
 * @param bees
 */
	private static void createBeeList(List<Bee> bees) {
		bees.clear();
		int n = random.nextInt(10) + 3;
		for(int i=0; i<n;i++){
			int rd = random.nextInt(3);
			if(rd == 0){
				Drone dr = new Drone();
				bees.add(dr);
			}
			else if (rd == 1){
				Queen q = new Queen();
				bees.add(q);
			} else {
				Worker w = new Worker();
				bees.add(w);
			}
		}
		
	}
	/**
	 * 
	 * This method is tấn công bee
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @param bees
	 */
private static void attackBee(List<Bee> bees) {

	for(Bee bee1 : bees){
		if(bee1 instanceof Drone){
			Drone dr = (Drone) bee1;
			if(dr.checkHealthStatus()==true)
				bee1.damage(new Random().nextInt(81));
		}
		if(bee1 instanceof Queen){
			Queen q = (Queen) bee1;
			if(q.checkHealthStatus()==true)
				bee1.damage(new Random().nextInt(81));
		}
		if(bee1 instanceof Worker){
			Worker w = (Worker) bee1;
			if(w.checkHealthStatus()==true)
				bee1.damage(new Random().nextInt(81));
		}
	}
	System.out.println(" Tấn công thành công");
	System.out.println("-------------------------------------");
	System.out.println();
		
	}
}
