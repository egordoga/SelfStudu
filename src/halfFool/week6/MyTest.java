package halfFool.week6;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        DataDB dataDB = new DataDB();
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new HttpHandler(){
            @Override
            public void handle(HttpExchange exc) throws IOException {
                exc.sendResponseHeaders(200, 0);
                exc.getResponseHeaders().put("Access-Control-Allow-Origin", Arrays.asList("*"));
                PrintWriter out = new PrintWriter(exc.getResponseBody());
                //out.println("Hello, Sania");
                OutputStream os = exc.getResponseBody();

                dataDB.initList();
                for (Data data : dataDB.list) {
                    String json = gson.toJson(data);
                   byte[] bytes = json.getBytes();
                    //exc.sendResponseHeaders(200, bytes.length);
                    os.write(bytes);
                    //out.println(json);
                }

                InputStream is = exc.getRequestBody();
                StringBuilder sb = new StringBuilder();

                int read = -1;
                while((read = is.read()) != -1){
                    System.out.print((char)read);
                }
                //out.close();
                exc.close();
            }
        });
        server.createContext("/4000", new HttpHandler(){
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
        server.start();
        System.out.println("Server started\nPress any key to stop...");
        System.in.read();
        server.stop(0);
        System.out.println("Server stoped");
    }


    /*@Override
    public void handle(HttpExchange exc) throws IOException {
        exc.sendResponseHeaders(200, 0);
        PrintWriter out = new PrintWriter(exc.getResponseBody());
        out.println("I`m full fool");
        out.close();
        exc.close();
    }*/
}
