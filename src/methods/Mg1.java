package methods;

public class Mg1 extends AbstractMethod{

	private float variance;

    public void setValues(float lambda, float mu, float s){
        setLambda(lambda);
        setMu(mu);
        setVariance(s);
    }
	
	public float getVariance(){
		return this.variance;
	}
	
	public void setVariance(float variance){
		this.variance = variance;
	}
	
	public float getMeanService(){
		return 1/getMu();
	}
	
	@Override
	public float getW() {
		return getWq()+1/getMu();
	}

	@Override
	public float getWq() {
		return getLq()/getLambda();
	}

	@Override
	public float getL() {
		return getRho() + getLq();
	}

	@Override
	public float getLq() {
		return (getLambda()*getLambda()*getVariance()+getRho()*getRho())/(2*(1- getRho()));
	}

	@Override
	public float getPo() {
		return 1-getRho();
	}

	@Override
	public float getPn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getRho() {
		return getLambda()/getMu();
	}

}
