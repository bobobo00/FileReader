package cn.io.study02;
/**
 * 理解操作步骤
 * 1，创建源
 * 2，选择流
 * 3，操作
 * 4，释放资源
 * 
 * 按字符的读取
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOtest04 {

	public static void main(String[] args) {
		File src=new File("aaa.txt");
		Reader reader=null;
		try {
			reader=new FileReader(src);
			char[] flush=new char[1024];
			int len=-1;
			while((len=reader.read(flush))!=-1) {
				String str=new String(flush,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=reader) {
				reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
