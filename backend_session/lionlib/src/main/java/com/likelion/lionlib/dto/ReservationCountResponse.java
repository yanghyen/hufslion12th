package com.likelion.lionlib.dto;

public class ReservationCountResponse {
    private Long count;

    public ReservationCountResponse(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
