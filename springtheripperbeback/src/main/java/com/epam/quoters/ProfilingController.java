package com.epam.quoters;

public class ProfilingController implements ProfilingControllerMBean{
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
