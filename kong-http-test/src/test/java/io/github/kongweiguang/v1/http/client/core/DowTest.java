package io.github.kongweiguang.v1.http.client.core;

import io.github.kongweiguang.v1.http.client.Req;
import io.github.kongweiguang.v1.http.client.Res;
import io.github.kongweiguang.v1.http.client.exception.KongHttpRuntimeException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DowTest {

    @Test
    void testDow() {
        Res ok = Req.get("http://localhost:8080/xz").ok();

        try {
            ok.file("C:\\test\\k.txt");
        } catch (IOException e) {
            throw new KongHttpRuntimeException(e);
        }
    }
}
