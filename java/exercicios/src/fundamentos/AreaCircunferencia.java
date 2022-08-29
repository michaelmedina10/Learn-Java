package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		float raio = 3.4f;
		final float PI = 3.14159f;
		double area = PI * Math.round(Math.pow(raio, 2));
		System.out.println("Area da circunferência: " + area);
	}
}
