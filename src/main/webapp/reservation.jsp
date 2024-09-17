<%@ page import="java.util.List" %>
<%@ page import="com.example.model.Reservation" %>

<!DOCTYPE html>
<html>
<head>
    <title>Reservations</title>
</head>
<body>
    <h1>Reservations List</h1>
    <a href="index.jsp">Home</a>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Check-in Date</th>
            <th>Check-out Date</th>
        </tr>
        <%
        @SuppressWarnings("unchecked")
            List<Reservation> reservations = (List<Reservation>) session.getAttribute("reservations");
            if (reservations != null) {
                for (Reservation reservation : reservations) {
        %>
        <tr>
            <td><%= reservation.getName() %></td>
            <td><%= reservation.getEmail() %></td>
            <td><%= reservation.getCheckInDate() %></td>
            <td><%= reservation.getCheckOutDate() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>
