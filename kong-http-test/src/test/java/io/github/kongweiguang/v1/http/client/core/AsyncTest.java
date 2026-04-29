package io.github.kongweiguang.v1.http.client.core;


import io.github.kongweiguang.v1.http.client.Req;
import io.github.kongweiguang.v1.http.client.Res;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsyncTest {

    @Test
    public void test1() throws Exception {
        CompletableFuture<Res> future = Req.get("http://localhost:8080/get")
                .query("a", "1")
                .success(r -> System.out.println(r.str()))
                .fail(t -> System.out.println("error"))
                .okAsync();

        future.get(3, TimeUnit.MINUTES);
    }
    @Test
    public void test2() throws Exception {
        CompletableFuture<Res> future = Req.get("http://localhost:8080/error")
                .query("a", "1")
                .success(r -> System.out.println(r.str()))
                .fail(t -> System.out.println("error"))
                .okAsync();

        Res res = future.get(3, TimeUnit.MINUTES);
        System.out.println(res);
    }
}
