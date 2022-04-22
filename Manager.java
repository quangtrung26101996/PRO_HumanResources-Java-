public class Manager extends Staff implements ICalculator {
    private String chucVu;

    public Manager(String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam,
            String boPhanLamViec, int soNgayNghiPhep, String chucVu) {
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.chucVu = chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    @Override
    public long calculateSalary() {
        long salaryOfManager = (long) (super.getHeSoLuong() * 5000000);
        if (chucVu.equalsIgnoreCase("Business Leader")) {
            salaryOfManager += 8000000;
        }
        if (chucVu.equalsIgnoreCase("Project Leader")) {
            salaryOfManager += 5000000;
        }
        if (chucVu.equalsIgnoreCase("Technical Leader")) {
            salaryOfManager += 6000000;
        }
        return salaryOfManager;
    }

    @Override
    public void displayListStaff() {
        System.out.printf(
                "ID: %-10s Name: %-20s Age: %-6d Coefficients Salary: %-6.2f Date Start Work: %-15s Department: %-15s Number days off: %-6d Position: %s%n",
                super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(),
                super.getNgayVaoLam(), super.getBoPhanLamViec(), super.getSoNgayNghiPhep(), chucVu);
    }

    @Override
    public void displaySalary() {
        System.out.printf(
                "ID: %-10s Name: %-20s Age: %-6d Coefficients Salary: %-6.2f Department: %-15s Position: %-17s Salary: %d%n",
                super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(),
                super.getBoPhanLamViec(), chucVu, calculateSalary());
    }

    @Override
    public void displayFullInformation() {
        System.out.printf(
                "ID: %-10s Name: %-20s Age: %-6d Coefficients Salary: %-6.2f Date Start Work: %-15s Department: %-15s Number days off: %-6d Position: %-17s Salary: %d%n",
                super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(),
                super.getNgayVaoLam(), super.getBoPhanLamViec(), super.getSoNgayNghiPhep(), chucVu, calculateSalary());
    }
}
