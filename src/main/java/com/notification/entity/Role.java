package com.notification.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "roles")
public class Role extends AuditModel {

	private static final long serialVersionUID = -7468030224005925252L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;

	@NotBlank
	@Size(max = 100)
	@Column(unique = true)
	private String roleName;

	public Role() {
		super();
	}
	public Role(@NotBlank @Size(max = 100) String roleName) {
		super();
		this.roleName = roleName;
	}

	/*@ManyToOne
    @JoinColumn(name = "user_id")*/
	

	//@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "role_privilege", joinColumns = {@JoinColumn(name = "role_id")},inverseJoinColumns = { @JoinColumn(name = "privilege_id") })
	private Set<Privilege> privileges;
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

}
