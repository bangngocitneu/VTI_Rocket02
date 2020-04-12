package com.vti.template.util.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
/**
 * 
 * This class is . 
 * 
 * @Description: . thưc hien các kết nối đến database và các câu lệnh truy vấn
 * @author: NNgoc
 * @create_date: Apr 4, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Apr 4, 2020
 */
public class JdbcUtil {

	private static JdbcUtil instance;
	private Connection connection;
	private Statement statment;
	private PreparedStatement prepared;
	
	/**
	 * 
	 * This method is . method tự động tạo kết nối đến database
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 4, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 4, 2020
	 * @return
	 */
	public static JdbcUtil getInstance(){
		if(null == instance){
			instance = new JdbcUtil();
		}
		return instance;
		
	}
	/**
	 * 
	 * Constructor for class JdbcUtil.
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 4, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 4, 2020
	 */
	private JdbcUtil(){
		
	}
	
	
	
}
