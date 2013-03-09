package DataOperation;

import java.io.*;

public class IO_Traning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\testing\\java\\practice\\test_read.txt";
		String path_write="D:\\testing\\java\\practice\\test_write.txt";
		BufferedReader br = null;
		try{
//			br=new BufferedReader(new FileReader(path));
//			String value=null;
//			
//			//System.out.println(br.readLine());
//			
//			while((value=br.readLine())!=null){
//				System.out.println(value);
//				
//			}
//			BufferedWriter bw;
//			 bw = new BufferedWriter(new FileWriter(path));			 
//			 bw.newLine(); 	
//			 bw.write("Test_New");
//			 bw.close();
//			 
			
			//br=new BufferedReader(new FileReader(path));
			
			
//			System.out.println(IO_Traning.GetConfig(path, "Debug"));
			IO_Traning.WriteNewLine(path, path_write, "JustTest");	
			
			 
			 
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
	public static String GetConfig(String path,String FieldValue){
		String value_name,value;
		value_name=null;
		try{
			BufferedReader br=null;
			br=new BufferedReader(new FileReader(path));
			
			while((value=br.readLine())!=null){
				String[] actualValue=value.split("=");
				
				
				
				if (actualValue[0].trim().equals(FieldValue)==true){
					value_name=actualValue[1];
					//System.out.println(value_name);
				}
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return value_name;		
	}
	
	public static void WriteNewLine(String path, String path_write,String Line){
		try{
			String value=null;
			BufferedReader br=new BufferedReader(new FileReader(path));
			BufferedWriter bw=new BufferedWriter(new FileWriter(path_write));
			
			while((value=br.readLine())!=null){
				
				bw.write(value);
				bw.newLine();
				
			}
			
			bw.write(Line);
			bw.newLine();
			bw.close();
			
			
		}
		catch(Exception e){
			
		}		
				
		

	}

}
