package methods;

public class Mms extends AbstractMethod{
	float s;
	
	public void setValues(float lambda, float mu, float n, float s){
		setLambda(lambda);
		setMu(mu);
		setN(n);
		setS(s);
	}

	@Override
	public float getW() {
		return getL()/getLambda();
	}

	@Override
	public float getWq() {
		return getLq()/getLambda();
	}

	@Override		

	public float getL() {
		return (getLq()+(getLambda()/getMu()));
	}

	@Override
	public float getLq() {
		float upper,lower;
		upper=(float) Math.pow((getLambda()/getMu()), (getS()+1))*getPo();
		lower=(float) (factorial(getS()-1)*Math.pow((getS()-(getLambda()/getMu())),2));
		return upper/lower;
	}

	@Override
	public float getPo() {
		float sumValue=0;
		for(int x=0; x<getS()-1;x++){
			sumValue+=Math.pow(getLambda()/getMu(), getN());
		}
		sumValue=sumValue*(1/factorial(getN()));
		float spart;
		spart=(float) ((1/factorial(getS()))*Math.pow(getLambda()/getMu(), getS()))*(1/(1-(getLambda()/(getS()/getMu()))));
		return 1/(sumValue+spart);
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
	
	public float Prob(float t){
		Math.exp(-getMu()*t);
		return 0;
	}
}
