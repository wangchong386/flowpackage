package com.bupt.flowpackage.biz.auth.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.bupt.flowpackage.common.domain.BaseRequest;

public class AdminAddReq extends BaseRequest{
	private static final long serialVersionUID = 1L;
	/**账号*/
	@NotBlank
	@Pattern(regexp="^\\w{4,20}$", message="账号必须是4-20个字母或数字或下划线")
	private String loginName;
	/*@NotBlank
	@Pattern(regexp="^\\w{5,20}$", message="密码必须是5-20个字母或数字或下划线")
	private String password;
	@NotBlank(message="重复密码不能为空")
	private String rePassword;*/
	/**角色id*/
	@NotNull(message="请选择访问权限组")
	private Integer roleId;
	/**真实姓名*/
    private String realName;
    /**手机号*/
    private String mobile;
    /**邮箱*/
    private String email;
    
    private String adminDesc;
    
	public String getAdminDesc() {
		return adminDesc;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}*/
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
