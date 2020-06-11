<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
      <meta charset="UTF-8">
  </head>
  <body>

   <style type="text/css">
          table, th, td{
              border:1px solid #ccc;
          }
          table{
              border-collapse:collapse;
          }
          th, td{              text-align:left;
              padding:10px;
          }
          tr:hover{
              background-color:#ddd;
              cursor:pointer;
          }
      </style>


 <table border="1"  width="1000px"  bgcolor="#fffafa" style="margin-left:auto;margin-right: auto;margin-top: 10px;" >
     <tr>
         <th colspan="4" height="60px" style="color: black;font-size: 23px" bgcolor="#87cefa"  >
         Danh sách khách hàng
         </th>
     </tr>

     <tr bgcolor="#ddd"  height="49px" style="font-size: 20px" >
         <th >Tên</th>
         <th >Ngày sinh</th>
         <th>Địa chỉ</th>
         <th>Ảnh</th>
     </tr>

     <tr style="font-size: 18px" height="40px" >
         <td>Mai Văn Toàn</td>
         <td>1983-08-20</td>
         <td>Hà Nội</td>
         <td><img src="3.png" height="130px"></td>
     </tr>

     <tr style="font-size: 18px" height="40px" >
     <td>Lê Bảo Ngọc</td>
         <td>2000-12-31</td>
         <td>Nghệ An</td>
         <td><img src="4.png" height="130px"></td>
     </tr>

     <tr style="font-size: 18px" height="40px" >
         <td>Hồ Thị Tèo</td>
         <td>1992-03-25</td>
         <td>Vĩnh Phúc</td>
         <td><img src="5.png" height="130px"></td>
     </tr>

 </table>


  </body>
</html>
