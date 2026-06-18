import java.util.List;
import java.util.ArrayList;

public class SmartLogis {
    public static void main(String[] args) {
        DonHang dh = new DonHang("DH-001");
        KhoHang kh = new KhoHang("Kho HN");
        kh.addDonHang(dh);
        kh = null;
        System.out.println("Đơn hàng còn tồn tại: " + dh.maDon);
    }
}

interface IDonViVanChuyen {
    void diChuyenHang();
}

class NhanVien implements IDonViVanChuyen {
    String hoTen;
    String maSoBHXH;

    @Override
    public void diChuyenHang() {
        System.out.println("Nhân viên đang bê hàng...");
    }
}

class RobotXepDo implements IDonViVanChuyen {
    int dungLuongPin;

    @Override
    public void diChuyenHang() {
        System.out.println("Robot đang nâng hàng bằng càng cua...");
    }
}

class DonHang {
    String maDon;

    DonHang(String maDon) {
        this.maDon = maDon;
    }
}

class KhoHang {
    String tenKho;
    List<DonHang> danhSachDonHang;

    KhoHang(String tenKho) {
        this.tenKho = tenKho;
        danhSachDonHang = new ArrayList<DonHang>();
    }

    void addDonHang(DonHang dh) {
        danhSachDonHang.add(dh);
    }
}