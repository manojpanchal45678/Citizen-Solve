/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

/**
 *
 * @author naveen
 */
public class UserInfo {
    String name,cid;
    public UserInfo(String n,String c)
    {
        name = n;
        cid = c;
    }
    public String getName()
    {
        return name;
    }
    public String getCid()
    {
        return cid;
    }
}
