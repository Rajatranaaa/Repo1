package Demo.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fsi = new FileInputStream("C:\\Users\\aaa\\Documents\\Book1.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fsi);
		
		     int sheets = wbook.getNumberOfSheets();
		     
		     System.out.println(sheets);
		     
		     for(int i =0; i < sheets; i++) {
		    	 
		    	 if(wbook.getSheetName(i).equalsIgnoreCase("Marks")) {
		    		 
		    		 
		    		 XSSFSheet sheet =  wbook.getSheetAt(i);
		    		 
		    		 Iterator<Row> row = sheet.iterator();
		    		 
		    		 Row firstrow = row.next();  
		    		   
		    		 Iterator<Cell> cell = firstrow.cellIterator();
		    		 
		    		 int k =0;
		    		 int column =0;
		    		 
		    		 while(cell.hasNext()) {
		    			Cell value = cell.next();
		    			 if(value.getStringCellValue().equalsIgnoreCase("Data")) {
		    				 
		    				 column = k;
		    			 }
		    			 k++;
		    		 } System.out.println(column);
		    		 
		    		 
		    		 while(row.hasNext()) {
		    			Row r = row.next();
		    			 if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Anand")) {
		    				 
		    				Iterator<Cell> ce = r.cellIterator();
		    				while(ce.hasNext()) {
		    					System.out.println(ce.next().getStringCellValue());
		    					
		    				}
		    			 }
		    		 }
		    		 
		    		 
		    		 
		    	 }
		    	 
		     }
		

	}

	
}
