drop database if exists casestudy_database;
create database casestudy_database;
use casestudy_database;

CREATE TABLE vi_tri (
  id_vi_tri int NOT NULL AUTO_INCREMENT,
  ten_vi_tri varchar(30) NOT NULL,
  PRIMARY KEY (id_vi_tri),
  UNIQUE KEY id_vi_tri (id_vi_tri)
) ;
CREATE TABLE bo_phan (
  id_bo_phan int NOT NULL AUTO_INCREMENT,
  ten_bo_phan varchar(30) NOT NULL,
  PRIMARY KEY (id_bo_phan),
  UNIQUE KEY id_bo_phan (id_bo_phan)

);
CREATE TABLE trinh_do (
  id_trinh_do int NOT NULL AUTO_INCREMENT,
  ten_trinh_do varchar(30) NOT NULL,
  PRIMARY KEY (id_trinh_do),
  UNIQUE KEY id_trinh_do (id_trinh_do)
) ;
CREATE TABLE dich_vu_di_kem (
  id_dich_vu_di_kem int NOT NULL AUTO_INCREMENT primary key,
  ten_dich_vu_di_kem varchar(50) NOT NULL,
  gia int NOT NULL,
  don_vi int NOT NULL,
  trang_thai_kha_dung varchar(30) NOT NULL,
  UNIQUE KEY id_dich_vu_di_kem (id_dich_vu_di_kem)
) ;
CREATE TABLE kieu_thue (
  id_kieu_thue int NOT NULL AUTO_INCREMENT,
  ten_kieu_thue varchar(30) NOT NULL,
  gia int NOT NULL,
  PRIMARY KEY (id_kieu_thue),
  UNIQUE KEY id_kieu_thue (id_kieu_thue)
) ;

CREATE TABLE loai_dich_vu (
  id_loai_dich_vu int NOT NULL AUTO_INCREMENT,
  ten_loai_dich_vu varchar(45) NOT NULL,
  PRIMARY KEY (id_loai_dich_vu),
  UNIQUE KEY id_loai_dich_vu (id_loai_dich_vu)
) ;

CREATE TABLE loai_khach (
  id_loai_khach int NOT NULL AUTO_INCREMENT,
  ten_loai_khach varchar(30) NOT NULL,
  PRIMARY KEY (id_loai_khach),
  UNIQUE KEY id_loai_khach (id_loai_khach)
) ;

CREATE TABLE dich_vu (
  id_dich_vu int NOT NULL AUTO_INCREMENT,
  ten_dich_vu varchar(30) NOT NULL,
  dien_tich int NOT NULL,
  so_tang int NOT NULL,
  so_nguoi_toi_da varchar(30) NOT NULL,
  chi_phi_thue varchar(30) NOT NULL,
  id_kieu_thue int NOT NULL,
  id_loai_dich_vu int NOT NULL,
  trang_thai varchar(30) NOT NULL,
  PRIMARY KEY (id_dich_vu),
  UNIQUE KEY id_dich_vu (id_dich_vu),
  KEY id_kieu_thue (id_kieu_thue),
  KEY id_loai_dich_vu (id_loai_dich_vu),
  CONSTRAINT dich_vu_ibfk_1 FOREIGN KEY (id_kieu_thue) REFERENCES kieu_thue (id_kieu_thue) on delete cascade,
  CONSTRAINT dich_vu_ibfk_2 FOREIGN KEY (id_loai_dich_vu) REFERENCES loai_dich_vu (id_loai_dich_vu)
    on delete cascade
) ;

CREATE TABLE nhan_vien (
  id_nhan_vien int NOT NULL AUTO_INCREMENT,
  ho_ten_nhan_vien varchar(30) NOT NULL,
  id_vi_tri int NOT NULL,
  id_trinh_do int NOT NULL,
  id_bo_phan int NOT NULL,
  ngay_sinh_nhan_vien date NOT NULL,
  so_CMND_nhan_vien varchar(20) NOT NULL,
  luong_nhan_vien varchar(30) NOT NULL,
  SDT_nhan_vien varchar(30) NOT NULL,
  email_nhan_vien varchar(30) NOT NULL,
  dia_chi_nhan_vien varchar(30) NOT NULL,
  PRIMARY KEY (id_nhan_vien),
  UNIQUE KEY id_nhan_vien (id_nhan_vien),
  UNIQUE KEY id_vi_tri (id_vi_tri),
  UNIQUE KEY id_trinh_do (id_trinh_do),
  UNIQUE KEY id_bo_phan (id_bo_phan),
  CONSTRAINT nhan_vien_ibfk_1 FOREIGN KEY (id_vi_tri) REFERENCES vi_tri (id_vi_tri) on delete cascade,
  CONSTRAINT nhan_vien_ibfk_2 FOREIGN KEY (id_trinh_do) REFERENCES trinh_do (id_trinh_do) on delete cascade,
  CONSTRAINT nhan_vien_ibfk_3 FOREIGN KEY (id_bo_phan) REFERENCES bo_phan (id_bo_phan) on delete cascade
) ;

