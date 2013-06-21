package methods;

public class Meks extends AbstractMethod{

	private float k,n;
	
	public void setK(float k){
		this.k = k;
	}
	
	public float getK(){
		return this.k;
	}

	public void setN(float n){
		this.n = n;
	}
	
	public float getN(){
		return this.n;
	}

	
	@Override
	public float getW() {
		float w;
		w = this.getWq() + 1/this.getMu();
		return w;
	}

	@Override
	public float getWq() {
		float wq;
		wq = this.getLambda()/(this.getMu()*(this.getMu()-this.getLambda()));
		return wq;
	}

	@Override
	public float getL() {
		float l;
		l = this.getLambda() * this.getW();
		return l;
	}

	@Override
	public float getLq() {
		float up,down,lq;
		up = ((this.getLambda()*this.getLambda())/(this.getK()*this.getMu()*this.getMu()))+(this.getRo()*this.getRo());
		down = 2 * (1 - this.getRo());
		lq = up / down;
		return lq;
	}

	public float getLostP(){
		float up,down,lostp;
		down = 0;
		up = this.getRo() / this.factorial(this.getN());
		for(int i=0; i <= this.getN(); i++){
			down += ((float) Math.pow(this.getRo(), i))/ this.factorial(i);
		}
		lostp = up / down;
		return lostp;
	}
	
	@Override
	public float getPo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getRo() {
		float rho;
		rho = this.getLambda()/this.getMu();
		return rho;
	}

}
