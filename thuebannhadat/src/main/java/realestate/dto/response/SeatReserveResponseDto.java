/*
 * Copyright(C) 2016 GMO-Z.com RUNSYSTEM JSC. All rights reserved.
 *
 * (1)このソフトウェアは、GMO株式会社に帰属する機密情報 であり開示を固く禁じます。
 * (2)この情報を使用するには、GMO株式会社とのライセンス 契約が必要となります。
 *
 * This software is the confidential and proprietary information of
 * GMO-Z.com RUNSYSTEM. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with GMO-Z.com RUNSYSTEM.
 */
package realestate.dto.response;

import java.util.List;
import java.util.Map;

/**
 * @author : thuyttt
 * @PG_ID : SeatReserveResponseDto
 * @createDate : 11.08.2016
 */
public class SeatReserveResponseDto extends BaseResponseDto {

    private String customerId;

    private Map<Integer, List<String>> mapSeatResver;

    private boolean flagNew;

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     *            the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the mapSeatResver
     */
    public Map<Integer, List<String>> getMapSeatResver() {
        return mapSeatResver;
    }

    /**
     * @param mapSeatResver
     *            the mapSeatResver to set
     */
    public void setMapSeatResver(Map<Integer, List<String>> mapSeatResver) {
        this.mapSeatResver = mapSeatResver;
    }

    /**
     * @return the flagNew
     */
    public boolean isFlagNew() {
        return flagNew;
    }

    /**
     * @param flagNew
     *            the flagNew to set
     */
    public void setFlagNew(boolean flagNew) {
        this.flagNew = flagNew;
    }

}
