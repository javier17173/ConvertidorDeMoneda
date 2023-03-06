package temperatura;

public class ConvertidorTemperatura {
	
	
	public ConvertidorTemperatura(){
		
	}
	
	public double CelsiusAFahrenheit (double Celsius) {
		double Fahrenheit = (Celsius * 9/5) + 32;
        return Fahrenheit;
	}
	 
    public double CelsiusAKelvin(double Celsius){
        double Kelvin = Celsius + 273.15;
        return Kelvin;
    }

   
    public double FahrenheitACelsius(double Fahrenheit){
        double Celsius = (Fahrenheit - 32) * 5/9;
        return Celsius;
    }
   
    
    public double FahrenheitAKelvin(double Fahrenheit){
        double Kelvin = (Fahrenheit - 32) * 5/9 + 273.15;
        return Kelvin;
    }

    
    public double KelvinACelsius(double Kelvin){
        double Celcius = Kelvin - 273.15;
        return Celcius;
    }
    
    
    public double KelvinAFahrenheit(double Kelvin){
        double Fahrenheit = (Kelvin - 273.15) * 9/5 + 32;
        return Fahrenheit;
    }
	
	
	
}
