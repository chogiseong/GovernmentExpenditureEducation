package Ans_Student;

public class HwStudent extends Student {
	
	int circuit;

	HwStudent(String name, String id) {
		super(name, id);
	}
	
	void setCircuit(int circuit) {
		this.circuit = circuit;
	}
	
	int getCircuit() {
		return circuit;
	}
		
	@Override
	int calcTotal() {
		// TODO Auto-generated method stub
		total =super.calcTotal() + circuit;
		
		return total;
	}
	
	@Override
	float calcAvg() {
		// TODO Auto-generated method stub
		
		if(total == 0) total = calcTotal();
		
		avg = total/4f;
		
		return avg;
	}
	
}
