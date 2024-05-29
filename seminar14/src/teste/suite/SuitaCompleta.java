package teste.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PachetTuristicWithFixture;
import teste.PersoanaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicWithFixture.class, PersoanaTest.class})
public class SuitaCompleta {
}