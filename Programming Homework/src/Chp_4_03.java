
public class Chp_4_03 {

	public static void main(String[] args) {

		double x1 = 51.5138505182;
		double y1 = -0.15690922737098845;

		double x2 = 28.5383355;
		double y2 = -81.37923649999999;

		double x3 = 32.0835407;
		double y3 = -81.09983419999998;

		double x4 = 35.2270869;
		double y4 = -80.84312669999997;

		double s1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		double s2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

		double s3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		double s_1 = (s1 + s2 + s3) / 2;

		double area = Math.sqrt(s_1 * (s_1 - s1) * (s_1 - s2) * (s_1 - s3));

		s1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		s2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

		s3 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));

		double s_2 = (s1 + s2 + s3) / 2;

		area = Math.sqrt(s_2 * (s_2 - s1) * (s_2 - s2) * (s_2 - s3)) + area;

		System.out.print(
				"The area enclosed by Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina is "
						+ area + " km^2");

	}

}
