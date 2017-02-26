package halfFool.week6;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by serhii on 25.02.17.
 */
public class Test {
    public static void main(String[] args) throws IOException {

        //192.168.1.97
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                httpExchange.getResponseHeaders().put("Access-Control-Allow-Origin", Arrays.asList("*"));
                String requestUrl = httpExchange.getRequestURI().toString();
                System.out.println(requestUrl);
                System.out.println("HTTP method is " + httpExchange.getRequestMethod());

                String[] params = requestUrl.split("\\?")[1].split("&");
                String name = params[0].split("=")[1];


                try (OutputStream outputStream = httpExchange.getResponseBody()) {
                    String s = "Hello from " + name;
                    httpExchange.sendResponseHeaders(200, s.length());

                    outputStream.write(s.getBytes());
                    outputStream.flush();
                    outputStream.close();
                }

            }
        });
        server.createContext("/post-info", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                httpExchange.getResponseHeaders().put("Access-Control-Allow-Origin", Arrays.asList("*"));

                InputStream is = httpExchange.getRequestBody();
                StringBuilder sb = new StringBuilder();

                int read = -1;
                while((read = is.read()) != -1){
                    System.out.print((char)read);
                }



            }
        });
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started. Connect to localhost:8000/test");
    }

}
