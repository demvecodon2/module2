package ss9.bai_tap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
   @Test
   @DisplayName("Ngày đầu năm 2018")
   public void testFisrtDayOf2018() {
      int day = 1;
      int month = 1;
      int year = 2018;
      String expected = "2/1/2018";
      String result = NextDayCalculator.getNextDay(day, month, year);
      assertEquals(expected, result);
   }

   @Test
   @DisplayName("Ngày cuối tháng 1 năm 2018")
   public void testLastDayMonth1Of2018() {
      int day = 31;
      int month = 1;
      int year = 2018;
      String expected = "1/2/2018";
      String result = NextDayCalculator.getNextDay(day, month, year);
      assertEquals(expected, result);
   }

   @Test
   @DisplayName("Ngày cuối tháng 4 năm 2018")
   public void testLastDayMonth4Of2018() {
      int day = 30;
      int month = 4;
      int year = 2018;
      String expected = "1/5/2018";
      String result = NextDayCalculator.getNextDay(day, month, year);
      assertEquals(expected, result);
   }

   @Test
   @DisplayName("Ngày cuối tháng 2 năm 2018")
   public void testLastDayMonth2Of2018() {
      int day = 28;
      int month = 2;
      int year = 2018;
      String expected = "1/3/2018";
      String result = NextDayCalculator.getNextDay(day, month, year);
      assertEquals(expected, result);
   }

   @Test
   @DisplayName("Ngày cuối tháng 2 năm 2020")
   public void testLastDayMonth2Of2020() {
      int day = 29;
      int month = 2;
      int year = 2020;
      String expected = "1/3/2020";
      String result = NextDayCalculator.getNextDay(day, month, year);
      assertEquals(expected, result);
   }
   @Test
   @DisplayName("Ngày cuối năm 2018")
   public void testLastDayOf2018() {
      int day = 31;
      int month = 12;
      int year = 2018;
      String expected = "1/1/2019";
      String result = NextDayCalculator.getNextDay(day, month, year);
      assertEquals(expected, result);
   }

}