CREATE TABLE khach_hang (
  id_khach_hang int NOT NULL AUTO_INCREMENT,
  id_loai_khach int NOT NULL,
  ho_ten_khach_hang nvarchar(30) NOT NULL,
  ngay_sinh_khach_hang date NOT NULL,
  so_CMND_khach_hang varchar(30) NOT NULL,
  SDT_khach_hang varchar(30) NOT NULL,
  email_khach_hang varchar(30) NOT NULL,
  dia_chi_khach_hang varchar(30) NOT NULL,
  PRIMARY KEY (id_khach_hang),
  UNIQUE KEY id_khach_hang (id_khach_hang),
  UNIQUE KEY id_loai_khach (id_loai_khach),
  CONSTRAINT khach_hang_ibfk_1 FOREIGN KEY (id_loai_khach) REFERENCES loai_khach (id_loai_khach) on delete cascade
) ;

CREATE TABLE hop_dong (
  id_hop_dong int NOT NULL AUTO_INCREMENT,
  id_nhan_vien int NOT NULL,
  id_khach_hang int NOT NULL,
  id_dich_vu int NOT NULL,
  ngay_lam_hop_dong date NOT NULL,
  ngay_ket_thuc date NOT NULL,
  tien_dat_coc int NOT NULL,
  tong_tien int NOT NULL,
  PRIMARY KEY (id_hop_dong),
  UNIQUE KEY id_hop_dong (id_hop_dong),
  UNIQUE KEY id_nhan_vien (id_nhan_vien),
  UNIQUE KEY id_khach_hang (id_khach_hang),
  UNIQUE KEY id_dich_vu (id_dich_vu),
  CONSTRAINT hop_dong_ibfk_1 FOREIGN KEY (id_nhan_vien) REFERENCES nhan_vien (id_nhan_vien) on delete cascade,
  CONSTRAINT hop_dong_ibfk_2 FOREIGN KEY (id_khach_hang) REFERENCES khach_hang (id_khach_hang) on delete cascade,
  CONSTRAINT hop_dong_ibfk_3 FOREIGN KEY (id_dich_vu) REFERENCES dich_vu (id_dich_vu) on delete cascade
) ;
CREATE TABLE hop_dong_chi_tiet (
  id_hop_dong_chi_tiet int NOT NULL AUTO_INCREMENT,
  id_hop_dong int NOT NULL,
  id_dich_vu_di_kem int NOT NULL,
  so_luong int NOT NULL,
  PRIMARY KEY (id_hop_dong_chi_tiet),
  UNIQUE KEY id_hop_dong_chi_tiet (id_hop_dong_chi_tiet),
  UNIQUE KEY id_hop_dong (id_hop_dong),
  UNIQUE KEY id_dich_vu_di_kem (id_dich_vu_di_kem),
  CONSTRAINT hop_dong_chi_tiet_ibfk_1 FOREIGN KEY (id_hop_dong) REFERENCES hop_dong (id_hop_dong) on delete cascade,
  CONSTRAINT hop_dong_chi_tiet_ibfk_2 FOREIGN KEY (id_dich_vu_di_kem) REFERENCES dich_vu_di_kem (id_dich_vu_di_kem) on delete cascade
);

-- task 1
-- 1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.

