package sdadfaf;

import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

/**
 * @Author juntao.Wang 
 * @Date 2016年10月12日 下午5:03:51
 * @Email 657530654@qq.com
 * @Version 1.0
 */
	//<?xml version=\1.0\ encoding=\UTF-8\?> <soapenv:Envelope xmlns:soapenv=\http://schemas.xmlsoap.org/soap/envelope/\> <soapenv:Body> <UserStatusQueryResponseMsg xmlns=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg\> <ResultHeader xmlns=\\> <TransactionId xmlns=\http://www.huawei.com/bme/cbsinterface/common\>ssu</TransactionId> <ResultCode xmlns=\http://www.huawei.com/bme/cbsinterface/common\>0</ResultCode> <OriginSystemId xmlns=\http://www.huawei.com/bme/cbsinterface/common\>1000</OriginSystemId> <TimeStamp xmlns=\http://www.huawei.com/bme/cbsinterface/common\>20161011094513</TimeStamp> </ResultHeader> <UserStatusQueryResponse xmlns=\\> <Status xmlns=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\>2HA</Status> <PkgStatus xmlns=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\> <bus:PkgID xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>6959704432</bus:PkgID> <bus:PkgName xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>CDMA_全省_流量红包专用流量优惠_0元20M</bus:PkgName> <bus:CarryOverFlag xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>0</bus:CarryOverFlag> <bus:Rent xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>0</bus:Rent> <bus:BalanceType xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>3</bus:BalanceType> <bus:BalanceDesc xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>省内上网免费流量帐户(非结转)</bus:BalanceDesc> <bus:ResourceTotal xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>20480</bus:ResourceTotal> <bus:ResourceRemain xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>0</bus:ResourceRemain> <bus:CarryOverResourceTotal xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>0</bus:CarryOverResourceTotal> <bus:CarryOverResourceRemain xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>0</bus:CarryOverResourceRemain> <bus:CarryOverResourceUsage xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>0</bus:CarryOverResourceUsage> <bus:ValidBeginTime xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>20161001000000</bus:ValidBeginTime> <bus:ValidEndTime xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>20161031235959</bus:ValidEndTime> <bus:Account xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>8504</bus:Account> <bus:AccountStyle xmlns:bus=\http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\ xmlns=\\>100002</bus:AccountStyle> </PkgStatus> </UserStatusQueryResponse> </UserStatusQueryResponseMsg> </soapenv:Body> </soapenv:Envelope>

