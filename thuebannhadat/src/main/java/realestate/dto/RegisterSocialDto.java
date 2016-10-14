package realestate.dto;

public class RegisterSocialDto {

  /** Init email **/
  private String email;

  /** Init dienThoai **/
  private String dienThoai;

  /** Init dienThoai **/
  private String hoTen;

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email
   *          the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the dienThoai
   */
  public String getDienThoai() {
    return dienThoai;
  }

  /**
   * @param dienThoai
   *          the dienThoai to set
   */
  public void setDienThoai(String dienThoai) {
    this.dienThoai = dienThoai;
  }

  /**
   * @return the hoTen
   */
  public String getHoTen() {
    return hoTen;
  }

  /**
   * @param hoTen
   *          the hoTen to set
   */
  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public RegisterSocialDto(String email, String hoTen) {
    this.email = email;
    this.hoTen = hoTen;
  }

}
