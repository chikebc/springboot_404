package com.springboot404.springboot_404;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public interface RoleRepository extends WebSecurityConfigurerAdapter {
    Role findByRole(String role);
}
