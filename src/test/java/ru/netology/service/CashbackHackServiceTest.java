package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {


    @Test
    public void testCalculateLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        Assert.assertEquals (cashbackHackService.remain(amount), expected);
    }

    @Test
    public void testCalculateMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1300;
        int expected = 700;
        Assert.assertEquals(cashbackHackService.remain(amount),expected);
    }

    @Test
    public void testCalculate0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }

    @Test
    public void testCalculate1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }

}