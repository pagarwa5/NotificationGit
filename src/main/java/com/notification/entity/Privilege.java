package com.notification.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "privileges")
public class Privilege extends AuditModel{
	
	private static final long serialVersionUID = -788746003120931965L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long privilegeId;

	@NotBlank
	@Size(max = 100)
	@Column(unique = true)
	private String name;
	
	@NotBlank
	@Size(max = 100)
	private String groupName;
	
	/*@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;*/
	
	/*@ManyToOne
    @JoinColumn(name = "role_id")
	private Role role;*/

	

	public String getName() {
		return name;
	}

	public Long getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

/*	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	*/
	
	
}