INSERT INTO bo_phan VALUES (1,'bán hàng'),(2,'quản lý'),(3,'bán hàng'),(4,'quản lý'),(5,'quản lý'),(6,'bán hàng'),(7,'bán hàng'),(8,'bảo vệ');
INSERT INTO vi_tri VALUES (1,'nhân viên bán hàng'),(2,'giám đốc'),(3,'nhân viên bán hàng'),(4,'giám đốc'),(5,'bảo vệ'),(6,'lao công');
INSERT INTO trinh_do VALUES (1,'đại học'),(2,'cao đẳng'),(3,'đại học'),(4,'cao đẳng'),(5,'thạc sĩ'),(6,'trung cấp');
INSERT INTO dich_vu_di_kem VALUES (1,'massage',1,1000,'trạng thái không biết'),(2,'karaoke',2,1000,'trạng thái không biết'),(3,'thức ăn',3,1000,'trạng thái không biết'),(4,'nước uống',4,1000,'trạng thái không biết'),(5,'thuê xe di chuyển tham quan resort',5,1000,'trạng thái không biết'),(6,'nothing',6,1000,'trạng thái không biết');
INSERT INTO kieu_thue VALUES (1,'thuê theo năm',3650),(2,'thuê theo tháng',300),(3,'thuê theo ngày',10),(4,'thuê theo giờ',1),(5,'thuê theo  phút',32),(6,'thuê theo giaay',34);
INSERT INTO loai_dich_vu VALUES (1,'Villa'),(2,'House'),(3,'Room'),(4,'Nhà nghỉ'),(5,'Khách sạn'),(6,'Hotel');
INSERT INTO loai_khach VALUES (1,'Diamond'),(2,'Platinium'),(3,'Silver'),(4,'Diamond'),(5,'Platium'),(6,'gold'),(7,'Diamond');
INSERT INTO dich_vu VALUES (1,'dịch vụ 1',10,5,'1','1',1,1,'trống'),(2,'dịch vụ 2',20,10,'2','2',2,2,'trống'),(3,'dịach vụ 3',30,15,'3','3',3,3,'trống'),(4,'dịch vụ 4',40,4,'4','4',4,4,'trống'),(5,'dịch vụ 5',50,7,'5','5',5,5,'trống'),(6,'dịch vụ 6',60,9,'6','6',6,6,'trống');
INSERT INTO nhan_vien VALUES (1,'Nguyen Văn Tèo',1,1,1,'1990-10-10','123456789','10000000','123456789','nguyenvana@gmail.com','da nang'),(2,'Hò Văn Tèo',2,2,2,'1995-10-10','123456789','10000000','123456789','nguyenvanb@gmail.com','da nang'),(3,'Đỗ Văn Tí',3,3,3,'1985-10-10','123456789','10000000','123456789','nguyenvanc@gmail.com','vinh'),(4,'Bùi Công Thành',4,4,4,'1992-10-10','123456789','10000000','123456789','nguyenvand@gmail.com','quang ngai'),(5,'Khổng thi lệ',5,5,5,'1990-10-10','123123123','20000000','123456789','nguyenvane@gmail.com','da nang'),(6,'Pham Công Minh',6,6,6,'1981-10-10','123123123','22222222','123455454','nguyenvanh@gmail.com','Quang Tri');
INSERT INTO khach_hang VALUES (1,1,'Nguyễn Anh Đức','2000-09-09','123456781','123456781','hovanquoca@gmail.com','Đà nẵng'),(2,2,'Trần Ngọc Tân','1999-11-10','123456721','123456782','hovanquocb@gmail.com','Quảng trị'),(3,3,'Nguyễn Đức Thông','2000-11-10','123456783','123456783','hovanquocv@gmail.com','da nang'),(4,4,'Lê Đình Quốc','1990-11-10','123456784','123456784','hovan@gmail.com','Quảng trị'),(5,5,'Nguyễn Anh Đức','1991-11-10','123456785','123456785','hovanquocd@gmail.com','trần cao vân việt nam'),(6,6,'Dao Xuân Luộc','1994-11-10','123123123','123232321','dãouanloc@gmail.com','đồng nai');
INSERT INTO hop_dong VALUES (1,1,1,1,'2018-10-09','2018-03-12',10,1000),(2,2,2,2,'2019-01-12','2019-04-12',22,1001),(3,3,3,3,'2020-03-1','2019-02-12',23,2000),(4,4,4,4,'2019-09-12','2019-09-09',99,3000),(5,5,5,5,'2019-03-12','2019-04-18',34,3333),(6,6,6,6,'2014-03-12','2015-02-02',44,4444);
INSERT INTO hop_dong_chi_tiet VALUES (1,1,1,2),(2,2,2,4),(3,3,3,2),(4,4,4,3),(5,5,5,4),(6,6,6,6);


