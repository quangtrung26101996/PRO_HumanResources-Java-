import java.util.Comparator;

public abstract class Staff {
    private String maNhanVien;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private double heSoLuong;
    private String ngayVaoLam;
    private String boPhanLamViec;
    private int soNgayNghiPhep;

    public Staff(String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam,
            String boPhanLamViec, int soNgayNghiPhep) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanLamViec = boPhanLamViec;
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public void setSoNgayNghiPhep(int soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public int getSoNgayNghiPhep() {
        return soNgayNghiPhep;
    }

    public abstract void displayListStaff();

    public abstract void displaySalary();

    public abstract void displayFullInformation();

    public abstract long calculateSalary();

    public static Comparator<Staff> salaryIsAscending = new Comparator<Staff>() {
        public int compare(Staff staff1, Staff staff2) {

            long tienLuong1 = staff1.calculateSalary();
            long tienLuong2 = staff2.calculateSalary();

            return (int) (tienLuong1 - tienLuong2);
        }
    };
    public static Comparator<Staff> salaryIsDescending = new Comparator<Staff>() {
        public int compare(Staff staff1, Staff staff2) {

            long tienLuong1 = staff1.calculateSalary();
            long tienLuong2 = staff2.calculateSalary();

            return (int) (tienLuong2 - tienLuong1);
        }
    };
}
