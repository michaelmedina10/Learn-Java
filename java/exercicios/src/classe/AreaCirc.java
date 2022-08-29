package classe;

public class AreaCirc {
	double raio;
	static double pi = 3.14;
	
	public AreaCirc(double areaInicial) {
		raio = areaInicial;
	}
	
	double area() {
		return raio * raio * pi;
	}
}