--  task 2
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from nhan_vien
where ho_ten_nhan_vien  like "H%" or ho_ten_nhan_vien like "K%" or ho_ten_nhan_vien like "T%" and length(ho_ten_nhan_vien)<=15;

-- task 3
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
where  (year(now())- year(khach_hang.ngay_sinh_khach_hang))>18
	and (year(now())- year(khach_hang.ngay_sinh_khach_hang))<50
    and dia_chi_khach_hang in ("Đà nẵng","Quảng trị");

-- task 4
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của 
--      khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
SELECT 
    khach_hang.ho_ten_khach_hang,
    count(hop_dong.id_hop_dong) AS so_lan_dat_phong,
    loai_khach.ten_loai_khach
FROM
		khach_hang
        INNER JOIN hop_dong 
		ON (khach_hang.id_khach_hang = hop_dong.id_khach_hang)
        INNER JOIN loai_khach
		ON (khach_hang.id_loai_khach = loai_khach.id_loai_khach)
WHERE
    loai_khach.ten_loai_khach = 'Diamond'
GROUP BY khach_hang.id_khach_hang
ORDER BY so_lan_dat_phong;         

-- task5
-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khach_hang.id_khach_hang, 
		khach_hang.ho_ten_khach_hang, 
        loai_khach.ten_loai_khach, 
        hop_dong.id_hop_dong, 
        dich_vu.ten_dich_vu,
		hop_dong.ngay_lam_hop_dong, 
        hop_dong.ngay_ket_thuc ,	
        sum(dich_vu.chi_phi_thue+dich_vu_di_kem.gia*hop_dong_chi_tiet.so_luong) as "Tong tien"
from khach_hang
	left join hop_dong
		on (khach_hang.id_khach_hang=hop_dong.id_khach_hang)
     left join dich_vu
		on(hop_dong.id_dich_vu=dich_vu.id_dich_vu)
     left join hop_dong_chi_tiet	
		on(hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong)
    left join  dich_vu_di_kem
		on(hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem)
    left join loai_khach
		on(khach_hang.id_loai_khach=khach_hang.id_loai_khach)
 group by  hop_dong.id_hop_dong;      

-- task 6
-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ 
-- chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select dich_vu.id_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.dien_tich,
dich_vu.chi_phi_thue,
loai_dich_vu.ten_loai_dich_vu,
hop_dong.ngay_lam_hop_dong
from dich_vu 
	join loai_dich_vu on (dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu)
    join hop_dong on (hop_dong.id_dich_vu=dich_vu.id_dich_vu)
where  hop_dong.ngay_lam_hop_dong  < "2019-01-01" or hop_dong.ngay_lam_hop_dong >"2019-03-31";

-- task7
-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ 
-- đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dich_vu.id_dich_vu,
		dich_vu.ten_dich_vu,
        dich_vu.dien_tich,
        dich_vu.chi_phi_thue,
        loai_dich_vu.ten_loai_dich_vu
from dich_vu
			join loai_dich_vu on (dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu)
where   exists (
				select hop_dong.id_dich_vu
				from hop_dong
				where hop_dong.ngay_lam_hop_dong between "2018-01-01" and "2018-12-31"
				AND hop_dong.id_dich_vu = dich_vu.id_dich_vu)
		and not exists(	
                select hop_dong.id_dich_vu
				from hop_dong
				where hop_dong.ngay_lam_hop_dong between "2019-01-01" and "2019-12-31"
				AND hop_dong.id_dich_vu = dich_vu.id_dich_vu);
          
-- task 8
-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
--     Cach 1 : distinct
select DISTINCT khach_hang.ho_ten_khach_hang from khach_hang;
--    cach 2: ground by
select  khach_hang.ho_ten_khach_hang from khach_hang
group by khach_hang.ho_ten_khach_hang;
--   cach 3: union
select  khach_hang.ho_ten_khach_hang from khach_hang
union 
select  khach_hang.ho_ten_khach_hang from khach_hang;

-- task 9
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
-- hien thi nhung thang co khach
SELECT 
    MONTH(ngay_lam_hop_dong) AS Thang,
    COUNT(MONTH(ngay_lam_hop_dong)) AS So_luong_hop_dong,
    ngay_lam_hop_dong AS Ngay_lam_hop_dong
