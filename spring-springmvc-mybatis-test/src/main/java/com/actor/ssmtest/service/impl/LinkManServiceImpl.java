package com.actor.ssmtest.service.impl;

import com.actor.ssmtest.dao.CustomerDao;
import com.actor.ssmtest.dao.LinkManDao;
import com.actor.ssmtest.domain.Customer;
import com.actor.ssmtest.domain.LinkMan;
import com.actor.ssmtest.service.LinkManService;
import com.actor.ssmtest.utils.HibernateUtils;

public class LinkManServiceImpl implements LinkManService {

    private CustomerDao cd;
    private LinkManDao lmd;

    public void setCd(CustomerDao cd) {
        this.cd = cd;
    }

    public void setLmd(LinkManDao lmd) {
        this.lmd = lmd;
    }

    public void save(LinkMan lm) {
//        //打开事务
//        HibernateUtils.getCurrentSession().beginTransaction();
//        try {
//            //1 根据客户id获得客户对象
//            Long cust_id = lm.getCust_id();
//            Customer c = cd.getById(cust_id);
//            //2 将客户放入LinkMan中表达关系
//            lm.setCustomer(c);
//            //3 保存LinkMan
//            lmd.save(lm);
//        } catch (Exception e) {
//            e.printStackTrace();
//            //回滚事务
//            HibernateUtils.getCurrentSession().getTransaction().rollback();
//        }
//        //提交事务
//        HibernateUtils.getCurrentSession().getTransaction().commit();
    }
}
