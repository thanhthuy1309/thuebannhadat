package realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

  @RequestMapping(value = "/404", method = RequestMethod.GET)
  public String trang404() {
    return "404";
  }

  @RequestMapping(value = "/ban", method = RequestMethod.GET)
  public String trangBan() {
    return "ban";
  }

  @RequestMapping(value = "/ban2", method = RequestMethod.GET)
  public String trangBan2() {
    return "ban2";
  }

  @RequestMapping(value = "/ban-list", method = RequestMethod.GET)
  public String trangBanList() {
    return "ban-list";
  }

  @RequestMapping(value = "/chi-tiet", method = RequestMethod.GET)
  public String trangChiTiet() {
    return "chi-tiet";
  }

  @RequestMapping(value = "/dangky-social", method = RequestMethod.GET)
  public String trangDangKySocial() {
    return "dangky-social";
  }

  @RequestMapping(value = "/dangtin", method = RequestMethod.GET)
  public String trangDangTin() {
    return "dangtin";
  }

  @RequestMapping(value = "/dangtin-thue", method = RequestMethod.GET)
  public String trangDangTinThue() {
    return "dangtin-thue";
  }

  @RequestMapping(value = "/dichvu", method = RequestMethod.GET)
  public String trangDichVu() {
    return "dichvu";
  }

  @RequestMapping(value = "/dichvu-detail", method = RequestMethod.GET)
  public String trangDichVuDetail() {
    return "dichvu-detail";
  }

  @RequestMapping(value = "/dichvu-list", method = RequestMethod.GET)
  public String trangDichVuList() {
    return "dichvu-list";
  }

  @RequestMapping(value = "/duan", method = RequestMethod.GET)
  public String trangDuAn() {
    return "duan";
  }

  @RequestMapping(value = "/duan2", method = RequestMethod.GET)
  public String trangDuAn2() {
    return "duan2";
  }

  @RequestMapping(value = "/duan-chitiet", method = RequestMethod.GET)
  public String trangDuAnChiTiet() {
    return "duan-chitiet";
  }

  @RequestMapping(value = "/duan-list", method = RequestMethod.GET)
  public String trangDuAnList() {
    return "duan-list";
  }

  @RequestMapping(value = "/lichsu", method = RequestMethod.GET)
  public String tranglichsu() {
    return "lichsu";
  }

  @RequestMapping(value = "/lienhe", method = RequestMethod.GET)
  public String tranglienhe() {
    return "lienhe";
  }

  @RequestMapping(value = "/moigioi", method = RequestMethod.GET)
  public String trangmoigioi() {
    return "moigioi";
  }

  @RequestMapping(value = "/moigioi-detail", method = RequestMethod.GET)
  public String trangmoigioidetail() {
    return "moigioi-detail";
  }

  @RequestMapping(value = "/moigioi-list", method = RequestMethod.GET)
  public String trangmoigioilist() {
    return "moigioi-list";
  }

  @RequestMapping(value = "/mua", method = RequestMethod.GET)
  public String trangmua() {
    return "mua";
  }

  @RequestMapping(value = "/mua2", method = RequestMethod.GET)
  public String trangmua2() {
    return "mua2";
  }

  @RequestMapping(value = "/mua3", method = RequestMethod.GET)
  public String trangmua3() {
    return "mua3";
  }

  @RequestMapping(value = "/mua4", method = RequestMethod.GET)
  public String trangmua4() {
    return "mua4";
  }

  @RequestMapping(value = "/mua5", method = RequestMethod.GET)
  public String trangmua5() {
    return "mua5";
  }

  @RequestMapping(value = "/mua6", method = RequestMethod.GET)
  public String trangmua6() {
    return "mua6";
  }

  @RequestMapping(value = "/mua-list", method = RequestMethod.GET)
  public String trangmualist() {
    return "mua-list";
  }

  @RequestMapping(value = "/naptien", method = RequestMethod.GET)
  public String trangnaptien() {
    return "naptien";
  }

  @RequestMapping(value = "/quanly", method = RequestMethod.GET)
  public String trangquanly() {
    return "quanly";
  }

  @RequestMapping(value = "/thechap", method = RequestMethod.GET)
  public String trangthechap() {
    return "thechap";
  }

  @RequestMapping(value = "/thechap2", method = RequestMethod.GET)
  public String trangthechap2() {
    return "thechap2";
  }

  @RequestMapping(value = "/thechap-list", method = RequestMethod.GET)
  public String trangthechaplist() {
    return "thechap-list";
  }

  @RequestMapping(value = "/thongbao", method = RequestMethod.GET)
  public String trangthongbao() {
    return "thongbao";
  }

  @RequestMapping(value = "/thue", method = RequestMethod.GET)
  public String trangthue() {
    return "thue";
  }

  @RequestMapping(value = "/thue2", method = RequestMethod.GET)
  public String trangthue2() {
    return "thue2";
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String trang() {
    return "";
  }

  @RequestMapping(value = "/thue-list", method = RequestMethod.GET)
  public String trangthuelist() {
    return "thue-list";
  }

  @RequestMapping(value = "/timkiem", method = RequestMethod.GET)
  public String trangtimkiem() {
    return "timkiem";
  }

  @RequestMapping(value = "/tintuc", method = RequestMethod.GET)
  public String trangtintuc() {
    return "tintuc";
  }

  @RequestMapping(value = "/tintuc-detail", method = RequestMethod.GET)
  public String trangtintucdetail() {
    return "tintuc-detail";
  }

  @RequestMapping(value = "/tintuc-list", method = RequestMethod.GET)
  public String trangtintuclist() {
    return "tintuc-list";
  }

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String trangindex() {
    return "index";
  }

  @RequestMapping(value = "/fb", method = RequestMethod.GET)
  public String trangFaceBook() {
    return "facebookConnect";
  }

}
