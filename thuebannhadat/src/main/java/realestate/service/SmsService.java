package realestate.service;

/**
 * @author : ThuyTTT
 * @PG_ID : SmsService
 * @createDate : 15.10.2016
 */
public interface SmsService {

  /**
   * send code register
   * 
   * @param phone
   * @param code
   * @return true, if successful
   */
  public boolean sendSmsCodeRegister(String phone, String code);
}
