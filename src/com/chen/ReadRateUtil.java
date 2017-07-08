package com.chen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadRateUtil {

	
	public static void readTxt()
	
	 {   
		List<String[]> list = new LinkedList<String[]>();
	       String[] outArray =null;
	   try{
	    String encoding = "UTF-8";
	    File file = new File("d:"+File.separator+"汇率信息.txt");
	    String lineinfo="";
	    if(file.isFile()&&file.exists())
	    {
	     InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
	     BufferedReader bufferReader = new BufferedReader(read);
	     while((lineinfo=bufferReader.readLine())!=null)
	       {
	      String[] strArrty = lineinfo.split("\\|");
	      int i=0;
	      list.add(strArrty);
	       }
	     read.close();
	    }
	   }catch(Exception e)
	   {
	    System.out.println("读取文件内容出错");
	          e.printStackTrace();
	   }
	 }
	 
	  public static void main(String[] args)
	    {
	   readTxt();
	    }
	}
