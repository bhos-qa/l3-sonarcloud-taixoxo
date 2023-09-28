package org.example;
import org.example.PermissionLevel;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        // Initialize mCurrentLevel to USER by default
        mCurrentLevel = PermissionLevel.USER;
    }
    public String getRoleName(PermissionLevel permissionLevel) {
        return this.mCurrentLevel.getName();
    }
    public void setPermissionLevel(PermissionLevel permissionLevel) {
        mCurrentLevel = permissionLevel;
    }

    public PermissionLevel getCurrentPermissionLevel() {
        return mCurrentLevel;
    }
}
