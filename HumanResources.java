import java.util.*;

public class HumanResources {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int soChucNang = 0;
        ArrayList<Staff> totalStaffs = new ArrayList<Staff>();
        ArrayList<Department> totalDepartments = new ArrayList<Department>();

        /* Tạo dữ liệu thông tin nhân viên ban đầu */
        Department webDesigner = new Department("WD", "Web Designer", 5);
        Department frontEnd = new Department("FE", "Front-End", 5);
        Department backEnd = new Department("BE", "Back-End", 7);
        Department marketing = new Department("M", "Marketing", 3);
        totalDepartments.add(webDesigner);
        totalDepartments.add(frontEnd);
        totalDepartments.add(backEnd);
        totalDepartments.add(marketing);
        Staff employee1 = new Employee("WD01", "Nguyen Van An", 20, 2.0, "2/3/2020", webDesigner.getTenBoPhan(), 1,
                5.5);
        Staff employee2 = new Employee("WD02", "Pham Thanh Binh", 21, 2.1, "3/2/2020", webDesigner.getTenBoPhan(), 2,
                4.0);
        Staff employee3 = new Employee("FE02", "Pham The Hien", 26, 2.6, "10/5/2018", frontEnd.getTenBoPhan(), 0, 7.8);
        Staff employee4 = new Employee("FE05", "Le Thi Thanh", 29, 2.9, "4/5/2013", frontEnd.getTenBoPhan(), 0, 5.0);
        Staff employee5 = new Employee("BE02", "Tran Huu Sang", 23, 2.3, "24/9/2019", backEnd.getTenBoPhan(), 0, 8.0);
        Staff employee6 = new Employee("BE03", "Tran Thi Hien", 25, 2.5, "23/4/2020", backEnd.getTenBoPhan(), 0, 5.6);
        Staff employee7 = new Employee("M02", "Nguyen Thi Thuy Linh", 26, 2.6, "23/4/2020", marketing.getTenBoPhan(), 0,
                6.0);
        Staff employee8 = new Employee("M03", "Nguyen Trong Binh", 30, 3.0, "23/4/2020", marketing.getTenBoPhan(), 0,
                7.0);
        Staff manager1 = new Manager("WD03", "Nguyen Thuy Linh", 22, 2.2, "1/2/2019", webDesigner.getTenBoPhan(), 3,
                "Business Leader");
        Staff manager2 = new Manager("WD04", "Vu Linh Chi", 23, 2.3, "20/10/2009", webDesigner.getTenBoPhan(), 0,
                "Project Leader");
        Staff manager3 = new Manager("WD05", "Ngo Tuong Vi", 24, 2.4, "25/12/2008", webDesigner.getTenBoPhan(), 5,
                "Technical Leader");
        Staff manager4 = new Manager("FE01", "Nguyen Van An", 25, 2.5, "18/6/2016", frontEnd.getTenBoPhan(), 0,
                "Technical Leader");
        Staff manager5 = new Manager("FE03", "Vu Linh Chi", 27, 2.7, "7/8/2019", frontEnd.getTenBoPhan(), 0, "Boss");
        Staff manager6 = new Manager("FE04", "Nguyen Trong Hieu", 28, 2.8, "3/6/2017", frontEnd.getTenBoPhan(), 0,
                "Project Leader");
        Staff manager7 = new Manager("BE01", "Nguyen Van An", 20, 2.0, "16/12/2019", backEnd.getTenBoPhan(), 0,
                "Business Leader");
        Staff manager8 = new Manager("BE04", "Vu Quang Thang", 21, 2.1, "16/8/2016", backEnd.getTenBoPhan(), 0,
                "Technical Leader");
        Staff manager9 = new Manager("BE05", "Le Van Ha", 27, 2.7, "23/4/2020", backEnd.getTenBoPhan(), 0,
                "Project Leader");
        Staff manager10 = new Manager("BE06", "Nguyen Thi Thuy Linh", 25, 2.5, "23/4/2020", backEnd.getTenBoPhan(), 0,
                "Project Leader");
        Staff manager11 = new Manager("BE07", "Mai Linh Chi", 21, 2.1, "23/4/2020", backEnd.getTenBoPhan(), 0,
                "Technical Leader");
        Staff manager12 = new Manager("M01", "Nguyen Van An", 30, 3.0, "23/4/2020", marketing.getTenBoPhan(), 0,
                "Business Leader");

