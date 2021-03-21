package com.example.demoS.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.demoS.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ)),
    ADMINTRAINEE (null);

    private final Set<ApplicationUserRole> permissions; {

    }

    ApplicationUserRole(Set<ApplicationUserRole> permissions) {
        this.permissions = permissions;
    }
}

