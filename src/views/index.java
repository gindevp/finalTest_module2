package views;

import cotroller.DAOManager;
import model.Product;
import storage.CSV;

import java.util.*;

public class index {
    static String pathFile = "src/storage/product.dat";
    static final int DETAIL = 1;
    static final int ADD = 2;
    static final int EDIT = 3;
    static final int REMOVE = 4;
    static final int SORT = 5;
    static final int SEARCHMAX = 6;
    static final int READ = 7;
    static final int WRITE = 8;
    static final int EXIT = 9;
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
    static List productList = new CSV().readFile(pathFile);

    public static void menu() {
        System.out.println("---------Chương trình quản lý sản phẩm-----------\n1. Xem danh sách\n2. Thêm mới\n3. Cập nhật\n4. Xóa \n5. Sắp xếp\n6. Tìm sản phẩm có giá thấp nhất\n7. ĐỌc File\n8. Ghi file\n9. Thoát\nChọn chức năng:");
    }

    public static void detail(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index:" + i + " " + list.get(i));
        }
    }

    public static void main(String[] args) {
        detail(new CSV().readFile(pathFile));
        menu();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case DETAIL:
                    detail(productList);
                    break;
                case ADD:
                    add(productList);
                    menu();
                    break;
                case EDIT:
                    edit(productList);
                    break;
                case REMOVE:
                    remove(productList);
                    break;
                case SORT:
                    sort(productList);
                    break;
                case SEARCHMAX:
                    search(productList);
                    break;
                case READ:
                    productList = new CSV().readFile(pathFile);
                    break;
                case WRITE:
                    new CSV().writeFile(productList, pathFile);
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại:");
            }
        }
    }

    private static void sort(List<Product> list) {
        list.sort(Comparator.comparingDouble(Product::getCost));
        detail(list);
    }

    private static void search(List<Product> list) {
        System.out.println("Mời nhập id sản phẩm: ");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                System.out.println("Tìm thấy :" + list.get(i));
            }
        }
    }

    private static void add(List list) {
        try {
            System.out.println("Mời nhập id sản phẩm:");
            String id = scanner1.nextLine();
            System.out.println("Mời nhập tên sản phẩm:");
            String name = scanner1.nextLine();
            System.out.println("Mời nhập giá sản phẩm:");
            int cost = scanner.nextInt();
            System.out.println("Mời nhập số lượng sản phẩm:");
            int amount = scanner.nextInt();
            System.out.println("Mời nhập chi tiết sản phẩm:");
            String detail = scanner1.nextLine();
            new DAOManager().add(list, new Product(id, name, cost, amount, detail));
        } catch (InputMismatchException e) {
            System.out.println("Nhập sai kiểu dữ liệu:");
        }


    }

    private static void edit(List list) {
        try {
            System.out.println("Mời nhập index cần sửa:");
            int index = scanner.nextInt();
            System.out.println("Mời nhập id sản phẩm:");
            String id = scanner1.nextLine();
            System.out.println("Mời nhập tên sản phẩm:");
            String name = scanner1.nextLine();
            System.out.println("Mời nhập giá sản phẩm:");
            int cost = scanner.nextInt();
            System.out.println("Mời nhập số lượng sản phẩm:");
            int amount = scanner.nextInt();
            System.out.println("Mời nhập chi tiết sản phẩm:");
            String detail = scanner1.nextLine();
            new DAOManager().edit(index, list, new Product(id, name, cost, amount, detail));
        }catch (InputMismatchException e){
            System.out.println("Nhập sai kiểu dữ liệu");
        }


    }

    private static void remove(List list) {
        System.out.println("Mời nhập index cần xóa:");
        int index = scanner.nextInt();
        new DAOManager().remove(index, list);
    }

}
