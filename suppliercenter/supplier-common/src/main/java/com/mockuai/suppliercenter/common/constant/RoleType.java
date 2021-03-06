package com.mockuai.suppliercenter.common.constant;

/**
 * Created by duke on 15/8/22.
 */
public enum RoleType {

    NONE(0L),
    BUYER(1L),
    SELLER(2L),
    MANAGER(3L);

    private Long role;

    RoleType(Long role) {
        this.role = role;
    }

    public Long getValue() {
        return role;
    }
}
