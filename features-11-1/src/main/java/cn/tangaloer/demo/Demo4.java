package cn.tangaloer.demo;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * JDK11 自带了这个 HTTP Client API
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo4 {
    public static void main(String[] args) {

    }

    /**
     * 同步调用
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void test1() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://baidu.com")).build();
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, handler);
        String body = response.body();
        System.out.println(body);
    }

    /**
     * 异步调用、阻塞获取
     */
    @Test
    public void test2() throws ExecutionException, InterruptedException {
        HttpClient client             = HttpClient.newHttpClient();
        HttpRequest request           = HttpRequest.newBuilder(URI.create("https://baidu.com")).build();
        HttpResponse.BodyHandler<String> handler  = HttpResponse.BodyHandlers.ofString();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request,handler);
        // 阻塞
        HttpResponse<String> result   = response.get();
        String body                   = result.body();
        System.out.println("after get");
        System.out.println(body);
    }

    @Test
    public void test3() throws ExecutionException, InterruptedException {
        HttpClient client             = HttpClient.newHttpClient();
        HttpRequest request           = HttpRequest.newBuilder(URI.create("http://jsonplaceholder.typicode.com/posts")).build();
        HttpResponse.BodyHandler<String> handler  = HttpResponse.BodyHandlers.ofString();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, handler);
        // 非阻塞
        HttpResponse<String> result   = response.join();
        String body                   = result.body();
        // print before
        System.out.println("after join");
        System.out.println(body);
    }
}
