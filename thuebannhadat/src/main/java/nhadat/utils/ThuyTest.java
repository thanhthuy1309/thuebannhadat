package nhadat.utils;

public class ThuyTest {
  public static void main(String[] args) {
    String id_thanhpho = StringUtils.replaceTitleSpecial("Đồng Tháp");
    String id_quanhuyen = StringUtils.replaceTitleSpecial("Xuân Lộc");
    String[] lstphuongxa = {
        "Bảo Hòa","Gia Ray","Lang Minh","Suối Cao","Suối Cát","Xuân Bắc","Xuân Định","Xuân Hiệp","Xuân Hòa","Xuân Hưng","Xuân Phú","Xuân Tâm","Xuân Thành","Xuân Thọ","Xuân Trường",
        
    };

    for (String s : lstphuongxa) {
      String id_phuongxa = StringUtils.replaceTitleSpecial(s);
      System.out
          .println("INSERT INTO `tbl_phuongxa` (`id_phuongxa`, `id_quanhuyen`, `id_thanhpho`, `ten_phuongxa`, `trangthai`) VALUES ('"
              + id_phuongxa + "', '" + id_quanhuyen + "', '" + id_thanhpho + "', '" + s + "', '1');");
    }
  }
}
