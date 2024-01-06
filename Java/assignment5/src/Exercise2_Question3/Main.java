package Exercise2_Question3;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(4, 5);
        System.out.println("Chu vi hinh chu nhat: " + hcn.tinhChuVi());
        System.out.println("Dien tich hinh chu nhat: " + hcn.tinhDienTich());

        HinhVuong hv = new HinhVuong(3);
        System.out.println("Chu vi hinh vuong: " + hv.tinhChuVi());
        System.out.println("Dien tich hinh vuong: " + hv.tinhDienTich());
    }
}
