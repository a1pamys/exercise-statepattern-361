package kz.edu.nu.cs.exercise;

public class State2 extends State {

    public State2(StateContext sc) {
        this.sc = sc;
    }

    @Override
    public void actionA() {
        this.sc.setCurrentState(sc.state3);
    }

    public void actionB() {
        this.sc.setCurrentState(sc.state1);
    }

    @Override
    public boolean isAccept() {
        return false;
    }
}
