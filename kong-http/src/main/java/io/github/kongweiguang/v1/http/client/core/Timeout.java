package io.github.kongweiguang.v1.http.client.core;

import java.time.Duration;

/**
 * 设置请求超时
 *
 * @author kongweiguang
 */
public record Timeout(Duration connect, Duration write, Duration read) {
}
