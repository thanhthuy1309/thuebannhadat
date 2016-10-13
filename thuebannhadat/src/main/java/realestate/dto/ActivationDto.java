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
 * @PG_ID : ActivationDto
 * @createDate : 09.01.2016
 */
public class ActivationDto implements Serializable {

    /** Init serialVersionUID is 6666905163744174682L **/
    private static final long serialVersionUID = 6666905163744174682L;

    /** Init phoneNumber **/
    private String phoneNumber;

    /** Init activationCode **/
    private String activationCode;

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
     * @return the activationCode
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * @param activationCode
     *            the activationCode to set
     */
    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }
}
