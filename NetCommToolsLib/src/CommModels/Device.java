package CommModels;

import java.io.Serializable;

/**
 * Data model for holding info about each device including it's name, type and pins
 */
public class Device implements Serializable
{
    int deviceId;
    private int devicePin;
    private String deviceName;
    private String deviceType;
    private String deviceStatus;

    public Device(int dp, String dn, String dt, String ds)
    {
        deviceId = -1;
        this.devicePin = dp;
        this.deviceName = dn;
        this.deviceType = dt;
        this.deviceStatus = ds;
    }

    public int getDeviceId()
    {
        return deviceId;
    }

    public int getDevicePin()
    {
        return devicePin;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public String getDeviceStatus()
    {
        return deviceStatus;
    }

    public void setDevicePin(int p)
    {
        this.devicePin = p;
    }

    public void setDeviceName(String dn)
    {
        this.deviceName = dn;
    }

    public void setDeviceType(String dt)
    {
        this.deviceType = dt;
    }

    public void setDeviceStatus(String ds)
    {
        this.deviceStatus = ds;
    }
}
