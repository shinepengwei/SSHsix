package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class MemberService {
	public MemberService(){
		
	}
	private MemberDao dao;
	public MemberDao getDao() {
		return dao;
	}
	public void setDao(MemberDao dao) {
		this.dao = dao;
	} 
	public Member save(Member user){
		if(user.getUsername()==null||user.getPassword()==null)
			return null;
		dao.saveMember(user);
		return user;
	}

}
