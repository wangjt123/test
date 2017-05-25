package sdadfaf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Test {
	public static void main(String[] args) {
		/*HttpURLConnection httpCon = null;
		try {
			URL url = new URL("http://www.baidu.com");
	
			httpCon = (HttpURLConnection) url.openConnection();
			httpCon.setConnectTimeout(3000);
			BufferedReader bf = new BufferedReader(new InputStreamReader(httpCon.getInputStream(), "utf-8"));
			String StrLine = "";
			String result = "";
			while((StrLine = bf.readLine())!=null){
				result += StrLine;
			}
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		/*String k = "5|18620775615";
		String[] key = k.split("\\|");
		int i = key.length;
		System.out.println(key[1]);*/
		//String xml = "<SendData><resultcode>0</resultcode><reason>OK</reason><result rows='1' cols='3'><row rownum='1'><col colnum='1' param_id='1' param_name='成功标志'>0</col><col colnum='2' param_id='2' param_name='失败原因'>Pass</col><col colnum='3' param_id='3' param_name='balanceHistory▕▏balanceAcc﹏balanceType﹏balance﹏availableBalance﹏limit﹏floor﹏limitType﹏entryDate﹏loseDate﹏moneyType﹏shareType﹏spePaymentDesc' param_type='1'>300320437928﹏5002242﹏0﹏0﹏3000﹏0﹏1﹏20131201000000﹏20331130000000﹏0﹏1﹏▕▏300264975368﹏3500004﹏0﹏0﹏0﹏0﹏0﹏20120829100816﹏20991231235959﹏1﹏1﹏▕▏300347971750﹏1000000﹏0﹏0﹏0﹏0﹏1﹏19991010000000﹏20991010000000﹏0﹏1﹏▕▏300264975367﹏3500004﹏0﹏0﹏0﹏0﹏0﹏20120829100812﹏20991231235959﹏1﹏1﹏▕▏300329945307﹏210﹏0﹏0﹏0﹏0﹏1﹏19991010000000﹏20991010000000﹏0﹏1﹏▕▏300344591226﹏1000014﹏0﹏0﹏0﹏0﹏1﹏19991010000000﹏20991010000000﹏1﹏1﹏[统一配置]:不可抵扣增值SP、国际(不包括SP/CP代收费、国际和台港澳长途/漫游费用、国际漫游上网费用)▕▏300352139307﹏5004048﹏0﹏0﹏0﹏0﹏1﹏19991010000000﹏20991010000000﹏0﹏1﹏▕▏300341434210﹏1000000﹏0﹏0﹏0﹏0﹏1﹏19991010000000﹏20991010000000﹏0﹏1﹏▕▏300348634282﹏400﹏0﹏0﹏0﹏0﹏1﹏19991010000000﹏20991010000000﹏0﹏1﹏▕▏300353693054﹏5004048﹏0﹏0﹏0﹏0﹏1﹏19991010000000﹏20991010000000﹏0﹏1﹏</col></row></result></SendData>";
	int[] arr = new int[2];
	arr[0] = 1;
	arr[1] =2;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	}
}
