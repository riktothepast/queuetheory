package methods;

public class Mek1 extends AbstractMethod{

	private float k;
	
	public void setK(float k){
		this.k = k;
	}
	
	public float getK(){
		return this.k;
	}
	
	@Override
	public float getW() {
		float ws;
		ws = this.getWq() + 1/this.getMu();
		return ws;
	}

	@Override
	public float getWq() {
		float down,wq;
		down = this.getMu()*(this.getMu() - this.getLambda());
		wq = this.getLambda()/down;
		return wq;
	}

	@Override
	public float getL() {
		float ls;
		ls = this.getLambda() * this.getW();
		return ls;
	}

	@Override
	public float getLq() {
		float up,down,lq;
		up = (this.getRho()*this.getRho())*(this.getK()+1);
		down = 2 * this.getK() * (1 - getRho());
		lq = up / down;
		return lq;
	}

	@Override
	public float getPo() {
		float po;
		po = 1 - this.getRho();
		return po;
	}

	@Override
	public float getPn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getRho() {
		float rho;
		rho = this.getLambda()/this.getMu();
		return rho;
	}

}
