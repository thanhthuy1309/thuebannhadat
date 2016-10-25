package realestate.dto;

public class RegisterSocialDto {

  /** Init email **/
  private String userEmail;

  /** Init dienThoai **/
  private String userPhone;

  /** Init dienThoai **/
  private String userName;

  /** Init soCodeKichHoat **/
  private Integer activationCodeTimes;

  /** Init maCodeKichHoat **/
  private String activationCode;

  /** Init idNguoiDung **/
  private Integer userId;

  /** Init trangThai **/
  private Integer status;

  public RegisterSocialDto(String userEmail, String userName) {
    this.userEmail = userEmail;
    this.userName = userName;
  }

  public RegisterSocialDto() {
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getActivationCodeTimes() {
    return activationCodeTimes;
  }

  public void setActivationCodeTimes(Integer activationCodeTimes) {
    this.activationCodeTimes = activationCodeTimes;
  }

  public String getActivationCode() {
    return activationCode;
  }

  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
}
