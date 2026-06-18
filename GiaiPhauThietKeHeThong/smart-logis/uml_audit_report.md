Giải thích lỗi của sơ đồ cũ:
LỖI 1: Ép Robot kế thừa Nhân viên Robot không thể có thuộc tính maSoBHXH(Vi phạm nguyên tắc Liskov Substitution)
LỖI 2: Khởi tạo cứng Đơn Hàng bên trong Kho (Thắt chặt vòng đời - Composition) nếu Kho bị hủy (Garbage collected), Đơn hàng cũng mất.

PlantUML mới:
interface IDonViVanChuyen { + diChuyenHang(): void
}
class NhanVien {
~ hoTen: String
~ maSoBHXH: String + diChuyenHang(): void
}
class RobotXepDo {
~ dungLuongPin: int + diChuyenHang(): void
}
class DonHang {
~ maDon: String
~ DonHang(maDon: String)
}
class KhoHang {
~ tenKho: String
~ danhSachDonHang: List<DonHang>
~ KhoHang(tenKho: String)
~ addDonHang(dh: DonHang): void
}
class SmartLogis { + {static} main(args: String[]): void
}
