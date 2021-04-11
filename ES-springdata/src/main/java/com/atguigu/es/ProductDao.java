package com.atguigu.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liudm
 * @create 2021-04-11 16:20
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {
}
