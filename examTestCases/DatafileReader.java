package examTestCases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DatafileReader {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
			
		
// Check file/path is correct
		String path = "C:\\Users\\vcmur\\eclipse-workspace\\TestCases_2\\src\\testCases\\DictionaryFile.txt" ;
		doesFileExist(path);

		}			
//-----------------------------------------------------------------//
	
	public static String doesFileExist(String path) {
		try {
		File f = new File(path);
		FileReader fr = new FileReader(f) ;
	
		System.out.println("File exists. Path is correct: " +path);
		System.out.println("-------------");
		
		BufferedReader br = new BufferedReader(fr);
		String line;
			try {
				while((line = br.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
// if file/path incorrect throw error.
		catch(FileNotFoundException e){
			System.out.println("File does not exists or file path is incorrect! ") ;
		
	}
		return path;
	}
}	
