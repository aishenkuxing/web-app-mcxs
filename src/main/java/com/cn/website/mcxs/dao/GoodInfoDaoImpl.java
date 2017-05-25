package com.cn.website.mcxs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.stereotype.Repository;

import com.cn.website.common.dao.impl.BaseDaoSupportImpl;
import com.cn.website.mcxs.bean.GoodsInfo;


@Repository("goodInfoDao")
public class GoodInfoDaoImpl extends BaseDaoSupportImpl implements GoodInfoDao{
 
	@SuppressWarnings("unchecked")
	public List<GoodsInfo> getGoodInfo(String name){
//		return session.createSQLQuery(
//				 "SELECT * FROM Person where g_title like :g_title" )
//			.addEntity( GoodInfo.class )
//			.setParameter("g_title", ""+name+"%")
//			.list();
//		
//		return entityManager.createNativeQuery( "SELECT * FROM goods_info where g_title like :g_title", GoodInfo.class)
//		.setParameter("g_title", ""+name+"%")
//		.getResultList();
		Session session = currentSession();
		DetachedCriteria query = DetachedCriteria.forClass(GoodsInfo.class).add(Property.forName("title").like("%"+name+"%"));
		List<GoodsInfo> results = query.getExecutableCriteria(session).list();
		return results;
	}
}
