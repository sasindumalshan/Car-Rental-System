package lk.ijse.carRental.config;

import org.apache.commons.fileupload.FileItem;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/26/2023
 */
@Configuration
@Import({JPAConfig.class})
@ComponentScan(basePackages = "lk.ijse.carRental.service")
public class WebRootConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }



}
