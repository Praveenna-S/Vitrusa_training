package com.training.w_1_Day14;

import java.io.IOException;
import java.sql.SQLException;

public class SingletonMain {
	  public static void main(String[] args) throws IOException, SQLException {
		  
	        CentralUniversity.getInstance().broadcast();
}
}
