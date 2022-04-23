package dumpHttpAsync;

import java.io.IOException;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;



import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import com.vanillasource.gerec.ResourceReference;
import com.vanillasource.gerec.httpclient.AsyncApacheHttpClient;

import dumpHttpAsync.SimpleHttpAsyncClientDemo.AsyncHandler;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String path = "http://localhost:8080/dumpWebService/reportTypes2";
		AsyncHandler handler = new AsyncHandler();  
	   // String url = "http://php.weather.sina.com.cn/iframe/index/w_cl.php";  
	    Map<String, String> map = new HashMap<String, String>();  
	    map.put("code", "js");  
	    map.put("day", "0");  
	    map.put("city", "Shanghai");  
	    map.put("dfc", "1");  
	    map.put("charset", "utf-8");  
	    try {
			SimpleHttpAsyncClientDemo.send(path, map, "utf-8", handler);
		} catch (KeyManagementException | NoSuchAlgorithmException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
	    System.out.println("-----------------------------------");  
	      /*
	    map.put("city", "Beijing");  
	    try {
			SimpleHttpAsyncClientDemo.send(path, map, "utf-8", handler);
		} catch (KeyManagementException | NoSuchAlgorithmException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      */
	    System.out.println("-----------------------------------");  
	}
}