FROM
    hop_dong
WHERE
    YEAR(ngay_lam_hop_dong) = 2019 
GROUP BY Thang
ORDER BY Thang;

-- Hiện thị cả những tháng không có khách 
drop table if exists Temp;
create temporary table Temp
select 1 as Month
union
select 2 as Month
union
select 3 as Month
union
select 4 as Month
union
select 5 as Month
union
select 6 as Month
union
select 7 as Month
union
select 8 as Month
union
select 9 as Month
union
select 10 as Month
union
select 11 as Month
union
select 12 as Month;
Select Month as Thang, count(month(ngay_lam_hop_dong)) as So_Lan_Dat,ngay_lam_hop_dong
From Temp
Left join hop_dong on month(ngay_lam_hop_dong) = Month
and year(ngay_lam_hop_dong) = 2019
group by Month
order by Month;


-- Task 10
-- 	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm 
-- IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).

SELECT 
    hop_dong.id_hop_dong,
    ngay_lam_hop_dong,
    ngay_ket_thuc,
    tien_dat_coc,
    COUNT(hop_dong_chi_tiet.id_dich_vu_di_kem) AS Số_lượng_dịch_vụ_đi_kèm
FROM
    hop_dong,
    hop_dong_chi_tiet
WHERE
    hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
GROUP BY hop_dong.id_hop_dong; 

-- task 11
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
--      và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select dich_vu.ten_dich_vu ,
		dich_vu_di_kem.ten_dich_vu_di_kem,
        dich_vu_di_kem.gia,
        dich_vu_di_kem.don_vi,
        khach_hang.dia_chi_khach_hang,
        loai_khach.ten_loai_khach
from dich_vu
		join hop_dong on(hop_dong.id_dich_vu=dich_vu.id_dich_vu)
        join hop_dong_chi_tiet on(hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong)
        join dich_vu_di_kem on (hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem)
        join khach_hang on (khach_hang.id_khach_hang=hop_dong.id_khach_hang)
        join loai_khach on (khach_hang.id_loai_khach=loai_khach.id_loai_khach)
Where khach_hang.dia_chi_khach_hang in ("Quảng Trị", "Vinh")    and      loai_khach.ten_loai_khach ="diamond";
        
 --    task 12
