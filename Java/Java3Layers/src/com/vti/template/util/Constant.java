package com.vti.template.util;

public class Constant {

	// MySQL

		// MySQL
		public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/FinalExam?autoReconnect=true&useSSL=false&characterEncoding=latin1&relaxAutoCommit=true";
		public static final String DRIVER_SQL_NAME = "com.mysql.cj.jdbc.Driver";
		public static final String DATABASE_USERNAME = "root";
		public static final String DATABASE_PASSWORD = "Bangngocitneu58";

		// scanner
		public static final String ERROR_VALIDATE_INT = "Invalid value, Please input interger: ";
		public static final String ERROR_VALIDATE_FLOAT = "Invalid value, Please input float: ";
		public static final String ERROR_VALIDATE_DOUBLE = "Invalid value, Please input double: ";
		public static final String ERROR_VALIDATE_STRING = "Invalid value, Please input string: ";

		// declare message for connect database
		public static final String ERROR_CONNECT_DATABASE_STR = "Error! connect database.";
		public static final String ERROR_DISCONNECT_DATABASE_STR = "Error! disconnect database.";
		public static final int ERROR_CONNECT_DATABASE_INT = -1;
		public static final int ERROR_SQL_EXCEPTION_INT = -2;
		public static final String ERROR_DRIVER_NAME = "Error! driver name.";
		public static final String SUCCESS = "Success!";
		public static final String ERROR = "Error";

}
