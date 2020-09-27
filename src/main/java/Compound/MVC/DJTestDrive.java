package Compound.MVC;

import Compound.MVC.Controller.BeatController;
import Compound.MVC.Controller.ControllerInterface;
import Compound.MVC.Model.BeatModel;
import Compound.MVC.Model.BeatModelInterface;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
