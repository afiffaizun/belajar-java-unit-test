package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {

  @Test
  @EnabledOnOs({OS.WINDOWS})
  public void testRunOnlyWindows() {
    // Uji ini hanya akan berjalan pada sistem operasi Windows
    System.out.println("Uji ini berjalan pada Windows!");
  }

  @Test
  @DisabledOnOs({OS.WINDOWS})
  public void testDisabledOnWindows() {
    // Uji ini tidak akan berjalan pada sistem operasi Windows
    System.out.println("Uji ini tidak berjalan pada Windows!");
  }

  @Test
  @EnabledOnJre({JRE.JAVA_8})
  void testEnabledOnJava8() {
    // Uji ini hanya akan berjalan dengan runtime Java 8
    System.out.println("Uji ini berjalan pada Java 8!");
  }

  @Test
  @DisabledOnJre({JRE.JAVA_8})
  void testDisabledOnJava8() {
    // Uji ini tidak akan berjalan dengan runtime Java 8
    System.out.println("Uji ini tidak berjalan pada Java 8!");
  }

  @Test
  @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22)
  void testEnabledOnJava11To22() {
    // Uji ini akan berjalan dengan versi Java antara 11 dan 22 (inklusif)
    System.out.println("Uji ini berjalan pada Java 11 hingga 22!");
  }

  @Test
  @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22)
  void testDisabledOnJava11To22() {
    // Uji ini tidak akan berjalan dengan versi Java antara 11 dan 22 (inklusif)
    System.out.println("Uji ini tidak berjalan pada Java 11 hingga 22!");
  }

//  @Test
//  @EnabledIfEnvironmentVariable({
//    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "Oracle DEV")
//  })

  void testEnabledProfileDev() {
    // Uji ini hanya akan berjalan jika variabel lingkungan PROFILE diatur ke "Oracle DEV"
    System.out.println("Uji ini berjalan dengan profil DEV!");
  }

  @Test
  @DisabledIfSystemProperties({
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
  })

  void testDisabledOnJavaVendorOracle() {
    // Uji ini tidak akan berjalan jika properti sistem java.vendor adalah "Oracle Corporation"
    System.out.println("Uji ini tidak berjalan dengan vendor Java Oracle!");
  }
}