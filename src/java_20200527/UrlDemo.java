package java_20200527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://corners.gmarket.co.kr/Bestsellers?ItemId=1771451843#desktop_layout-header");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		
		System.out.printf("protocol: %s%n",protocol);
		System.out.printf("host: %s%n",host);
		System.out.printf("path: %s%n",path);
		System.out.printf("port: %d%n",port);
		System.out.printf("query: %s%n",query);
		System.out.printf("ref: %s%n",reference);
		
		InputStream in = url.openStream(); //html 정보
		
		//url 데이터가 문자로구성되어있기 때문에 스트림은 1byte스트림보다 2byte스트림으로 처리하기 편하고
		//한줄씩 처리하는 편의성을 위해  BufferedReader를 사용했다.
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		
		
		
		
		
				
				
				
		
	}

}
