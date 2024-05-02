package app.benchmark;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AppServiceTest {
  private static final AppService appService = new AppService();

  public static Stream<Arguments> generateInput() {
    return Stream.of(
        Arguments.of(new int[] {2, 3, 5, 1, 3}, 3, new boolean[] {true, true, true, false, true}),
        Arguments.of(
            new int[] {4, 2, 1, 1, 2}, 1, new boolean[] {true, false, false, false, false}),
        Arguments.of(new int[] {12, 1, 12}, 10, new boolean[] {true, false, true}));
  }

  @ParameterizedTest
  @MethodSource("generateInput")
  void test(int[] candies, int extraCandies, boolean[] expected) {
    assertThat(appService.kidsWithCandies(candies, extraCandies)).isEqualTo(expected);
  }
}
