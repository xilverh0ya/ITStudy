package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class Main {
	
	public static void startProgram() {
		System.out.print("""
#############################
### ���θ� ���α׷��� �����մϴ� ###
#############################
				""");
	}
	
	public static void endProgram() {
        System.out.print("""
#############################
### ���θ� ���α׷��� �����մϴ� ###
#############################
                """);
    }
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		startProgram();
		LoginMenu.readMenu();
        endProgram();
	}

}