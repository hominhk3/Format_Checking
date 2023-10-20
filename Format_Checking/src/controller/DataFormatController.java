package controller;

import repository.DataFormatRepository;
import view.Menu;

public class DataFormatController extends Menu {

    protected static String[] mc = {"Phone format check", "Date format check",
        "Email format check", "Exit"};
    protected DataFormatRepository dataRepo;

    public DataFormatController() {
        super("====== Validate Progaram ======", mc);
        dataRepo = new DataFormatRepository();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("------ Phone Format Check ------");
                dataRepo.checkPhone();
                break;
            }
            case 2: {
                System.out.println("------ Date Format Check ------");
                dataRepo.checkDate();
                break;
            }
            case 3: {
                System.out.println("------ Email Format Check ------");
                dataRepo.checkEmail();
                break;
            }
            case 4: {
                System.out.println("EXIT...");
                System.exit(0);
            }
            default: {
                System.out.println("No such choice!");
            }
        }
    }
}
