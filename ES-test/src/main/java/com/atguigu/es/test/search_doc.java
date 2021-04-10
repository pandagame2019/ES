package com.atguigu.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;


/**
 * @author liudm
 * @create 2021-04-10 14:46
 */
public class search_doc {
    public static void main(String[] args) throws Exception {
        //创建客户端对象
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")));
        //1.创建请求对象
        GetRequest request = new GetRequest().index("user").id("1001");
//2.客户端发送请求，获取响应对象
        GetResponse response = client.get(request, RequestOptions.DEFAULT);
////3.打印结果信息
        System.out.println("_index:" + response.getIndex());
        System.out.println("_type:" + response.getType());
        System.out.println("_id:" + response.getId());
        System.out.println("source:" + response.getSourceAsString());
        // 关闭客户端连接
        client.close();
    }
}
