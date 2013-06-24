package methods;

public class Mmsk extends AbstractMethod{

    private float S;

    public float getElamda(){
        return this.lambda*(1-this.getPk());
    }

    public void setValues(float lambda, float mu, float s, float k){
        this.setLambda(lambda);
        this.setMu(mu);
        this.setS(s);
        this.setK(k);
    }

    public void setS(float s){
        this.S = s;
    }

    public float getS(){
        return this.S;
    }

    @Override
    public float getW() {
            return getWq() + 1/getMu();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getWq() {
        return getLq()/getElamda();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getL() {
        return getW()*getElamda();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getLq() {
        float part1,part2,part3,lq;
        part1 = this.getPo()*((getExponential(this.getS()*this.getRho(),this.getS())*this.getRho())/(factorial(this.getS())*(getExponential(1-getRho(),2))));
        part2 = getExponential(getRho(),getK()-getS()+1);
        part3 = (getK()-getS()+1)*(1-getRho())*getExponential(getRho(),getK()-getS());
        lq = part1*(1-part2-part3);
        return lq;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getPo() {
        float part1=0,part2=0,part3=0;
        for(int i= 1;i<=this.getS();i++){
            part1 += (getExponential(this.getLambda()/this.getMu(),i)*(1/factorial(i)));
        }
        for(int i=(int)(this.getS()+1);i<=this.getK();i++){
           part2 += getExponential(this.getLambda()/(this.getS()*this.getMu()),i-this.getS());
        }
        part3 = (1/factorial(this.getS())*part2);

        return 1/(1+part1 + part3);
    }

    @Override
    public float getPn() {
        if(this.getN()<=this.getS()){
            return (getExponential(this.getLambda(),this.getN())/(getExponential(this.getMu(),this.getN())*factorial(this.getN())));
        }
        if(this.getS() <= this.getN() && this.getN() <= this.getK()){
            return (getExponential(this.getLambda(),this.getN())/(getExponential(this.getMu(),this.getN())*factorial(this.getS())*getExponential(this.getS(),(this.getN()-this.getS()))));
        }
        return 0;
    }

    public float getPk() {
        if(this.getK()<=this.getS()){
            return (getExponential(this.getLambda(),this.getK())/(getExponential(this.getMu(),this.getK())*factorial(this.getK())));
        }
        if(this.getS() <= this.getK() && this.getK() <= this.getK()){
            return (getExponential(this.getLambda(),this.getK())/(getExponential(this.getMu(),this.getK())*factorial(this.getS())*getExponential(this.getS(),(this.getK()-this.getS()))));
        }
        return 0;
    }

    @Override
    public float getRho() {
        return this.getLambda()/(this.getS()*this.getMu());
    }

    private float getExponential(float base,float exponent){
        float result = (float) Math.pow(base,exponent);
        return result;
    }
}
