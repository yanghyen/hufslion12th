package com.likelion.lionlib.controller;

import com.likelion.lionlib.dto.*;
import com.likelion.lionlib.jwt.JwtUtil;
import com.likelion.lionlib.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MemberController {
    private final MemberService memberService;
    private final LoanService loanService;
    private final ReservationService reservationService;

    // 회원 정보 조회
    @GetMapping("/members/{memberId}")
    public ResponseEntity<MemberResponse> getMember(@PathVariable Long memberId) {
        log.info("Request GET member with ID: {}", memberId);
        MemberResponse memberResponse = memberService.findMember(memberId);
        return ResponseEntity.ok(memberResponse);
    }

    // 프로필 수정
    @PutMapping("/members")
    public ResponseEntity<MemberResponse> putMember(Authentication authentication, @RequestBody ProfileRequest updateRequest) {
        Long memberId = ((CustomUserDetails)authentication.getPrincipal()).getId();
        log.info("Request PUT update member with ID: {}", memberId);
        MemberResponse updatedMember = memberService.updateMember(memberId, updateRequest);
        return ResponseEntity.ok(updatedMember);
    }
    // 사용자의 대출 목록 조회
    @GetMapping("/members/loans")
    public ResponseEntity<List<LoanResponse>> getLoansByMemberId(
            @AuthenticationPrincipal CustomUserDetails customUserDetails) {
        log.info("Request GET loans for member with ID: {}", customUserDetails.getId());
        List<LoanResponse> loans = loanService.getLoansByMemberId(customUserDetails.getId());
        log.info("Response GET loans for member: {}", loans);
        return ResponseEntity.ok(loans);
    }

    // 사용자 예약 목록 조회
    @GetMapping("/members/reservations")
    public ResponseEntity<List<ReservationResponse>> getMemberReservation(
            @AuthenticationPrincipal CustomUserDetails customUserDetails) {
        log.info("Request GET a reservation: {}", customUserDetails.getId());
        return ResponseEntity.ok(reservationService.getReservationsByMemberId(customUserDetails.getId()));
    }

}