/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.dto;

import java.io.Serializable;

/**
 * @author : DUNGPT
 * @PG_ID : LoginDto
 * @createDate : 09.01.2016
 */
public class LoginDto implements Serializable {

    /** Init serialVersionUID is 6666905163744174682L **/
    private static final long serialVersionUID = 6666905163744174682L;

    /** Init phoneNumber **/
    private String phoneNumber;

    /** Init password **/
    private String password;

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber
     *            the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
