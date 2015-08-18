package com.springapp.mvc.entity;

import java.io.Serializable;

/**
 * Created by ZHANGJA4 on 8/18/2015.
 */
public class User implements Serializable{
    String uname;
    String pwd;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (uname != null ? !uname.equals(user.uname) : user.uname != null) return false;
        return !(pwd != null ? !pwd.equals(user.pwd) : user.pwd != null);

    }

    @Override
    public int hashCode() {
        int result = uname != null ? uname.hashCode() : 0;
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }
}
