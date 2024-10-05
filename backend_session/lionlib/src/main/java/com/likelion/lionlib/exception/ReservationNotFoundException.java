package com.likelion.lionlib.exception;

public class ReservationNotFoundException extends RuntimeException{
    public ReservationNotFoundException() {
        super("Reservation을 찾을 수 없습니다.");
    }

    public ReservationNotFoundException(Long reservationId) {
        super("Reservation: " + reservationId + "를 찾을 수 없습니다.");
    }
}
