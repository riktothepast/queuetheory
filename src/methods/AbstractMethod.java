package methods;

public abstract class AbstractMethod {
	float lambda;
	float mu;
	float ro;
	float n;
	float k;
	
	public abstract float getW();
	public abstract float getWq();
	public abstract float getL();
	public abstract float getLq();
	public abstract float getPo();
	public abstract float getPn();
	public abstract float getRo();

	
	public AbstractMethod(){}
	public float getLambda(){return this.lambda;}
	public float getMu(){return this.mu;}
	public float getN(){return this.n;}
	public float getK(){return this.k;}
	public void setLambda(float l){this.lambda=l;}
	public void setRo(float ro){this.ro=ro;}
	public void setMu(float m){this.mu=m;}
	public void setN(float n){this.n=n;}
	public void setK(float n){this.k=n;}
}