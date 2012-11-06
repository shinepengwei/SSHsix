<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  
  <body>
  sssssss
 <s:form action="loginApp" method="post">
	<s:textfield name="user.username" label="用户名"></s:textfield>
	<s:password name="user.password" label="密码"></s:password>
	<s:submit label="提交"></s:submit>
</s:form>

<%
		/*Transaction tr=HibernateSessionFactory.getSession().beginTransaction();
		Member m=new Member();
		m.setPassword("222");
		m.setUsername("cc");
		HibernateSessionFactory.getSession().save(m);
		tr.commit();
		HibernateSessionFactory.getSession().close();
		*/
		

 %>

  </body>
</html>
