package sdadfaf;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * @Author juntao.Wang 
 * @Date 2017年1月13日 下午3:39:11
 * @Email 657530654@qq.com
 * @Version 1.0
 */

public class MongoDBText {
	public static void main(String[] args) {
		try {
			//连接到 Mongodb 服务
			MongoClient mongoDB = new MongoClient("localhost",27017);
			//连接到数据库
			MongoDatabase mongoDatabase = mongoDB.getDatabase("myCol");
			
			//创建集合 （表table）
			//mongoDatabase.createCollection("text0");
			System.out.println("创建集合成功");
			
			//获取集合
			MongoCollection<Document> collection = mongoDatabase.getCollection("test0");
			System.out.println(collection);
			
			//集合插入数据
//			Document document = new Document("姓名","盖伦");
//			document.append("年龄", "28").append("国籍", "德玛西亚");
//			List<Document> documents = new ArrayList<Document>();
//			documents.add(document);
//			collection.insertMany(documents);
//			System.out.println("数据插入成功");
			
			//检索集合中文档
			FindIterable<Document> iterables = collection.find();
			MongoCursor<Document> mongoCursor = iterables.iterator();
			while(mongoCursor.hasNext()){
				System.out.println(mongoCursor.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
