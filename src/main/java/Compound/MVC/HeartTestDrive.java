package Compound.MVC;

import Compound.MVC.Controller.ControllerInterface;
import Compound.MVC.Controller.HeartController;
import Compound.MVC.Model.HeartModel;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
