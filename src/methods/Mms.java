package methods;

public class Mms extends AbstractMethod{
	float s;
	
	public void setValues(float lambda, float mu, float n, float s, float rho){
		setLambda(lambda);
		setMu(mu);
		setN(n);
		setRho(rho);
		setS(s);
	}

	@Override
	public float getW() {
		return 0;
	}

	@Override
	public float getWq() {
		return 0;
	}

	@Override
	public float getL() {
		return 0;
	}

	@Override
	public float getLq() {
		return 0;
	}

	@Override
	public float getPo() {
		
		return 0;
	}

	@Override
	public float getPn() {
		if(getN()>getS()){
			return (float) (Math.pow(getLambda(),getN())/(Math.pow(getMu(),getN()*factorial(getS())*Math.pow(getS(), (getN()-getS())))))*getPo();		
		}
		if(getN()<=getS()){
			return (float) ((Math.pow(getLambda(), getN()))/(Math.pow(getMu(), getN())*factorial(getN())))*getPo();
		}
		return 0;
	}

	@Override
	public float getRho() {
		return 0;
	}

	public void setS(float s){
		this.s=s;
	}
	
	public float getS(){
		return this.s;
	}
}
