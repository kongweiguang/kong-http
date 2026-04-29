package io.github.kongweiguang.v1.http.client.body;

import io.github.kongweiguang.v1.http.client.spec.HttpReqSpec;
import okhttp3.RequestBody;

/**
 * 根据请求规格编码请求体
 *
 * @author kongweiguang
 */
public interface BodyEncoder {
    RequestBody encode(HttpReqSpec spec);
}

