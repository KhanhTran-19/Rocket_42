package Exercise2_Question3;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public double tinhChuVi() {
        System.out.println("Tinh chu vi theo hinh vuong");
        return super.tinhChuVi();
    }

    @Override
    public double tinhDienTich() {
        System.out.println("Tinh dien tich theo hinh vuong");
        return super.tinhDienTich();
    }
}
