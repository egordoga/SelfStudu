package halfFool.week6;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

public class MyTest {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(80), 0);
        server.createContext("/", new HttpHandler(){
            @Override
            public void handle(HttpExchange exc) throws IOException {
                exc.sendResponseHeaders(200, 0);
                PrintWriter out = new PrintWriter(exc.getResponseBody());
                out.println("I`m full fool");
                out.close();
                exc.close();
            }
        });
        server.createContext("/4000", new HttpHandler(){
            @Override
            public void handle(HttpExchange exc) throws IOException {
                exc.sendResponseHeaders(200, 0);
                PrintWriter out = new PrintWriter(exc.getResponseBody());
                out.println("I`m 1/2 full fool");
                out.close();
                exc.close();
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
