import org.javaunit.autoparams.AutoSource;
import org.javaunit.autoparams.customization.Customization;
import org.javaunit.autoparams.mockito.MockitoCustomizer;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.OffsetDateTime;

public class OffsetDateTime_specs {
	@AutoSource
	@ParameterizedTest
	void pass(
		OffsetDateTime offsetDateTime
    ) {
		assert true;
	}

	@AutoSource
	@ParameterizedTest
	@Customization(MockitoCustomizer.class)
	void fail(
		OffsetDateTime offsetDateTime
	) {
		assert true;
	}
}
