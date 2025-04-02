package com.seungjoo.section02.junit;

import org.junit.jupiter.api.*;

public class LifeCycleTest {
    /* @BeforeAll : 모든 테스트 메소드 실행 전에 최초에 실행시킬 구문 작성 */
    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll - 모든 테스트 메소드 실행 전에 최초에 1번만 실행됨 ====");
    }

    /* @BeforeEach : 각 테스트 메소드 실행 전에 반복해서 실행시킬 구문 작성 */
    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach - 각 테스트 메소드 전에 매번 실행됨 ------------------");
    }

    /* @AfterEach : 각 테스트 메소드 실행 후에 반복해서 실행시킬 구문 작성 */
    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach - 각 테스트 메소드 후에 매번 실행됨 -------------------");
    }

    /* @AfterAll : 모든 테스트 메소드 실행 후에 최종적으로 실행시킬 구문 작성 */
    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll - 모든 테스트 메소드 후에 최종적으로 1번만 실행됨 ======");
    }

    /* @Test : 각 기능별 테스트를 위한 구문 작성 */
    @Test
    public void test1_테스트케이스1(){
        System.out.println("@Test - 테스트케이스1 실행");
    }

    @Test
    public void test2_테스트케이스2(){
        System.out.println("@Test - 테스트케이스2 실행");
    }

}
