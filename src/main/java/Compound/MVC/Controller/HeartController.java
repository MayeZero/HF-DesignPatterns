package Compound.MVC.Controller;

import Compound.MVC.Model.HeartAdapter;
import Compound.MVC.Model.HeartModelInterface;
import Compound.MVC.View.DJView;

public class HeartController implements ControllerInterface{
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model){
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}