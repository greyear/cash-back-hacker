package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceJUnit5Test {

    @Test
    public void remain1000Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void remain999Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void remain1Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void remain500Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(2500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void remainAmount1Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }
}