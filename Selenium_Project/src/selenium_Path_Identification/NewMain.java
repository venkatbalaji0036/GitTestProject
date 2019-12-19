
package selenium_Path_Identification;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;




public class NewMain {
	
	Test_Case_Execution NI = new Test_Case_Execution();
			
	@Test
	public void main() throws Exception{
		NewMain obj = new NewMain();
		obj.NewMain_Method();
	} 

	
	//Adding a comment to work to push the code to GitHub
	//@Test
	private void NewMain_Method() throws Exception {
		try{
			int ColumnSize=0;
			DataFormatter formatter = new DataFormatter();
			LinkedList<String> LLKey = new LinkedList<String>();
			LinkedList<String> LLValue = new LinkedList<String>();
			Globals.SheetMap = new LinkedHashMap<String, String>();
			
			
			File ExcelFile = new File("C:/Users/Satish/workspace/Selenium_Project/Data/DataSheet.xlsx");
			FileInputStream ExcelInput = new FileInputStream(ExcelFile);
			
			
			XSSFWorkbook WB = new XSSFWorkbook(ExcelInput);
			XSSFSheet WBSheet = WB.getSheet("TestData");
			
			int RowSize = WBSheet.getLastRowNum()-WBSheet.getFirstRowNum();
			for(int RowNum=0;RowNum<=RowSize;){
				ColumnSize = WBSheet.getRow(RowNum).getLastCellNum();
				for(int CoulmNum=0;CoulmNum<ColumnSize;CoulmNum++){
					if(RowNum==0){
						String Value = formatter.formatCellValue(WBSheet.getRow(RowNum).getCell(CoulmNum));
						LLKey.add(Value);
					}
				}
				break;
			}
			System.out.println(LLKey);

			for(int RowNum=1;RowNum<=RowSize;RowNum++){
				//ColumnSize = WBSheet.getRow(RowNum).getLastCellNum();
				for(int CoulmNum=0;CoulmNum<ColumnSize;CoulmNum++){
						String Value = formatter.formatCellValue(WBSheet.getRow(RowNum).getCell(CoulmNum));
						LLValue.add(Value);
				}
				System.out.println(LLValue);
				for(int i=0;i<LLKey.size();i++){
					Globals.SheetMap.put(LLKey.get(i), LLValue.get(i));
				}
				System.out.println("===============================");
//				if(RowSize>1){
					NI.main();
	//			}else{
		//			break;
			//	}
				Globals.SheetMap.clear();
				LLValue.clear();
			}
		}catch(Exception E){
			throw E;
		}
	}
	
	
	
	
	
	/*
	public void Excel_Data_Sheet() throws Exception{
		try{	
			
			int RowSize=0;
			int ColumnSize=0;
			List<String> LLKey = new LinkedList<String>();
			List<String> LLValue = new LinkedList<String>();
			LinkedHashMap<String, String> MTestData = new LinkedHashMap<String, String>();
			DataFormatter formatter = new DataFormatter();
			
			File TestData_File = new File("C:/Users/Satish/workspace/Selenium_Project/Data/DataSheet.xlsx");
			FileInputStream File_Read_Write = new FileInputStream(TestData_File);
			
			Workbook WB = new XSSFWorkbook(File_Read_Write);
			Sheet TestData = WB.getSheet("TestData");
			
			RowSize = TestData.getLastRowNum()-TestData.getFirstRowNum();
			for(int RowNum=0;RowNum<RowSize;RowNum++){
				ColumnSize = TestData.getRow(0).getLastCellNum();
				for(int ColumnNum=0;ColumnNum<ColumnSize;ColumnNum++){
					if(RowNum==0){
						String CellValue = formatter.formatCellValue(TestData.getRow(RowNum).getCell(ColumnNum));
						LLKey.add(CellValue);
					}
				}
				break;
			}
			
			for(int RowNum=1;RowNum<RowSize;RowNum++){
				for(int ColumnNum=0;ColumnNum<ColumnSize;ColumnNum++){
					String CellValue = formatter.formatCellValue(TestData.getRow(RowNum).getCell(ColumnNum));
					LLValue.add(CellValue);
				}
				for(int i=0;i<RowSize;i++){
					MTestData.put(LLKey.get(i), LLValue.get(i));
				}
			}
			
			System.out.println(MTestData);
			
		}catch(Exception E){
			throw E;
		}
	}*/
	
	
}



















