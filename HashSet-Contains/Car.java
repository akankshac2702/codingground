public class Car{
    private String carName;
    
    public Car(String carName){
        this.carName = carName;
    }
    
    public void setCarName(String carName){
        this.carName = carName;
    }
    
    public String getCarName(){
        return this.carName;
    }
    
	public int hashCode() {
		final int prime = 31;
		return prime;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car otherCar = (Car) obj;
		if (carName == null) {
			if (otherCar.carName != null)
				return false;
		} else if (!carName.equals(otherCar.carName))
			return false;
		return true;
	}
}