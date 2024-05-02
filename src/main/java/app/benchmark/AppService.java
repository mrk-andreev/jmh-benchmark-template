package app.benchmark;

public class AppService {
  public boolean[] kidsWithCandies(int[] candies, int extraCandies) {
    if (candies.length == 0) {
      return new boolean[0];
    }

    int maxValue = candies[0];
    for (int candy : candies) {
      if (candy > maxValue) {
        maxValue = candy;
      }
    }
    maxValue -= extraCandies;

    boolean[] ret = new boolean[candies.length];
    for (int i = 0; i < candies.length; i++) {
      ret[i] = candies[i] >= maxValue;
    }

    return ret;
  }
}
