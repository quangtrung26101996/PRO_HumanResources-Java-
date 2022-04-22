public class Employee extends Staff implements ICalculator {
    private double soGioLamThem;

    public Employee(String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam,
            String boPhanLamViec, int soNgayNghiPhep, double soGioLamThem) {
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.soGioLamThem = soGioLamThem;
    }

    public void setSoGioLamThem(double soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public double getSoGioLamThem() {
        return soGioLamThem;
    }

    @Override
    public long calculateSalary() {
        long salaryOfEmployee = (long) (super.getHeSoLuong() * 3000000 + soGioLamThem * 200000);
        return salaryOfEmployee;
    }

    @Override
    public void displayListStaff() {
        System.out.printf(
                "ID: %-10s Name: %-20s Age: %-6d Coefficients Salary: %-6.2f Date Start Work: %-15s Department: %-15s Number days off: %-6d Over time hours: %.1f%n",
                super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(),
                super.getNgayVaoLam(), super.getBoPhanLamViec(), super.getSoNgayNghiPhep(), soGioLamThem);
    }

    @Override
    public void displaySalary() {
        System.out.printf(
                "ID: %-10s Name: %-20s Age: %-6d Coefficients Salary: %-6.2f Department: %-15s Over time hours: %-6.1f Salary: %d%n",
                super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(),
                super.getBoPhanLamViec(), soGioLamThem, calculateSalary());
    }

    @Override
    public void displayFullInformation() {
        System.out.printf(
                "ID: %-10s Name: %-20s Age: %-6d Coefficients Salary: %-6.2f Date Start Work: %-15s Department: %-15s Number days off: %-6d Over time hours: %-6.1f Salary: %d%n",
                super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(),
                super.getNgayVaoLam(), super.getBoPhanLamViec(), super.getSoNgayNghiPhep(), soGioLamThem,
                calculateSalary());
    }

}
