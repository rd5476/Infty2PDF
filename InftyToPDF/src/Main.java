
import java.io.IOException;

import org.jsoup.Jsoup;
public class Main {
//	public static void main(String [] arg) {
//		System.out.println("Hello 0x1dcc");
//
//		//String result=  Jsoup.parse("&#x3b4;").text();
//		//System.out.println(result);
//		ReadLG rlg  = new ReadLG("SourceData", "Output") ;
//		//Create an arraylist of all expression in source directory
//		rlg.extractLGData();
//		WriteExpToPdf e2p = new WriteExpToPdf("Output");
//		e2p.allExpressions = rlg.expressions;
//		e2p.createPDFs();
//	}
	
	public static void main(String [] arg) {
		
		GenerateAllPixellSizes.init_generic_symbol_table(12);
//		try {
//			GenerateAllPixellSizes.dispInfo();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		ReadLG rlg  = new ReadLG("SourceData", "Output") ;
		rlg.extractLGData();
		WriteExpToPdf e2p = new WriteExpToPdf("Output");
		e2p.allExpressions = rlg.expressions;
		e2p.createPDFs();
		
	}
}
