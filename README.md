# finalTest_module2
Mô tả chương trình
Xây dựng ứng dụng quản lý sản phẩm (sử dụng List, File, xử lý ngoại lệ,… để thực hiện các
yêu cầu). 1 sản phẩm sẽ có các thuộc tính sau: mã sản phẩm, tên sản phẩm, giá, số lượng, mô
tả. Yêu cầu của chức năng gồm:
1. Quản lý thông tin của từng sản phẩm (các thao tác thêm, sửa, xoá)
2. Đọc/Ghi thông tin sản phẩm với File CSV
Menu chức năng được hiển thị khi mở chương trình:
● Lựa chọn “Xem danh sách” sẽ hiển thị tất cả sản phẩm hiện có ở yêu cầu (1)
● Lựa chọn “Thêm mới” sẽ thực hiện mở màn hình “Thêm mới sản phẩm” ở yêu cầu (2)
● Lựa chọn “Cập nhật” sẽ thực hiện mở màn hình “Cập nhật sản phẩm” ở yêu cầu (3)
● Lựa chọn “Xóa” sẽ thực hiện cảnh báo người dùng trước khi xóa sản phẩm đó (yêu
cầu 4). Nếu người dùng chấp nhận sẽ thực hiện xóa thông tin và tải lại danh sách.
● Lựa chọn “Sắp xếp” (yêu cầu 5). – Lựa chọn tìm kiếm sản phẩm có giá đắt nhất (yêu
cầu 6).
● Lựa chọn “Đọc từ file” sẽ thực hiện đọc danh sách sản phẩm từ file ở
yêu cầu (7)
● Lựa chọn “Ghi vào file” sẽ thực hiện ghi danh sách sản phẩm vào file ở yêu cầu (8)
Codegym | Advanced Programming with Java 2.0 | PractFinalExam 01
Cài đặt chức năng
1. Xây dựng chức năng cho phép người dùng xem danh sách sản phẩm hiện có và cho
phép người dùng “thêm”, “sửa”, “ xóa” các sản phẩm.
Thông tin cần hiển thị:
- Lựa chọn “Thêm mới”.
- Mã sản phẩm.
- Tên.
- Giá.
- Số lượng.
- Mô tả.
Yêu cầu:
- Hiển thị lần lượt 5 sản phẩm trong danh sách. Đợi người dùng nhấn phím enter để
hiển thị thông tin các mục tiếp theo (đến khi hết thì quay lại menu chính).
2. Xây dựng chức năng thêm một sản phẩm mới
Thông tin của sản phẩm:
- Mã sản phẩm.
- Tên.
- Giá.
- Số lượng.
- Mô tả.
Yêu cầu:
- Kiểm tra lỗi dữ liệu nhập vào trên dòng lệnh và thông báo cho người dùng khi ấn
phím enter. Yêu cầu kiểm tra các lỗi nhập dữ liệu sau:
✔ Các trường yêu cầu bắt buộc.
- Nếu dữ liệu hợp lệ sẽ thực hiện thêm dữ liệu vào bộ nhớ và thông báo kết quả cho
người dùng.
3. Xây dựng chức năng cho phép người dùng sửa thông tin một sản phẩm. Các bước
để người dùng thực hiện tính năng này như sau:
- Bước 1: Chọn “3. Cập nhật”
- Bước 2: Yêu cầu người dùng nhập vào mã sản phẩm cần sửa.
- Bước 3: Nếu tìm được sản phẩm tương ứng thì qua bước 4.
Ngược lại, hiển thị thông báo “Không tìm được sản phẩm với mã sản phẩm trên.” và
yêu cầu người dùng nhập lại. Nếu người dùng không nhập gì và nhấn Enter thì thoát
khỏi chức năng, quay về Menu.
- Bước 4: Yêu cầu người dùng nhập vào thông tin mới. Các thông tin cho phép sửa
gồm :
+ Mã sản phẩm.
+ Tên sản phẩm.
+ Giá.
+ Số lượng.
+ Mô tả.
Yêu cầu:
- Kiểm tra lỗi dữ liệu nhập vào trên dòng lệnh và thông báo cho người dùng khi ấn
phím enter. Yêu cầu kiểm tra các lỗi nhập dữ liệu sau:
✔ Các trường yêu cầu bắt buộc.
- Nếu dữ liệu hợp lệ sẽ thực hiện cập nhật dữ liệu vào bộ nhớ và thông báo kết quả
cho người dùng.
4. Xây dựng chức năng xoá một sản phẩm. Các bước để người dùng thực hiện tính
năng này như sau:
- Bước 1: Chọn “4. Xoá”
- Bước 2: Yêu cầu người dùng nhập vào mã sản phẩm muốn xoá. - Bước 3:
Nếu tìm được sản phẩm có mã sản phẩm tương ứng thì qua bước 4.
Ngược lại, hiển thị thông báo “Không tìm được sản phẩm với mã sản phẩm trên.”
và yêu cầu người dùng nhập lại. Nếu người dùng không nhập gì và nhấn Enter thì
thoát khỏi chức năng, quay về Menu.
- Bước 4: Yêu cầu người dùng xác nhận muốn xoá thông tin sản phẩm. Nếu người
dùng nhập “Y” thì xoá khỏi bộ nhớ. Nếu người dùng nhập ký tự khác thì thoát khỏi
chương trình và quay về Menu.
5. Xây dựng chức năng sắp xếp
- Bước 1: Chọn “5. Sắp xếp”
- Bước 2: Màn hình sẽ hiển thị ra giao diện chọn sắp xếp sản phẩm theo giá tăng dần.
- Bước 3: Người dùng sẽ chọn 1 hoặc 2 để hiển thị danh sách sản phẩm sau khi sắp
xếp và lựa chọn 3 để quay về giao diện menu chính.
6. Xây dựng chức năng tìm kiếm sản phẩm giá đắt nhất
- Bước 1: Chọn “6. Tìm kiếm sản phẩm có giá đắt nhất”
- Bước 2: Màn hình sẽ hiển thị ra sản phẩm có giá đắt nhất.
7. Xây dựng chức năng đọc danh sách sản phẩm từ file CSV
Hãy xây dựng tính năng đọc danh sách sản phẩm từ file csv có sẵn. Đường dẫn
mặc định là “data/products.csv”.
Lựa chọn “Đọc từ File” sẽ thực hiện cảnh báo người dùng trước khi cập nhật bộ nhớ (xoá
toàn bộ danh sách sản phẩm đang có trong bộ nhớ). Nếu người dùng chấp nhận sẽ thực hiện
cập nhật lại toàn bộ bộ nhớ danh sách sản phẩm từ file.
(Tải file mẫu tại đường link sau: https://github.com/codegym-vn/csv-example )
Codegym | Advanced Programming with Java 2.0 | PractFinalExam 01
Hướng dẫn: CSV (Comma Separated Values) là một loại định dạng văn bản đơn giản mà
trong đó, các giá trị được ngăn cách với nhau bằng dấu phẩy. Một văn bản CSV gồm nhiều
dòng chứa các giá trị và các dấu phẩy. Dòng đầu tiên của văn bản CSV chứa tên của từng
cột, mỗi cột được xác định bằng 2 dấu phẩy (trừ cột đầu tiên và cuối cùng). Tất cả những
dòng sau đó đều có cấu trúc tương tự, chứa các giá trị tương ứng của từng cột. Và mỗi dòng
của văn bản là một dòng giá trị khác nhau trên bảng tính. (Tham khảo file mẫu để rõ hơn về
nội dung của một file CSV).
8. Xây dựng chức năng lưu danh sách sản phẩm vào file CSV
Xây dựng tính năng cho phép người dùng ghi các mục danh sách sản phẩm đang có trong bộ
nhớ vào file với đường dẫn mặc định là “data/products.csv”.
Lựa chọn “Lưu vào File” sẽ thực hiện cảnh báo người dùng trước khi cập nhật file danh
sách sản phẩm. Nếu người dùng chấp nhận sẽ thực hiện cập nhật lại toàn bộ nội dung file. 