--  12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem
--  (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019
--  nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
	select hop_dong.id_hop_dong,
			nhan_vien.ho_ten_nhan_vien,
            khach_hang.ho_ten_khach_hang,
            khach_hang.SDT_khach_hang,
            dich_vu.ten_dich_vu,
            hop_dong_chi_tiet.so_luong as so_luong_dich_vu_di_kem,
            hop_dong.tien_dat_coc ,
            hop_dong.ngay_lam_hop_dong as ngay_dat_coc
  from hop_dong
		join dich_vu on(hop_dong.id_dich_vu=dich_vu.id_dich_vu)
        join hop_dong_chi_tiet on(hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong)
        join dich_vu_di_kem on (hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem)
        join khach_hang on (khach_hang.id_khach_hang=hop_dong.id_khach_hang)
        join nhan_vien on (nhan_vien.id_nhan_vien=hop_dong.id_nhan_vien)  
  where not exists(select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-06-31')
  and exists(select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between '2019-09-01' and '2019-12-31');
            
-- task 13
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được 
-- sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

	select dich_vu_di_kem.* ,count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
    from dich_vu_di_kem 
    left join hop_dong_chi_tiet on (hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem)
	group by dich_vu_di_kem.id_dich_vu_di_kem
    order by so_lan_su_dung desc;
   

-- task 14
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm 
-- IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

	select dich_vu_di_kem.* ,count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
    from dich_vu_di_kem 
    left join hop_dong_chi_tiet on (hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem)
	WHERE
    dich_vu_di_kem.id_dich_vu_di_kem IN (SELECT 
            id_dich_vu_di_kem
        FROM
            hop_dong_chi_tiet
        GROUP BY id_dich_vu_di_kem
        HAVING COUNT(id_dich_vu_di_kem) = 1)
     group by    dich_vu_di_kem.id_dich_vu_di_kem;
     
-- task15
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 
-- 3 hợp đồng từ năm 2018 đến 2019.
SELECT 
    nhan_vien.id_nhan_vien,
    nhan_vien.ho_ten_nhan_vien,
    bo_phan.ten_bo_phan,
    nhan_vien.SDT_nhan_vien,
    nhan_vien.dia_chi_nhan_vien,
    COUNT(hop_dong.id_nhan_vien) AS so_lan_lap_hop_dong
FROM
    nhan_vien
        INNER JOIN
    bo_phan ON nhan_vien.id_bo_phan = bo_phan.id_bo_phan
        INNER JOIN
    trinh_do ON nhan_vien.id_trinh_do = trinh_do.id_trinh_do
        INNER JOIN
    hop_dong ON hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
WHERE
    hop_dong.ngay_lam_hop_dong BETWEEN '2018-01-01' AND '2019-12-31'
GROUP BY nhan_vien.ho_ten_nhan_vien
HAVING so_lan_lap_hop_dong < 4;

-- task 16
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

SET SQL_SAFE_UPDATES = 0;
delete from nhan_vien
 where not exists (select 
	nhan_vien.id_nhan_vien
    from hop_dong
    where hop_dong.ngay_lam_hop_dong between "2017-01-01" and "2019-12-31"
    and nhan_vien.id_nhan_vien=hop_dong.id_hop_dong
    );
SET SQL_SAFE_UPDATES = 1;
select nhan_vien.* from nhan_vien;    
  
--   task 17
--   17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với 
--   tổng Tiền thanh toán trong năm 2019 là lớn hơn 2000

SET SQL_SAFE_UPDATES = 0;
update loai_khach 
set ten_loai_khach= "Diamond" 
where ten_loai_khach= "Platium" and exists(
	select hop_dong.id_khach_hang
    from hop_dong
	where hop_dong.tong_tien >2000 and year(hop_dong.ngay_lam_hop_dong)=2019
);
SET SQL_SAFE_UPDATES = 1;

select	khach_hang.id_khach_hang,
		khach_hang.ho_ten_khach_hang,
		hop_dong.ngay_lam_hop_dong,
        hop_dong.tong_tien,
        loai_khach.ten_loai_khach
from hop_dong
		 right  join khach_hang on (hop_dong.id_khach_hang=khach_hang.id_khach_hang)
         right join loai_khach on (loai_khach.id_loai_khach=khach_hang.id_loai_khach)
where loai_khach.ten_loai_khach= "Diamond";
-- xoa nhan vien xoa luon khach hang roi :(

-- Task 18        
-- Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).
SET SQL_SAFE_UPDATES=0; 
DELETE khach_hang,hop_dong,hop_dong_chi_tiet FROM khach_hang inner join hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
where not exists(
select hop_dong.id_hop_dong where year(hop_dong.ngay_lam_hop_dong)>'2016') and khach_hang.id_khach_hang = hop_dong.id_khach_hang;
 SET SQL_SAFE_UPDATES=1; 

-- Hiển Thị khách hang có hợp đồng sau 2016
SELECT 
    khach_hang.ho_ten_khach_hang,
    YEAR(hop_dong.ngay_lam_hop_dong) AS Nam_Lam_Hop_Dong
FROM
    khach_hang
        JOIN
    hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang;


-- Task 19
-- Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
SET SQL_SAFE_UPDATES=0; 
 update dich_vu_di_kem set gia=gia*2
 where
 id_dich_vu_di_kem in
 (select id_dich_vu_di_kem
 from (hop_dong hd join hop_dong_chi_tiet hdct on hd.id_hop_dong=hdct.id_hop_dong)
 where year(hd.ngay_lam_hop_dong)=2019 
 group by id_dich_vu_di_kem
 having count(hdct.id_dich_vu_di_kem)>2);
 SET SQL_SAFE_UPDATES=1;  
 
-- task 20 
-- Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select   ho_ten_nhan_vien, email_nhan_vien, SDT_nhan_vien, ngay_sinh_nhan_vien, dia_chi_nhan_vien,
 ho_ten_khach_hang, email_khach_hang, SDT_khach_hang, ngay_sinh_khach_hang, dia_chi_khach_hang
from   nhan_vien
join hop_dong on (hop_dong.id_nhan_vien=nhan_vien.id_nhan_vien)
join khach_hang on(hop_dong.id_khach_hang=khach_hang.id_khach_hang)





    


