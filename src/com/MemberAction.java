package com;

import com.opensymphony.xwork2.ActionSupport;
import com.Member;
import com.MemberService;
public class MemberAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Member user;
	private MemberService service;
	public MemberAction(){
		
	}
	public MemberService getService() {
		return service;
	}
	public void setService(MemberService service) {
		this.service = service;
	}
	public Member getUser() {
		return user;
	}
	public void setUser(Member user) {
		this.user = user;
	}
	
	public String execute(){
		if (service.save(user)!=null) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
}
