<!DOCTYPE html>
<html>
<head>
    <title>Make a Reservation</title>
</head>
<body>
    <h1>Reservation Form</h1>
    <form action="reserve" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        
        <label for="checkInDate">Check-in Date:</label>
        <input type="date" id="checkInDate" name="checkInDate" required><br>
        
        <label for="checkOutDate">Check-out Date:</label>
        <input type="date" id="checkOutDate" name="checkOutDate" required><br>
        
        <input type="submit" value="Reserve">
    </form>
</body>
</html>
