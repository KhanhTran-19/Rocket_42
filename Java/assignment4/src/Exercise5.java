import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public static enum GioiTinh {
        NAM,
        NU,
        KHAC
    }

    public static class CanBo {
        private String hoTen;
        private int tuoi;
        private GioiTinh gioiTinh;
        private String diaChi;

        public CanBo(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public GioiTinh getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(GioiTinh gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }
    }

    public class CongNhan extends CanBo {
        private int bac;

        public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
            super(hoTen, tuoi, gioiTinh, diaChi);
            this.bac = bac;
        }

        public int getBac() {
            return bac;
        }

        public void setBac(int bac) {
            this.bac = bac;
        }
    }

    public class KySu extends CanBo {
        private String nganhDaoTao;

        public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
            super(hoTen, tuoi, gioiTinh, diaChi);
            this.nganhDaoTao = nganhDaoTao;
        }

        public String getNganhDaoTao() {
            return nganhDaoTao;
        }

        public void setNganhDaoTao(String nganhDaoTao) {
            this.nganhDaoTao = nganhDaoTao;
        }
    }

    public class NhanVien extends CanBo {
        private String congViec;

        public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
            super(hoTen, tuoi, gioiTinh, diaChi);
            this.congViec = congViec;
        }

        public String getCongViec() {
            return congViec;
        }

        public void setCongViec(String congViec) {
            this.congViec = congViec;
        }
    }

    public class QLCB {
        private List<CanBo> canBoList;

        public QLCB() {
            canBoList = new ArrayList<>();
        }

        public void themMoiCanBo(CanBo canBo) {
            canBoList.add(canBo);
        }

        public CanBo timKiemTheoHoTen(String hoTen) {
            for (CanBo canBo : canBoList) {
                if (canBo.getHoTen().equals(hoTen)) {
                    return canBo;
                }
            }
            return null;
        }

        public void hienThiDanhSachCanBo() {
            for (CanBo canBo : canBoList) {
                System.out.println("Họ tên: " + canBo.getHoTen() +
                        ", Tuổi: " + canBo.getTuoi() +
                        ", Giới tính: " + canBo.getGioiTinh() +
                        ", Địa chỉ: " + canBo.getDiaChi());
            }
        }

        public void xoaCanBo(String hoTen) {
            List<CanBo> removeList = new ArrayList<>();

            for (CanBo canBo : canBoList) {
                if (canBo.getHoTen().equals(hoTen)) {
                    removeList.add(canBo);
                }
            }

            canBoList.removeAll(removeList);
        }

        public static void thoatKhoiChuongTrinh() {
            System.exit(0);
        }
    }
}
