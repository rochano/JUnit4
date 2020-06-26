package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatUtil {

	public String parseSimpleThaiFormat(Date date) {
		String formatDate = "-";
		if(date != null){
			Locale.setDefault(new Locale("th", "TH"));
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			formatDate = formatter.format(date);
		}
		return formatDate;
	}
	
	public int[] getTest() {
		return new int[] {0,1};
	}
}