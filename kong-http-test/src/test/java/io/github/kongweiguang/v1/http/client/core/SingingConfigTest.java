package io.github.kongweiguang.v1.http.client.core;

import io.github.kongweiguang.v1.http.client.Req;
import io.github.kongweiguang.v1.http.client.Res;
import org.junit.jupiter.api.Test;

public class SingingConfigTest {
    @Test
    public void test1() throws Exception {
        final Res res = Req.get("http://localhost:80/get_string")
                .config(c -> c.followRedirects(false).ssl(false))
                .ok();
    }
}
