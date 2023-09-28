package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {

    PermissionManager mngr = new PermissionManager();
    @Test
    void getRoleName() {
        assertEquals("User",mngr.getRoleName(mngr.getCurrentPermissionLevel()));
    }

    @Test
    void setPermissionLevel() {
        mngr.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER,mngr.getCurrentPermissionLevel());
    }

    @Test
    void getCurrentPermissionLevel() {
        mngr.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER,mngr.getCurrentPermissionLevel());
    }
}