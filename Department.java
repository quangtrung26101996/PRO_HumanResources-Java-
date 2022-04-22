public class Department {
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuongNhanVien;

    public Department(String maBoPhan, String tenBoPhan, int soLuongNhanVien) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public String toString() {
        String informationOfDepartment = "";
        informationOfDepartment += String.format("Mã bộ phận: %-10s Tên bộ phận: %-17s Số lượng nhân viên hiện tại: %d",
                maBoPhan, tenBoPhan, soLuongNhanVien);
        return informationOfDepartment;
    }
}
