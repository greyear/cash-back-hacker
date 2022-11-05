package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remain1000Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void remain999Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void remain1Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void remain500Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(2500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void remainAmount1Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }
}