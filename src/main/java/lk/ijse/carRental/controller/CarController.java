package lk.ijse.carRental.controller;

import lk.ijse.carRental.service.impl.CarService;
import lk.ijse.carRental.utility.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(params = {"pageNo"} ,path = "/getCars",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil  getAllCars(int pageNo){
        System.out.println(pageNo);
        return new ResponseUtil("Ok","Successfully Added", carService.getCars(pageNo));
    }
    @GetMapping(path = "/getForUi",params = {"category"})
    public ResponseUtil getCasForUi(String category){
        return new ResponseUtil("200","get",carService.getCarsForUi(category));
    }
    @GetMapping(path = "/getCategory")
    public ResponseUtil getCategory(){
        return new ResponseUtil("200","get",carService.getCategory());
    }

    @GetMapping(path = "/goToRent")
    /*public void goToRent(HttpServletResponse httpServletResponse ) throws IOException {
        httpServletResponse.sendRedirect("http://localhost:8080/CarRental_war/rent.html");
    }*/
    /*public String yourMethod(HttpServletResponse httpServletResponse ,RedirectAttributes redirectAttributes) throws IOException {
        httpServletResponse.sendRedirect("http://localhost:8080/CarRental_war/rent.html");
        redirectAttributes.addAttribute("rd", "rdValue");
        redirectAttributes.addFlashAttribute("fa", "5555");
        return "redirect:/rent.html";
    }*/

    public ModelAndView redirectWithUsingRedirectPrefix(ModelMap carCodeText) {
        System.out.println(carCodeText);
        Object carCode = carCodeText.getAttribute("carCodeText");
        System.out.println(carCode);
        carCodeText.addAttribute("carCord", carCode);
        return new ModelAndView("redirect:/rent.html", carCodeText);
    }
    @GetMapping(path = "/loadRent")
    public String loadRent( ) throws IOException {
        return "CarRental_war/rent";
    }
}
