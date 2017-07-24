package CommModels;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Data model for holding info about each device including it's name, type and pins
 */
public class Arm implements Device<ArrayList<Integer>, ArmState>, Serializable
{
    int deviceId;
    private ArrayList<Integer> devicePin;
    private String deviceName;
    private DeviceStatus deviceStatus;
    private ArmState deviceState;

    public Arm(ArrayList<Integer> pin, String name, DeviceStatus status, ArmState state)
    {
        deviceId = -1;
        this.devicePin = pin;
        this.deviceName = name;
        this.deviceStatus = status;
        this.deviceState = state;
    }

    @Override
    public int getDeviceId()
    {
        return deviceId;
    }

    @Override
    public ArrayList<Integer> getDevicePin()
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
    public ArmState getDeviceState()
    {
        return deviceState;
    }

    @Override
    public void setDeviceId(int id)
    {
        deviceId = id;
    }

    @Override
    public void setDevicePin(ArrayList<Integer> p)
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
    public void setDeviceState(ArmState as)
    {
        this.deviceState = as;
    }
}