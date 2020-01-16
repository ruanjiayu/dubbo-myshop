package com.fun.uncle.myshop.service.search.provider.api.impl;

import com.fun.uncle.myshop.service.search.api.SearchService;
import com.fun.uncle.myshop.service.search.domain.TbItemResult;
import com.fun.uncle.myshop.service.search.provider.MyShopServiceSearchProviderApplication;
import com.fun.uncle.myshop.service.search.provider.mapper.TbItemResultMapper;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/16  9:36
 * @Version: 0.0.1-SNAPSHOT
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyShopServiceSearchProviderApplication.class)
public class SearchServiceImplTest {

    @Autowired
    private SolrClient solrClient;

    @Autowired
    private TbItemResultMapper tbItemResultMapper;

    /**
     * 向域内添加一条记录
     */
    @Test
    public void testAddDocument() {
        SolrInputDocument document = new SolrInputDocument();
        document.addField("id", 1995);
        document.addField("name", "ruanjiayu");
        try {
            solrClient.add(document);
            solrClient.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 域内删除一条记录
     */
    @Test
    public void testDeleteDocument() {
        try {
//            solrClient.deleteById("1995"); 根据ID来进行删除
//            solrClient.deleteByQuery("name:ruanjiayu");
            solrClient.deleteByQuery("*:*"); /*将全部数据删除*/
            solrClient.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 将MySQL内的数全部查询出来导入到Solr
     */
    @Test
    public void initSolr() {
        List<TbItemResult> tbItemResults = tbItemResultMapper.selectAll();

        try {
            SolrInputDocument document = null;
            for (TbItemResult tbItemResult : tbItemResults) {
                document = new SolrInputDocument();
                document.addField("id", tbItemResult.getId());
                document.addField("tb_item_cid", tbItemResult.getTbItemCid());
                document.addField("tb_item_cname", tbItemResult.getTbItemCname());
                document.addField("tb_item_title", tbItemResult.getTbItemTitle());
                document.addField("tb_item_sell_point", tbItemResult.getTbItemSellPoint());
                document.addField("tb_item_desc", tbItemResult.getTbItemDesc());

                solrClient.add(document);
            }
            solrClient.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 对数据进行高亮展示
     */
    @Test
    public void testSearch() {
        SolrQuery query = new SolrQuery();

        // 查询条件
        query.setQuery("手机");

        // 分页
        query.setStart(0);
        query.setRows(10);

        // 设置默认分词
        query.set("df", "tb_item_keywords");

        // 设置高亮
        query.setHighlight(true);
        query.addHighlightField("tb_item_title");
        query.setHighlightSimplePre("<span style='color:red;'>");
        query.setHighlightSimplePost("</span>");

        // 开始查询
        try {
            QueryResponse queryResponse = solrClient.query(query);
            // 获取高亮
            Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
            SolrDocumentList results = queryResponse.getResults();
            for (SolrDocument result : results) {
                List<String> strings = highlighting.get(result.get("id")).get("tb_item_title");
                if (strings != null && strings.size() > 0) {
                    String title = strings.get(0);
                    System.out.println(title);
                }
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}