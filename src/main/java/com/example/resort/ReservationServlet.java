package com.example.resort;

import com.example.model.Reservation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet("/reserve")
public class ReservationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // In-memory storage for reservations
    private List<Reservation> reservations = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Collect form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String checkInDate = request.getParameter("checkInDate");
        String checkOutDate = request.getParameter("checkOutDate");

        // Create a new reservation
        Reservation reservation = new Reservation(name, email, checkInDate, checkOutDate);
        reservations.add(reservation);

        // Store reservations in session
        HttpSession session = request.getSession();
        session.setAttribute("reservations", reservations);

        // Redirect to the reservations page
        response.sendRedirect("reservation.jsp");
    }
}