        totalStaffs.add(employee1);
        totalStaffs.add(employee2);
        totalStaffs.add(employee3);
        totalStaffs.add(employee4);
        totalStaffs.add(employee5);
        totalStaffs.add(employee6);
        totalStaffs.add(employee7);
        totalStaffs.add(employee8);
        totalStaffs.add(manager1);
        totalStaffs.add(manager2);
        totalStaffs.add(manager3);
        totalStaffs.add(manager4);
        totalStaffs.add(manager5);
        totalStaffs.add(manager6);
        totalStaffs.add(manager7);
        totalStaffs.add(manager8);
        totalStaffs.add(manager9);
        totalStaffs.add(manager10);
        totalStaffs.add(manager11);
        totalStaffs.add(manager12);

        /* Hiển thị thông báo hướng dẫn sử dụng App */
        notification();

        /* Mời người dùng chọn các chức năng của App */
        do {
            System.out.print("Xin mời bạn chọn chức năng (0-7) ... ");
            soChucNang = input.nextInt();
            while (soChucNang < 0 || soChucNang > 7) {
                System.out.print("Vui lòng chọn các chức năng có sẵn (0-7) ... ");
                soChucNang = input.nextInt();
            }
            switch (soChucNang) {
                case 1:
                    displayInformationStaffs(totalStaffs);
                    break;
                case 2:
                    displayInformationDepartments(totalDepartments);
                    break;
                case 3:
                    displayInformationStaffOfDepartments(totalStaffs, input);
                    break;
                case 4:
                    addStaff(totalStaffs, totalDepartments, webDesigner, frontEnd, backEnd, marketing, input);
                    break;
                case 5:
                    findStaff(totalStaffs, input);
                    break;
                case 6:
                    displayInformationDescendingSalary(totalStaffs);
                    break;
                case 7:
                    displayInformationAscendingSalary(totalStaffs);
                    break;
                case 0:
                    System.out.println("Xin cảm ơn !");
                    break;
            }

        } while (soChucNang != 0);
        input.close();
    }

    /**
     * Hàm notification () hiển thị thông báo hướng dẫn sử dụng
     */
    public static void notification() {
        System.out.println(
                "Xin giới thiệu ứng dụng Human Resources - dùng để quản lý nhân lực trong công ty. Ứng dụng có các chức năng cơ bản sau:");
        System.out.println(" 1. Hiển thị danh sách nhân viên có trong công ty");
        System.out.println(" 2. Hiển thị các bộ phận trong công ty");
        System.out.println(" 3. Hiển thị các nhân viên theo từng bộ phận");
        System.out.println(" 4. Thêm nhân viên mới vào công ty");
        System.out.println(" 5. Tìm kiếm nhân viên theo tên hoặc mã nhân viên");
        System.out.println(" 6. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần");
        System.out.println(" 7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
        System.out.println(" 0. Đóng ứng dụng");
        System.out.println();
    }

    /**
     * Hàm displayInformationStaffs hiển thị danh sách nhân viên hiện có trong công
     * ty
     * 
     * @param totalStaffs là biến lưu trữ toàn bộ thông tin nhân viên hiện có của
     *                    công ty
     */
    public static void displayInformationStaffs(ArrayList<Staff> totalStaffs) {
        for (Staff theStaff : totalStaffs) {
            theStaff.displayListStaff();
        }
    }

    /**
     * Hàm displayInformationDepartments () hiển thị thông tin các bộ phận hiện có
     * trong công ty
     * 
     * @param totalDepartments là biến lưu trữ toàn bộ thông tin bộ phận hiện có của
     *                         công ty
     */
    public static void displayInformationDepartments(ArrayList<Department> totalDepartments) {
        for (Department theDepartment : totalDepartments) {
            System.out.println(theDepartment.toString());
        }
    }

    /**
     * Hàm displayInformationStaffOfDepartments () hiển thị thông tin nhân viên theo
     * các bộ phận hiện có trong công ty
     * 
     * @param totalStaffs là biến lưu trữ toàn bộ thông tin nhân viên hiện có trong
     *                    công ty
     * @param input       là biến cho phép người dùng nhập thông tin mới vào
     */
    public static void displayInformationStaffOfDepartments(ArrayList<Staff> totalStaffs, Scanner input) {
        int soBoPhan;
        do {
            System.out.println("Xin mời chọn các bộ phận hiện có trong công ty: ");
            System.out.println(" 1. Web Designer");
            System.out.println(" 2. Front-End");
            System.out.println(" 3. Back-End");
            System.out.println(" 4. Marketing");
            System.out.println(" 0. Trở lại Menu chính");
            soBoPhan = input.nextInt();
            while (soBoPhan < 0 || soBoPhan > 4) {
                System.out.println("Bộ phận này hiện chưa có trong công ty !");
                System.out.print("Xin mời chọn các bộ phận hiện có trong công ty: ");
                soBoPhan = input.nextInt();
            }
            switch (soBoPhan) {
                case 1:
                    for (Staff theStaff : totalStaffs) {
                        if (theStaff.getBoPhanLamViec().equalsIgnoreCase("Web Designer")) {
                            theStaff.displayFullInformation();
                        }
                    }
                    break;

                case 2:
                    for (Staff theStaff : totalStaffs) {
                        if (theStaff.getBoPhanLamViec().equalsIgnoreCase("Front-End")
                                || theStaff.getBoPhanLamViec().equalsIgnoreCase("Front End")) {
                            theStaff.displayFullInformation();
                        }
                    }
                    break;
                case 3:
                    for (Staff theStaff : totalStaffs) {
                        if (theStaff.getBoPhanLamViec().equalsIgnoreCase("Back-End")
                                || theStaff.getBoPhanLamViec().equalsIgnoreCase("Back End")) {
                            theStaff.displayFullInformation();
                        }
                    }
                    break;
                case 4:
                    for (Staff theStaff : totalStaffs) {
                        if (theStaff.getBoPhanLamViec().equalsIgnoreCase("Marketing")) {
                            theStaff.displayFullInformation();
                        }
                    }
                    break;
                case 0:
                    break;
            }
        } while (soBoPhan != 0);
    }

    /**
     * Hàm addStaff () cho phép thêm thông tin nhân viên mới vào công ty
     * 
     * @param totalStaffs     là biến lưu trữ toàn bộ thông tin nhân viên hiện có
     *                        trong công ty
     * @param totaDepartments là biến lưu trữ toàn bộ thông tin các bộ phận hiện có
     *                        trong công ty
     * @param webDesigner     là biến lưu trữ thông tin bộ phận "Web Designer"
     * @param frontEnd        là biến lưu trữ thông tin bộ phận "Front-End"
     * @param backEnd         là biến lưu trữ thông tin bộ phận "Back-End"
     * @param marketing       là biến lưu trữ thông tin bộ phận "Marketing"
     * @param input           là biến cho phép người dùng nhập thông tin mới
     */
    public static void addStaff(ArrayList<Staff> totalStaffs, ArrayList<Department> totaDepartments,
            Department webDesigner, Department frontEnd, Department backEnd, Department marketing, Scanner input) {
        int loaiNhanVien = 0;
        do {
            System.out.println(" 1. Thêm nhân viên thông thường");
            System.out.println(" 2. Thêm nhân viên có cấp quản lý");
            System.out.println(" 0. Trở lại Menu chính");
            loaiNhanVien = input.nextInt();
            while (loaiNhanVien < 0 || loaiNhanVien > 2) {
                System.out.println("Vui lòng chọn đúng loại nhân viên ! ");
                loaiNhanVien = input.nextInt();
            }
            switch (loaiNhanVien) {
                case 1:
                    System.out.println("Chú ý: Bạn đang thêm nhân viên thông thường !");
                    System.out.print("Nhập mã nhân viên: ");
                    String idEmployee = input.next();
                    for (int i = 0; i < totalStaffs.size(); i++) {
                        while (idEmployee.equalsIgnoreCase(totalStaffs.get(i).getMaNhanVien())) {
                            System.out.println("Mã nhân viên không hợp lệ ! Lưu ý: Mã nhân viên không được trùng lặp.");
                            System.out.print("Hãy nhập lại mã nhân viên: ");
                            idEmployee = input.next();
                            i = 0;
                        }
                    }
                    System.out.print("Nhập tên nhân viên: ");
                    input.nextLine();
                    String nameEmployee = input.nextLine();
                    System.out.print("Nhập tuổi nhân viên: ");
                    int ageEmployee = input.nextInt();
                    while (ageEmployee < 0 || ageEmployee > 100) {
                        System.out.println("Bạn đã nhập sai tuổi !");
                        System.out.print("Nhập tuổi nhân viên: ");
                        ageEmployee = input.nextInt();
                    }
                    System.out.print("Nhập hệ số lương: ");
                    double heSoLuongEmployee = input.nextDouble();
                    while (heSoLuongEmployee < 0) {
                        System.out.println("Bạn đã nhập sai hệ số lương !");
                        System.out.print("Nhập hệ số lương: ");
                        heSoLuongEmployee = input.nextDouble();
                    }
                    System.out.print("Nhập ngày vào làm: ");
                    String dateStartWorkEmployee = input.next();
                    // cho phép người dùng chọn 1-4 bộ phận có sẵn
                    int newDepartmentEmployee;
                    String departmentEmployee = "";
                    do {
                        System.out.println("Nhập bộ phận làm việc : ");
                        System.out.println("1. Web Designer");
                        System.out.println("2. Front-End");
                        System.out.println("3. Back-End");
                        System.out.println("4. Marketing");
                        System.out.println("5. Thêm bộ phận mới !");
                        newDepartmentEmployee = input.nextInt();
                        switch (newDepartmentEmployee) {
                            case 1:
                                departmentEmployee = "Web Designer";
                                break;
                            case 2:
                                departmentEmployee = "Front-End";
                                break;
                            case 3:
                                departmentEmployee = "Back-End";
                                break;
                            case 4:
                                departmentEmployee = "Marketing";
                                break;
                            case 5:
                                System.out.print("Nhập tên bộ phận mới: ");
                                input.nextLine();
                                departmentEmployee = input.nextLine();
                                break;
                            default:
                                System.out.println("Invalid choice !");
                                break;
                        }
                    } while (newDepartmentEmployee < 1 || newDepartmentEmployee > 5);
                    System.out.print("Nhập số ngày nghỉ phép: ");
                    int soNgayNghiEmployee = input.nextInt();
                    while (soNgayNghiEmployee < 0) {
                        System.out.println("Bạn đã nhập sai số ngày nghỉ phép !");
                        System.out.print("Nhập số ngày nghỉ phép: ");
                        soNgayNghiEmployee = input.nextInt();
                    }
                    System.out.print("Nhập số giờ làm thêm: ");
                    double overtimeHoursEmployee = input.nextDouble();
                    while (overtimeHoursEmployee < 0) {
                        System.out.println("Hãy nhập một số không âm !");
                        System.out.println("Nhập số giờ làm thêm: ");
                        overtimeHoursEmployee = input.nextDouble();
                    }
                    Staff newEmployee = new Employee(idEmployee, nameEmployee, ageEmployee, heSoLuongEmployee,
                            dateStartWorkEmployee, departmentEmployee, soNgayNghiEmployee, overtimeHoursEmployee);
                    totalStaffs.add(newEmployee);
                    if (departmentEmployee.equalsIgnoreCase("Web Desiger")) {
                        webDesigner.setSoLuongNhanVien(webDesigner.getSoLuongNhanVien() + 1);
                    } else if (departmentEmployee.equalsIgnoreCase("Front-End")
                            || departmentEmployee.equalsIgnoreCase("Front End")) {
                        frontEnd.setSoLuongNhanVien(frontEnd.getSoLuongNhanVien() + 1);
                    } else if (departmentEmployee.equalsIgnoreCase("Back-End")
                            || departmentEmployee.equalsIgnoreCase("Back End")) {
                        backEnd.setSoLuongNhanVien(backEnd.getSoLuongNhanVien() + 1);
                    } else if (departmentEmployee.equalsIgnoreCase("Marketing")) {
                        marketing.setSoLuongNhanVien(marketing.getSoLuongNhanVien() + 1);
                    } else {
                        Department newDepartment1 = new Department("unknownId", departmentEmployee, 1);
                        totaDepartments.add(newDepartment1);
                    }
                    break;

                case 2:
                    System.out.println("Chú ý: Bạn đang thêm nhân viên có cấp quản lý !");
                    System.out.print("Nhập mã nhân viên: ");
                    String idManager = input.next();
                    for (int i = 0; i < totalStaffs.size(); i++) {
                        while (idManager.equalsIgnoreCase(totalStaffs.get(i).getMaNhanVien())) {
                            System.out.println("Mã nhân viên không hợp lệ ! Lưu ý: Mã nhân viên không được trùng lặp.");
                            System.out.print("Hãy nhập lại mã nhân viên: ");
                            idManager = input.next();
                            i = 0;
                        }
                    }
                    System.out.print("Nhập tên nhân viên: ");
                    input.nextLine();
                    String nameManager = input.nextLine();
                    System.out.print("Nhập tuổi nhân viên: ");
                    int ageManager = input.nextInt();
                    while (ageManager < 0 || ageManager > 100) {
                        System.out.println("Bạn đã nhập sai tuổi !");
                        System.out.print("Nhập tuổi nhân viên: ");
                        ageManager = input.nextInt();
                    }
                    System.out.print("Nhập hệ số lương: ");
                    double heSoLuongManager = input.nextDouble();
                    while (heSoLuongManager < 0) {
                        System.out.println("Bạn đã nhập sai hệ số lương !");
                        System.out.print("Nhập hệ số lương: ");
                        heSoLuongManager = input.nextDouble();
                    }
                    System.out.print("Nhập ngày vào làm: ");
                    String dateStartWorkManager = input.next();
                    // cho phép người dùng chọn bộ phận làm việc 1-4
                    int newDepartmentManager;
                    String departmentManager = "";
                    do {
                        System.out.println("Nhập bộ phận làm việc : ");
                        System.out.println("1. Web Designer");
                        System.out.println("2. Front-End");
                        System.out.println("3. Back-End");
                        System.out.println("4. Marketing");
                        System.out.println("5. Thêm bộ phận mới !");
                        newDepartmentManager = input.nextInt();
                        switch (newDepartmentManager) {
                            case 1:
                                departmentManager = "Web Designer";
                                break;
                            case 2:
                                departmentManager = "Front-End";
                                break;
                            case 3:
                                departmentManager = "Back-End";
                                break;
                            case 4:
                                departmentManager = "Marketing";
                                break;
                            case 5:
                                System.out.print("Nhập tên bộ phận mới: ");
                                input.nextLine();
                                departmentManager = input.nextLine();
                                break;
                            default:
                                System.out.println("Invalid choice !");
                                break;
                        }
                    } while (newDepartmentManager < 1 || newDepartmentManager > 5);
                    System.out.print("Nhập số ngày nghỉ phép: ");
                    int soNgayNghiManager = input.nextInt();
                    while (soNgayNghiManager < 0) {
                        System.out.println("Bạn đã nhập sai số ngày nghỉ phép !");
                        System.out.print("Nhập số ngày nghỉ phép: ");
                        soNgayNghiManager = input.nextInt();
                    }
                    System.out.print("Nhập chức vụ: ");
                    input.nextLine();
                    String positionManager = input.nextLine();
                    Staff newManager = new Manager(idManager, nameManager, ageManager, heSoLuongManager,
                            dateStartWorkManager, departmentManager, soNgayNghiManager, positionManager);
                    totalStaffs.add(newManager);
                    if (departmentManager.equalsIgnoreCase("Web Desiger")) {
                        webDesigner.setSoLuongNhanVien(webDesigner.getSoLuongNhanVien() + 1);
                    } else if (departmentManager.equalsIgnoreCase("Front-End")
                            || departmentManager.equalsIgnoreCase("Front End")) {
                        frontEnd.setSoLuongNhanVien(frontEnd.getSoLuongNhanVien() + 1);
                    } else if (departmentManager.equalsIgnoreCase("Back-End")
                            || departmentManager.equalsIgnoreCase("Back End")) {
                        backEnd.setSoLuongNhanVien(backEnd.getSoLuongNhanVien() + 1);
                    } else if (departmentManager.equalsIgnoreCase("Marketing")) {
                        marketing.setSoLuongNhanVien(marketing.getSoLuongNhanVien() + 1);
                    } else {
                        Department newDepartment2 = new Department("unknownId", departmentManager, 1);
                        totaDepartments.add(newDepartment2);
                    }
                    break;
                case 0:
                    break;
            }

        } while (loaiNhanVien != 0);

    }

    /**
     * Hàm findStaff () cho phép tìm kiếm và trả về thông tin nhân viên theo yêu cầu
     * 
     * @param totalStaffs là biến lưu trữ toàn bộ thông tin nhân viên hiện có trong
     *                    công ty
     * @param input       là biến dùng để người dùng nhập thông tin mới
     */
    public static void findStaff(ArrayList<Staff> totalStaffs, Scanner input) {
        int loaiThongTinNhanVien = 0;
        String thongTinDaTimThay = "";
        do {
            System.out.println(" 1. Tìm kiếm theo họ tên nhân viên");
            System.out.println(" 2. Tìm kiếm theo mã nhân viên");
            System.out.println(" 0. Trở lại Menu chính");
            loaiThongTinNhanVien = input.nextInt();
            while (loaiThongTinNhanVien < 0 || loaiThongTinNhanVien > 2) {
                System.out.println("Vui lòng chọn đúng loại thông tin nhân viên ! ");
                loaiThongTinNhanVien = input.nextInt();
            }
            switch (loaiThongTinNhanVien) {
                case 1:
                    thongTinDaTimThay = "";
                    System.out.print("Hãy nhập họ tên nhân viên: ");
                    input.nextLine();
                    String findName = input.nextLine();
                    for (int i = 0; i < totalStaffs.size(); i++) {
                        if (findName.equalsIgnoreCase(totalStaffs.get(i).getTenNhanVien())) {
                            thongTinDaTimThay += "Mã nhân viên: " + totalStaffs.get(i).getMaNhanVien() + "\n"
                                    + "Tên nhân viên: "
                                    + totalStaffs.get(i).getTenNhanVien() + "\n" + "Tuổi nhân viên: "
                                    + totalStaffs.get(i).getTuoiNhanVien()
                                    + "\n" + "Hệ số lương: " + totalStaffs.get(i).getHeSoLuong() + "\n"
                                    + "Ngày vào làm: "
                                    + totalStaffs.get(i).getNgayVaoLam() + "\n" + "Bộ phận làm việc: "
                                    + totalStaffs.get(i).getBoPhanLamViec()
                                    + "\n" + "Số ngày nghỉ phép: " + totalStaffs.get(i).getSoNgayNghiPhep() + "\n";
                            if (totalStaffs.get(i) instanceof Employee) {
                                thongTinDaTimThay += "Số giờ làm thêm: "
                                        + ((Employee) totalStaffs.get(i)).getSoGioLamThem()
                                        + "\n" + "Mức lương hiện tại: "
                                        + ((Employee) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }
                            if (totalStaffs.get(i) instanceof Manager) {
                                thongTinDaTimThay += "Chức vụ: " + ((Manager) totalStaffs.get(i)).getChucVu() + "\n"
                                        + "Mức lương hiện tại: " + ((Manager) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }

                        } else {
                            thongTinDaTimThay += "";
                        }
                    }
                    if (thongTinDaTimThay == "") {
                        System.out.println("Nhân viên này hiện không có trong công ty !");
                    } else {
                        System.out.print(thongTinDaTimThay);
                    }
                    break;

                case 2:
                    thongTinDaTimThay = "";
                    System.out.print("Hãy nhập mã nhân viên: ");
                    String findId = input.next();
                    for (int i = 0; i < totalStaffs.size(); i++) {
                        if (findId.equalsIgnoreCase(totalStaffs.get(i).getMaNhanVien())) {
                            thongTinDaTimThay += "Mã nhân viên: " + totalStaffs.get(i).getMaNhanVien()
                                    + "\n" + "Tên nhân viên: " + totalStaffs.get(i).getTenNhanVien() + "\n"
                                    + "Tuổi nhân viên: "
                                    + totalStaffs.get(i).getTuoiNhanVien() + "\n" + "Hệ số lương: "
                                    + totalStaffs.get(i).getHeSoLuong()
                                    + "\n" + "Ngày vào làm: " + totalStaffs.get(i).getNgayVaoLam() + "\n"
                                    + "Bộ phận làm việc: "
                                    + totalStaffs.get(i).getBoPhanLamViec() + "\n" + "Số ngày nghỉ phép: "
                                    + totalStaffs.get(i).getSoNgayNghiPhep() + "\n";
                            if (totalStaffs.get(i) instanceof Employee) {
                                thongTinDaTimThay += "Số giờ làm thêm: "
                                        + ((Employee) totalStaffs.get(i)).getSoGioLamThem()
                                        + "\n" + "Mức lương hiện tại: "
                                        + ((Employee) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }
                            if (totalStaffs.get(i) instanceof Manager) {
                                thongTinDaTimThay += "Chức vụ: " + ((Manager) totalStaffs.get(i)).getChucVu() + "\n"
                                        + "Mức lương hiện tại: " + ((Manager) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }
                        } else {
                            thongTinDaTimThay += "";
                        }
                    }
                    if (thongTinDaTimThay == "") {
                        System.out.println("Nhân viên này hiện không có trong công ty !");
                    } else {
                        System.out.print(thongTinDaTimThay);
                    }
                    break;
                case 0:
                    break;
            }
        } while (loaiThongTinNhanVien != 0);
    }

    /**
     * Hàm displayInformationDescendingSalary () hiển thị bảng lương nhân viên theo
     * thứ tự giảm dần
     * 
     * @param totalStaffs lưu trữ thông tin nhân viên hiện có trong công ty
     */
    public static void displayInformationDescendingSalary(ArrayList<Staff> totalStaffs) {
        Collections.sort(totalStaffs, Staff.salaryIsDescending); // Collections.sort(totalStaffs, comparator);
        for (Staff theStaff : totalStaffs) {
            theStaff.displaySalary();
        }
    }

    /**
     * Hàm displayInformationAscendingSalary () hiển thị bảng lương nhân viên theo
     * thứ tự tăng dần
     * 
     * @param totalStaffs lưu trữ thông tin nhân viên hiện có trong công ty
     */
    public static void displayInformationAscendingSalary(ArrayList<Staff> totalStaffs) {
        Collections.sort(totalStaffs, Staff.salaryIsAscending); // Collections.sort(totalStaffs, comparator);
        for (Staff theStaff : totalStaffs) {
            theStaff.displaySalary();
        }
    }
}