public class fdgd {
	public static void main(String[] args) {
		XMLSerializer xmlSerializer = new XMLSerializer();
		
		String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
			    "<soapenv:Body>"+
			        "<UserStatusQueryResponseMsg xmlns=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg\">"+
			            "<ResultHeader xmlns=\"\">"+
			                "<TransactionId xmlns=\"http://www.huawei.com/bme/cbsinterface/common\">ssu</TransactionId>"+
			                "<ResultCode xmlns=\"http://www.huawei.com/bme/cbsinterface/common\">0</ResultCode>"+
			                "<OriginSystemId xmlns=\"http://www.huawei.com/bme/cbsinterface/common\">1000</OriginSystemId>"+
			                "<TimeStamp xmlns=\"http://www.huawei.com/bme/cbsinterface/common\">20161011094513</TimeStamp>"+
			            "</ResultHeader>"+
			            "<UserStatusQueryResponse xmlns=\"\">"+
			                "<Status xmlns=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\">2HA</Status>"+
			                "<PkgStatus xmlns=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\">"+
			                    "<bus:PkgID xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">6959704432</bus:PkgID>"+
			                    "<bus:PkgName xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">CDMA_全省_流量红包专用流量优惠_0元20M</bus:PkgName>"+
			                    "<bus:CarryOverFlag xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverFlag>"+
			                    "<bus:Rent xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:Rent>"+
			                    "<bus:BalanceType xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">3</bus:BalanceType>"+
			                    "<bus:BalanceDesc xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">省内上网免费流量帐户(非结转)</bus:BalanceDesc>"+
			                    "<bus:ResourceTotal xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20480</bus:ResourceTotal>"+
			                    "<bus:ResourceRemain xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:ResourceRemain>"+
			                    "<bus:CarryOverResourceTotal xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceTotal>"+
			                    "<bus:CarryOverResourceRemain xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceRemain>"+
			                    "<bus:CarryOverResourceUsage xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceUsage>"+
			                    "<bus:ValidBeginTime xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20161001000000</bus:ValidBeginTime>"+
			                    "<bus:ValidEndTime xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20161031235959</bus:ValidEndTime>"+
			                    "<bus:Account xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">8504</bus:Account>"+
			                    "<bus:AccountStyle xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">100002</bus:AccountStyle>"+
			                "</PkgStatus>"+
				            "<PkgStatus xmlns=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\">"+
			                    "<bus:PkgID xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">6959704432</bus:PkgID>"+
			                    "<bus:PkgName xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">CDMA_全省_流量红包专用流量优惠_0元20M</bus:PkgName>"+
			                    "<bus:CarryOverFlag xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverFlag>"+
			                    "<bus:Rent xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:Rent>"+
			                    "<bus:BalanceType xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">3</bus:BalanceType>"+
			                    "<bus:BalanceDesc xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">省内上网免费流量帐户(非结转)</bus:BalanceDesc>"+
			                    "<bus:ResourceTotal xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20480</bus:ResourceTotal>"+
			                    "<bus:ResourceRemain xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:ResourceRemain>"+
			                    "<bus:CarryOverResourceTotal xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceTotal>"+
			                    "<bus:CarryOverResourceRemain xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceRemain>"+
			                    "<bus:CarryOverResourceUsage xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceUsage>"+
			                    "<bus:ValidBeginTime xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20161001000000</bus:ValidBeginTime>"+
			                    "<bus:ValidEndTime xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20161031235959</bus:ValidEndTime>"+
			                    "<bus:Account xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">8504</bus:Account>"+
			                    "<bus:AccountStyle xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">100002</bus:AccountStyle>"+
			                "</PkgStatus>"+
			                "<PkgStatus xmlns=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\">"+
			                    "<bus:PkgID xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">6959704432</bus:PkgID>"+
			                    "<bus:PkgName xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">CDMA_全省_流量红包专用流量优惠_0元20M</bus:PkgName>"+
			                    "<bus:CarryOverFlag xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverFlag>"+
			                    "<bus:Rent xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:Rent>"+
			                    "<bus:BalanceType xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">3</bus:BalanceType>"+
			                    "<bus:BalanceDesc xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">省内上网免费流量帐户(非结转)</bus:BalanceDesc>"+
			                    "<bus:ResourceTotal xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">819200</bus:ResourceTotal>"+
			                    "<bus:ResourceRemain xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:ResourceRemain>"+
			                    "<bus:CarryOverResourceTotal xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceTotal>"+
			                    "<bus:CarryOverResourceRemain xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceRemain>"+
			                    "<bus:CarryOverResourceUsage xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">0</bus:CarryOverResourceUsage>"+
			                    "<bus:ValidBeginTime xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20161010000000</bus:ValidBeginTime>"+
			                    "<bus:ValidEndTime xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">20161010235959</bus:ValidEndTime>"+
			                    "<bus:Account xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">520</bus:Account>"+
			                    "<bus:AccountStyle xmlns:bus=\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\" xmlns=\"\">100002</bus:AccountStyle>"+
			                "</PkgStatus>"+
			            "</UserStatusQueryResponse>"+
			        "</UserStatusQueryResponseMsg>"+
			    "</soapenv:Body>"+
			"</soapenv:Envelope>";
		JSONObject json = (JSONObject) xmlSerializer.read(xml);
		
		System.out.println(json);
		json.remove("@xmlns:soapenv");
		String strJson = json.toString().replace("soapenv:", "").replace("\"@xmlns\":\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg\",", "")
						.replace("{\"@xmlns\":\"http://www.huawei.com/bme/cbsinterface/common\",\"#text\":", "")
						.replace("{\"@xmlns\":\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\",\"#text\":", "")
						.replace("\"@xmlns\":\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\",", "")
						.replace("{\"@xmlns:bus\":\"http://www.huawei.com/bme/cbsinterface/cbs/businessmgr\",\"#text\":", "").replace("bus:", "").replace("},", ",").replace("\"}}", "\"}");
		
		System.out.println(strJson);
		
		JSONObject newJson = JSONObject.fromObject(strJson);
		
	
		
		JSONArray jsonArray = new JSONArray();
		//jsonArray.add(json);
		jsonArray.add(newJson);
		System.out.println(jsonArray.toString());
		
		//获取TimeStamp的值
		
		JSONObject obj = jsonArray.getJSONObject(0);
		
		//JSONObject jobj = obj.getJSONObject("Body").getJSONObject("UserStatusQueryResponseMsg").getJSONObject("ResultHeader");
		
		JSONArray jsonObj = obj.getJSONObject("Body").getJSONObject("UserStatusQueryResponseMsg").getJSONObject("UserStatusQueryResponse").getJSONArray("PkgStatus");
		
		JSONObject arr1 = jsonObj.getJSONObject(0);
		
		Iterator it = arr1.keys();
		while(it.hasNext()){
			String key = (String) it.next();
			String value = arr1.getString(key);
			System.out.println(key+"="+value);
		}
		
		
		JSONObject obj2 = jsonObj.getJSONObject(2);
		
		String BalanceDesc = obj2.getString("BalanceDesc");
		
		System.out.println(BalanceDesc);
		//Object TimeStamp = jobj.get("PkgStatus");
							
		
		//System.out.println(TimeStamp);
		
		/*XMLSerializer xmlSerializer = new XMLSerializer();
		JSONObject json = (JSONObject) xmlSerializer.read(xml);
		JSONArray array = new JSONArray();
		array.add(json);

		Map<String,Object> map = parseJSON2Map(array.toString())
		
		System.out.println("333"+map);
		}

	private static Map<String, Object> parseJSON2Map(String jsonStr) {
		JSONArray arr = JSONArray.fromObject(jsonStr);
		JSONObject json = arr.getJSONObject(0);
		Map<String,Object> map = new HashMap<String, Object>();
//		for(Object obj : json.keySet()){
//			Object o = json.get(obj);
//			System.out.println("111"+obj);
//			System.out.println("222"+o.toString());
			System.out.println(o);
//			if(o instanceof JSONArray){
//				System.out.println(22222);
//				List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
				Iterator<JSONObject> its = ((JSONArray) o).iterator();
				while(its.hasNext()){
				
				
				
					JSONObject o1 = its.next();
					list.add(parseJSON2Map(o1.toString()));
				}
				
				for(Object obj1 : ((JSONObject) o).keySet()){
					Object o1 = ((JSONObject) o).get(obj1);
					list.add(parseJSON2Map(o1.toString()));	
				map.put(obj.toString(), list);
			}else{
				map.put(obj.toString(), o);
			}
		return map;
		}
		return null;
	}*/
}
	}
