package com.dionlan.data.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "user_name", unique = true)
	private String userName;
	
	@NotBlank
	@Column(name = "full_name")
	private String fullName;
	
	@NotBlank
	@Column(name = "password")
	private String password;
	
	@NotBlank
	@Column(name = "account_non_expired")
	private Boolean accountNonExpired;
	
	@NotBlank
	@Column(name = "account_non_locked")
	private Boolean accountNonLocked;
	
	@NotBlank
	@Column(name = "credentials_non_expired")
	private Boolean credentialsNonExpired;
	
	@NotBlank
	@Column(name = "enabled")
	private Boolean enabled;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_permission", joinColumns = { @JoinColumn (name = "id_user") },
			inverseJoinColumns = { @JoinColumn (name = "id_permission")})
	private List<Permission> permissions;
	
	public List<String> getRoles() {
		List<String> roles = new ArrayList<>();
		for (Permission permission : this.permissions) {
			roles.add(permission.getDescription());
		}
		return roles;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.permissions;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
}
