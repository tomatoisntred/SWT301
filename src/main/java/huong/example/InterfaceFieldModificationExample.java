package huong.example;

// Không khai báo public để không bắt buộc tên file phải là AppConstants.java
class AppConstants {
    public static final int MAX_USERS = 100;

    private AppConstants() {
        // Ngăn không cho tạo instance
    }
}

// Lớp sử dụng hằng số
class AppConstantsExample {
    public static void main(String[] args) {
        System.out.println("Maximum allowed users: " + AppConstants.MAX_USERS);
    }
}
