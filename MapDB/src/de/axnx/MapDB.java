package de.axnx;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;

public class MapDB {

	public static void main(String[] args) {
		
		DB db = DBMaker.fileDB("file.db").make();
		ConcurrentMap map = db.hashMap("map").create();
		
		//DBMaker.fileDB("file.db").checksumHeaderBypass();
		//DB db = DBMaker.fileDB("file.db").make();
		
		
		//ConcurrentMap map = db.hashMap("map").open();
		
		System.out.println(map.size());
		//int i;
		//if(map.size() > 0) i=10; else i=0;	
		
		
//		for(int i=0;i<10;i++){
//			map.put("test"+i, "test"+i);
//		}
//		
//		
//		
////		map.put("something", "here");
////		map.put("test1", "test1");
////		map.put("test2", "test2");
////		map.put("test3", "Test3");
//		
//		
//		Iterator it = map.entrySet().iterator();
//		while (it.hasNext()) {
//			 Map.Entry pair = (Map.Entry)it.next();
//			 System.out.println(pair.getKey() + " = " + pair.getValue());
//			 it.remove();
//		}
////		map.put("something", "here");
////		map.put("test1", "test1");
////		map.put("test2", "test2");
////		map.put("test3", "Test3");
			db.close();
//		

	}

}
