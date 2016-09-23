package nhadat.utils;

public class ThuyTest {
  public static void main(String[] args) {
    String id_thanhpho = StringUtils.replaceTitleSpecial("Ha Noi");
    String id_quanhuyen = StringUtils.replaceTitleSpecial("Ứng Hòa");
    String[] lstphuongxa = { "Cao Thành", "Đại Cường", "Đại Hùng", "Đội Bình", "Đông Lỗ", "Đồng Tân", "Đồng Tiến",
        "Hòa Lâm", "Hòa Nam", "Hòa Phú", "Hoa Sơn", "Hòa Xá", "Hồng Quang", "Kim Đường", "Liên Bạt", "Lưu Hoàng",
        "Minh Đức", "Phù Lưu", "Phương Tú", "Quảng Phú Cầu", "Sơn Công", "Tân Phương", "Tảo Dương Văn", "Trầm Lộng",
        "Trung Tú", "Trường Thịnh", "Vân Đình", "Vạn Thái", "Viên An", "Viên Nội", };

    for (String s : lstphuongxa) {
      String id_phuongxa = StringUtils.replaceTitleSpecial(s);
      System.out
          .println("INSERT INTO `tbl_phuongxa` (`id_phuongxa`, `id_quanhuyen`, `id_thanhpho`, `ten_phuongxa`, `trangthai`) VALUES ('"
              + id_phuongxa + "', '" + id_quanhuyen + "', '" + id_thanhpho + "', '" + s + "', '1');");
    }
    System.out.println();
    System.out.println();
    String[] duong = { "Lê Lợi", "Nguyễn Công Trứ", "Nguyễn Thượng Hiền", "Quang Trung", "Quốc lộ 21", "Thôn Thanh Ấm",
        "Tỉnh lộ 424", "Tô Hiệu", "Trần Đăng Ninh", "Văn Phú", };

    for (String d : duong) {
      String id_duong = StringUtils.replaceTitleSpecial(d);
      System.out
          .println("INSERT INTO `tbl_duong` (`id_duong`, `id_quanhuyen`, `id_thanhpho`, `ten_duong`, `trangthai`) VALUES ('"
              + id_duong + "', '" + id_quanhuyen + "', '" + id_thanhpho + "', '" + d + "', '1');");
    }
  }
}
