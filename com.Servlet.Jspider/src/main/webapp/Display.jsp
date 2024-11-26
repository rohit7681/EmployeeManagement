<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.ty.Employee.Service.EmployeeService" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="">
/* styles.css */
body {
    font-family: Arial, sans-serif;
    margin: 20px;
    background-color: #f9f9f9;
}

.table-container {
    max-width: 1000px;
    margin: 0 auto;
    padding: 20px;
    background-color: white;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
    border-radius: 8px;
}

h1 {
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}

table {
    width: 100%;
    border-collapse: collapse;
    margin: 0 auto;
}

thead tr {
    background-color: #4CAF50;
    color: white;
}

th, td {
    text-align: left;
    padding: 12px;
    border: 1px solid #ddd;
}

tr:nth-child(even) {
    background-color: #f2f2f2;
}

tr:hover {
    background-color: #ddd;
}

th {
    text-transform: uppercase;
}
.one{
 display:flex;
 gap:4px;
 padding:4px;
}
.btn1{
background-color:blue;
color:white;
}
.btn2{
background-color:#f78181;
color:white;
}
button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
  margin: 8px 4px;
  border-radius: 8px; /* Rounded corners */
  cursor: pointer;
  transition: all 0.3s ease; /* Smooth transitions */
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2), 0 1px 3px rgba(0, 0, 0, 0.1); /* Stylish shadow */
}

.btn1:hover {
  background-color: #45a049; /* Darker green */
  box-shadow: 0 6px 10px rgba(0, 0, 0, 0.3), 0 2px 4px rgba(0, 0, 0, 0.2); /* Shadow on hover */
  transform: translateY(-2px); /* Lift effect */
}
.btn2:hover {
  background-color: #fa0a0a; /* Darker green */
  box-shadow: 0 6px 10px rgba(0, 0, 0, 0.3), 0 2px 4px rgba(0, 0, 0, 0.2); /* Shadow on hover */
  transform: translateY(-2px); /* Lift effect */
}

button:active {
  box-shadow: 0 2px 4px rgba(0, 
}
 body::before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: linear-gradient(120deg, #a1c4fd, #c2e9fb, #fbc2eb, #a6c1ee);
  background-size: 400% 400%;
  animation: gradientAnimation 15s ease infinite;
  z-index: -1;
}
@keyframes gradientAnimation {
  0% {
    background-position: 0% 50%;
  }
  50% {
    background-position: 100% 50%;
  }
  100% {
    background-position: 0% 50%;
  }
}

</style>
</head>
<body>
<div class="table-container">
        <h1>Employee Details</h1>
        <table>
            <thead>
                <tr>
                	<th>Id</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Email</th>
                    <th>Salary</th>
                    <th>Operation</th>
                </tr>
            </thead>
            <tbody>
            <%
            String query1="select * from employee order by id ";
            PreparedStatement pstm=EmployeeService.con.prepareStatement(query1);
            ResultSet rd=pstm.executeQuery();
            while(rd.next()){
            %>
            <tr>
                    <td><%=rd.getInt("id") %></td>
                    <td><%=rd.getString("name") %></td>
                    <td><%=rd.getInt("age") %></td>
                    <td><%=rd.getString("email") %></td>
                    <td><%=rd.getDouble("sal") %></td>
                    <td>
                        <div class="one">
                            <a href="Update.html"><button class="btn1">Update</button></a>
                            <a href="Delete.html"><button class="btn2">Delete</button></a>
                        </div>
                    </td>
                </tr>
                <%} %>
              
            </tbody>
        </table>
    </div>
</body>
</html>