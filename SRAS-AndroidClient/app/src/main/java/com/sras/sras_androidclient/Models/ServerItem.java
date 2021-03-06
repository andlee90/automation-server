package com.sras.sras_androidclient.Models;

public class ServerItem
{
    private int id;
    private String name;
    private String address;
    private int port;
    private String username;
    private String password;

    public ServerItem(int id, String n, String a, int p, String user, String pass)
    {
        this.id = id;
        this.name = n;
        this.address = a;
        this.port = p;
        this.username = user;
        this.password = pass;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public int getPort()
    {
        return this.port;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setAddress(String a)
    {
        this.address = a;
    }

    public void setPort(int p)
    {
        this.port = p;
    }

    public void setUsername(String user)
    {
        this.username = user;
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }
}
