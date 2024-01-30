public class Veiculo {
    
    private Motor motor;
    private Pneu pneuD;
    private Pneu pneuD2;
    private Pneu pneuT;
    private Pneu pneuT2;
    private Tanque tanque;

    public Veiculo(Motor motor, Pneu pD, Pneu pD2, Pneu pT, Pneu Pt2, Tanque tanque) {
        this.motor = motor;
        this.pneuD = pD;
        this.pneuD2 = pD2;
        this.pneuT = pT;
        this.pneuT2 = Pt2;
        this.tanque = tanque;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneu getPneuD() {
        return pneuD;
    }

    public void setPneuD(Pneu pneuD) {
        this.pneuD = pneuD;
    }

    public Pneu getPneuD2() {
        return pneuD2;
    }

    public void setPneuD2(Pneu pneuD2) {
        this.pneuD2 = pneuD2;
    }

    public Pneu getPneuT() {
        return pneuT;
    }

    public void setPneuT(Pneu pneuT) {
        this.pneuT = pneuT;
    }

    public Pneu getPneuT2() {
        return pneuT2;
    }

    public void setPneuT2(Pneu pneuT2) {
        this.pneuT2 = pneuT2;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }


}
