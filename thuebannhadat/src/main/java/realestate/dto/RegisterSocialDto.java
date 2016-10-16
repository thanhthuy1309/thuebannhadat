package realestate.dto;

public class RegisterSocialDto {

  /** Init email **/
  private String email;

  /** Init dienThoai **/
  private String dienThoai;

  /** Init dienThoai **/
  private String hoTen;

  /** Init soCodeKichHoat **/
  private Integer soCodeKichHoat;

  /** Init maCodeKichHoat **/
  private String maCodeKichHoat;

  /** Init idNguoiDung **/
  private Integer idNguoiDung;

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

  /**
   * @return the soCodeKichHoat
   */
  public Integer getSoCodeKichHoat() {
    return soCodeKichHoat;
  }

  /**
   * @param soCodeKichHoat
   *          the soCodeKichHoat to set
   */
  public void setSoCodeKichHoat(Integer soCodeKichHoat) {
    this.soCodeKichHoat = soCodeKichHoat;
  }

  /**
   * @return the maCodeKichHoat
   */
  public String getMaCodeKichHoat() {
    return maCodeKichHoat;
  }

  /**
   * @param maCodeKichHoat
   *          the maCodeKichHoat to set
   */
  public void setMaCodeKichHoat(String maCodeKichHoat) {
    this.maCodeKichHoat = maCodeKichHoat;
  }

  /**
   * @return the idNguoiDung
   */
  public Integer getIdNguoiDung() {
    return idNguoiDung;
  }

  /**
   * @param idNguoiDung the idNguoiDung to set
   */
  public void setIdNguoiDung(Integer idNguoiDung) {
    this.idNguoiDung = idNguoiDung;
  }

  public RegisterSocialDto(String email, String hoTen) {
    this.email = email;
    this.hoTen = hoTen;
  }

  public RegisterSocialDto() {
  }
}
