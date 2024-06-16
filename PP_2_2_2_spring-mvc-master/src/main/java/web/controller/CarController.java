package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


//    (@RequestParam(value = "count", defaultValue = "5"))

    @GetMapping("/cars")
    public String showCar(@RequestParam(value = "count", defaultValue = "5")  int count, Model model) {
        System.out.println();
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", "Lada", 1970));
        carList.add(new Car("BMW", "Bayerische Motoren Werke", 1916));
        carList.add(new Car("Toyota", "Toyota Motor Corporation", 1937));
        carList.add(new Car("Audi", "Audi", 1909));
        carList.add(new Car("UAZ", "Ulyanovsk Automobile Plant", 1941));

        model.addAttribute("tableCar", carList.stream().limit(count));


//        if (count == 5) {
//            System.out.println(carList);
//        } else


        return "cars";
    }
}
