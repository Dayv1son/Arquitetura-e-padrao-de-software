package termometro;

public class TemperaturaAdapter extends Temperatura {
	
	public String getTemperatura() {
		return super.getTemperatura();
	}

	public void setTemperatura(String temperatura) {
		String []value = temperatura.split(" ");
		String newTemperatura = "";
		
		if(value[value.length - 1].equals("F")) {
			double novaTemperatura = ((Double.parseDouble(value[0]) - 32) * (5.0/9.0));
			newTemperatura = Double.toString(novaTemperatura) + " C";
		}
		else if(value[value.length - 1].equals("K")) {
			double novaTemperatura = (Double.parseDouble(value[0]) - 273);
			newTemperatura = Double.toString(novaTemperatura) + " C";
		}
		super.setTemperatura(newTemperatura);
	}
	
}
