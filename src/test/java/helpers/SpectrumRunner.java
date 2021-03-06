package helpers;

import com.greghaskins.spectrum.Spectrum;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

public class SpectrumRunner {

  public static Result run(final Class<?> specClass) throws Exception {
    return new JUnitCore().run(Request.runner(new Spectrum(specClass)));
  }

}
