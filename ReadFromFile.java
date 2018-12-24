import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFromFile {
	
	public static String readFromCsv(String filePath) {
		
		StringBuilder content = new StringBuilder("");
		
		try {
						
			File file = new File(filePath);
			
			if(file.isFile() && file.exists()) {
				
				InputStreamReader input = new InputStreamReader(new FileInputStream(file));
				
				BufferedReader buff = new BufferedReader(input);
				
				String nextLine = null;
				
				while((nextLine = buff.readLine()) != null) {
					
					content.append(nextLine + "/n");
					
					System.out.println(nextLine);
				}
				
				buff.close();
				
			}else {
				
				System.out.println("The specified file could not be found!");
			}
			
		}catch(Exception e) {
			
			System.out.println("File read error!");
			
			e.printStackTrace();
		}
		
		return content.toString();
		
	}
	
	public static String getRow(String filePath, int row) {
		
		String content = "";
		
		try {
						
			File file = new File(filePath);
			
			if(file.isFile() && file.exists()) {
				
				InputStreamReader input = new InputStreamReader(new FileInputStream(file));
				
				BufferedReader buff = new BufferedReader(input);
				
				String nextLine = null;
				
				int count = 0;
				
				while((nextLine = buff.readLine()) != null) {
					
					
					if(count == row) {		
							
							content = nextLine;					
					}
					
					count++;
				}
				
				buff.close();
				
			}else {
				
				System.out.println("The specified file could not be found!");
			}
			
		}catch(Exception e) {
			
			System.out.println("File read error!");
			
			e.printStackTrace();
		}
		
		return content.toString();
		
	}
	public static void main(String[] args) {
		
		readFromCsv("C:/task.csv");
		
	}
}
