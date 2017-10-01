package CommModels.Device;

import CommModels.User.User;

import java.io.Serializable;

/**
 * Data model for holding info about each relay channel device including it's name, type and pins
 */
public class RelayChannel implements Device<Integer, RelayChannelState>, Serializable
{
    private int deviceId;
    private int deviceListId;
    private int devicePin;
    private String deviceName;
    private DeviceStatus deviceStatus;
    private RelayChannelState deviceState;
    private User deviceUser;

    public RelayChannel(int id, int pin, String name, DeviceStatus status, RelayChannelState state)
    {
        this.deviceId = id;
        this.deviceListId = -1;
        this.devicePin = pin;
        this.deviceName = name;
        this.deviceStatus = status;
        this.deviceState = state;
        this.deviceUser = null;
    }

    @Override
    public int getDeviceId()
    {
        return deviceId;
    }

    @Override
    public int getDeviceListId()
    {
        return deviceListId;
    }

    @Override
    public Integer getDevicePin()
    {
        return devicePin;
    }

    @Override
    public String getDeviceName()
    {
        return deviceName;
    }

    @Override
    public DeviceStatus getDeviceStatus()
    {
        return deviceStatus;
    }

    @Override
    public RelayChannelState getDeviceState()
    {
        return deviceState;
    }

    @Override
    public User getDeviceUser()
    {
        return deviceUser;
    }

    @Override
    public void setDeviceListId(int id)
    {
        this.deviceListId = id;
    }

    @Override
    public void setDevicePin(Integer p)
    {
        this.devicePin = p;
    }

    @Override
    public void setDeviceName(String dn)
    {
        this.deviceName = dn;
    }

    @Override
    public void setDeviceStatus(DeviceStatus ds)
    {
        this.deviceStatus = ds;
    }

    @Override
    public void setDeviceState(RelayChannelState ls)
    {
        this.deviceState = ls;
    }

    @Override
    public void setDeviceUser(User deviceUser)
    {
        this.deviceUser = deviceUser;
    }
}
