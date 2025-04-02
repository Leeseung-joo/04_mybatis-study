package com.seungjoo.section02.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //Fixture(테스트할 대상 또는 테스트에 필요한 객체) 준비
    private Calculator calc = null;

    @BeforeEach
    @Test
    void setUp() {
        calc = new Calculator();
        assertNotNull(calc); //특정 객체가 null인지 아닌지를 비교
    }

    @AfterEach
    void tearDown() {
        System.out.println("단위테스트 완료!");
    }

    @DisplayName("두 수의 합 확인")
    @Test
    void sum() {
        int result = calc.sum(3, 4);
        // junit - assertEquals(예상값, 실제값)  : 두 값이 일치하는지 검증
//        assertEquals(7, result);
        //assertj -assertThat(실제값).isEqualTo(기대값)
        assertThat(result).isEqualTo(7);
    }

    @DisplayName("100~200 랜덤 값 구하기")
    @Test
    void random() {
        int result = calc.random();

//        assertThat(result)
//                .isGreaterThanOrEqualTo(100)
//                .isLessThanOrEqualTo(200);
        assertThat(result).isBetween(100, 200);
    }
}