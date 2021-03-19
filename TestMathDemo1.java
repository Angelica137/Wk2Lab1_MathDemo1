
public class TestMathDemo1 {

	public static void main(String[] args) {
		// Create MathDemo1 object and test the methods
		// test generateLottNumber()
		MathDemo m = new MathDemo();
		m.generateLottoNumber();
		// test .max() same numbers
		m.max(1, 1, 1);
		// test .max() all different numbers
		m.max(1, 2, 3);
		// test max 2 numebrs same
		m.max(1, 2, 2);

	}

}
