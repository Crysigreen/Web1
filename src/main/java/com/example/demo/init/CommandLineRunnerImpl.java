package com.example.demo.init;

import com.example.demo.dtos.BrandDto;
import com.example.demo.dtos.ModelDto;
import com.example.demo.dtos.RoleDto;
import com.example.demo.model.Enums;
import com.example.demo.model.UserRole;
import com.example.demo.services.BrandService;
import com.example.demo.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private ModelService modelService;

    @Autowired
    private BrandService brandService;



    @Override
    public void run(String... args) throws Exception {
        addDataAboutAuto();
    }


    private void addDataAboutAuto() throws IOException {

//        BrandDto brandDto1 = new BrandDto(UUID.fromString("e3f51b58-3d1c-4960-a56c-5c70a58bdc7c"), "BMW", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        BrandDto brandDto2 = new BrandDto(UUID.fromString("f7a3b589-5d7d-432f-bdc7-0be9b2c7fb39"), "Toyota", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        BrandDto brandDto3 = new BrandDto(UUID.fromString("9c9fb08a-145b-46d3-b530-174b3d5e6b5c"), "Mercedes", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        BrandDto brandDto4 = new BrandDto(UUID.fromString("7bf7d10d-8653-401d-a5b8-7d9a1a24eb07"), "OMODA", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        BrandDto brandDto5 = new BrandDto(UUID.fromString("3b49e8f7-3013-45a5-8e64-9ab8cb6efb3b"), "Audi", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//
        BrandDto brandDto1 = new BrandDto( null,"BMW", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        BrandDto brandDto2 = new BrandDto( null,"Toyota", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        BrandDto brandDto3 = new BrandDto( null,"Mercedes", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        BrandDto brandDto4 = new BrandDto( null,"OMODA", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        BrandDto brandDto5 = new BrandDto( null,"Audi", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);




        BrandDto brandDto11 = brandService.createNewBrand(brandDto1);
        BrandDto brandDto21 = brandService.createNewBrand(brandDto2);
        BrandDto brandDto31 = brandService.createNewBrand(brandDto3);
        BrandDto brandDto41 = brandService.createNewBrand(brandDto4);
        BrandDto brandDto51 = brandService.createNewBrand(brandDto5);



//        ModelDto modelDto1 = new ModelDto(UUID.fromString("23f42e6c-9d7c-4f9e-a5b3-c01dcd7f5c9e"), "name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto1, Enums.Category.Buss, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        ModelDto modelDto2 = new ModelDto(UUID.fromString("4a6a91c0-53d2-4c6c-b207-c69b92b0cf77"), "name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto1, Enums.Category.Motorcycle, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        ModelDto modelDto3 = new ModelDto(UUID.fromString("f3a1c7ed-7ebf-45dd-9e8d-3da82c6571db"), "name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto3, Enums.Category.Car, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        ModelDto modelDto4 = new ModelDto(UUID.fromString("f07e9a4e-1b1c-4914-97bb-1bc4919b3b93"), "name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto4, Enums.Category.Truck, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
//        ModelDto modelDto5 = new ModelDto(UUID.fromString("8d5f1c70-d1c0-4f9e-bc0e-1a5a4810d1f9"), "name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto2, Enums.Category.Buss, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);

        ModelDto modelDto1 = new ModelDto( null, "name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto11, Enums.Category.Buss, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto2 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto21, Enums.Category.Motorcycle, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto3 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto31, Enums.Category.Car, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto4 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto41, Enums.Category.Truck, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto5 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto51, Enums.Category.Buss, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);

        //        (brand_id,category,created,endyear,imageurl,is_deleted,modified,name,startyear)

        modelService.createNewModel(modelDto1);
        modelService.createNewModel(modelDto2);
        modelService.createNewModel(modelDto3);
        modelService.createNewModel(modelDto4);
        modelService.createNewModel(modelDto5);


        //RoleDto userRole1 = new RoleDto( null, LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), Enums.Role.Admin, false);
        //RoleDto userRole2 = new RoleDto( null, LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), Enums.Role.User, false);


    }


}
