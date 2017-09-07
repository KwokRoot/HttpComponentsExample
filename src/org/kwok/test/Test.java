package org.kwok.test;

import java.net.InetAddress;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Test {

	public static void main(String[] args) throws Exception {
		
		System.out.println("------------------------------ 操作 1 ------------------------------");
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
		HttpGet httpRequest = new HttpGet("http://127.0.0.1");
		System.out.println(httpRequest.getRequestLine());
		
		CloseableHttpResponse response = httpclient.execute(httpRequest);
		System.out.println(EntityUtils.toString(response.getEntity()));
		
		
		System.out.println("------------------------------ 操作 2 ------------------------------");
		
		InetAddress inetAddress=InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
		System.out.println(inetAddress.getHostAddress());
		
	}
}
