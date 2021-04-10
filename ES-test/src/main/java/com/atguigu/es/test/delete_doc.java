package com.atguigu.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
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
public class delete_doc {
    public static void main(String[] args) throws Exception {
        //创建客户端对象
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")));
        //创建请求对象
        DeleteRequest request = new DeleteRequest().index("user").id("1001");
//客户端发送请求，获取响应对象
        DeleteResponse response = client.delete(request, RequestOptions.DEFAULT);
//打印信息
        System.out.println(response.toString());
        // 关闭客户端连接
        client.close();
    }
}
