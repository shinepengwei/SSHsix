package com;
import com.Member;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class MemberDao extends HibernateDaoSupport {
	public void saveMember(Member member){
		try{
			this.getHibernateTemplate().save(member);
		}catch(RuntimeException re){
			throw re;
		}
		
	}
}
