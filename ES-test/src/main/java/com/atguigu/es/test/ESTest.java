package com.atguigu.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @author liudm
 * @create 2021-04-10 14:39
 */
public class ESTest {
    public static void main(String[] args) throws Exception {
        // 创建客户端对象
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")));


// 关闭客户端连接
        client.close();
    }
}
