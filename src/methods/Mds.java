package methods;

public class Mds extends AbstractMethod{

	public void setValues(float lambda, float mu){
		setLambda(lambda);
		setMu(mu);
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
		return getRho()+getLq();
	}

	@Override
	public float getLq() {
		float upper,lower;
		upper=(float) Math.pow(getRho(), 2);
		lower=2*(1-getRho());
		return upper/lower;
	}

	@Override
	public float getPo() {
		return 0;
	}

	@Override
	public float getPn() {
		return 1-getRho();
	}

	@Override
	public float getRho() {
		return 0;
	}

}
