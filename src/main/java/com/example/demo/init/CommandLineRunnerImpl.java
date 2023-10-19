package com.example.demo.init;

import com.example.demo.dtos.*;
import com.example.demo.model.Enums;
import com.example.demo.model.UserRole;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.UUID;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private ModelService modelService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private UserService userService;

    @Autowired
    private OfferService offerService;

    @Autowired
    private UserRoleService userRoleService;




    @Override
    public void run(String... args) throws Exception {
        addDataAboutAuto();
    }


    private void addDataAboutAuto() throws IOException {


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


/////////////////////////////////////////////////////////////////////////////////


        ModelDto modelDto1 = new ModelDto( null, "name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto11, Enums.Category.Buss, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto2 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto21, Enums.Category.Motorcycle, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto3 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto31, Enums.Category.Car, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto4 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto41, Enums.Category.Truck, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);
        ModelDto modelDto5 = new ModelDto( null,"name", LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), brandDto51, Enums.Category.Buss, "fdfs",LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), false);

        ModelDto modelDto11 = modelService.createNewModel(modelDto1);
        ModelDto modelDto22 = modelService.createNewModel(modelDto2);
        ModelDto modelDto33 = modelService.createNewModel(modelDto3);
        ModelDto modelDto44 = modelService.createNewModel(modelDto4);
        ModelDto modelDto55 = modelService.createNewModel(modelDto5);


        ////////////////////////////////////////////////////////////////////////

        RoleDto roleDto1 = new RoleDto(LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), null, Enums.Role.User,false);
        RoleDto roleDto2 = new RoleDto(LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), null, Enums.Role.Admin,false);

        RoleDto roleDto11 = userRoleService.createNewRole(roleDto1);
        RoleDto roleDto22 = userRoleService.createNewRole(roleDto2);

        ////////////////////////////////////////////////////////////////////////

        UserDto userDto1 = new UserDto(LocalDateTime.of(2023,7,1,10,0,0), true, LocalDateTime.of(2023,7,1,10,0,0), null, "firstName", "imageurl","lastName","password",roleDto11,"username1",false );
        UserDto userDto2 = new UserDto(LocalDateTime.of(2023,7,1,10,0,0), true, LocalDateTime.of(2023,7,1,10,0,0), null, "firstName", "imageurl","lastName","password",roleDto11,"username2",false );
        UserDto userDto3 = new UserDto(LocalDateTime.of(2023,7,1,10,0,0), true, LocalDateTime.of(2023,7,1,10,0,0), null, "firstName", "imageurl","lastName","password",roleDto11,"username3",false );
        UserDto userDto4 = new UserDto(LocalDateTime.of(2023,7,1,10,0,0), true, LocalDateTime.of(2023,7,1,10,0,0), null, "firstName", "imageurl","lastName","password",roleDto11,"username4",false );
        UserDto userDto5 = new UserDto(LocalDateTime.of(2023,7,1,10,0,0), true, LocalDateTime.of(2023,7,1,10,0,0), null, "firstName", "imageurl","lastName","password",roleDto22,"username5",false );

        UserDto userDto11 =  userService.createUser(userDto1);
        UserDto userDto22 = userService.createUser(userDto2);
        UserDto userDto33 = userService.createUser(userDto3);
        UserDto userDto44 = userService.createUser(userDto4);
        UserDto userDto55 =  userService.createUser(userDto5);


        ///////////////////////////////////////////////////////////////////////////////////////////////


        OfferDto offerDto1 = new OfferDto(LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), new BigDecimal(14000),Year.of(2023),null,10000l,"description", Enums.Engine.GASOLINE,"imageurl",modelDto11.getId(),userDto11.getId(),Enums.Transmission.MANUAL,false);
        OfferDto offerDto2 = new OfferDto(LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), new BigDecimal(35000),Year.of(2023),null,10000l,"description", Enums.Engine.DIESEL,"imageurl",modelDto22.getId(),userDto22.getId(),Enums.Transmission.AUTOMATIC,false);
        OfferDto offerDto3 = new OfferDto(LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), new BigDecimal(78000),Year.of(2023),null,10000l,"description", Enums.Engine.HYBRID,"imageurl",modelDto33.getId(),userDto33.getId(),Enums.Transmission.AUTOMATIC,false);
        OfferDto offerDto4 = new OfferDto(LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), new BigDecimal(21000),Year.of(2023),null,10000l,"description", Enums.Engine.DIESEL,"imageurl",modelDto44.getId(),userDto44.getId(),Enums.Transmission.MANUAL,false);
        OfferDto offerDto5 = new OfferDto(LocalDateTime.of(2023,7,1,10,0,0), LocalDateTime.of(2023,7,1,10,0,0), new BigDecimal(164000),Year.of(2023),null,10000l,"description", Enums.Engine.ELECTRIC,"imageurl",modelDto55.getId(),userDto55.getId(),Enums.Transmission.AUTOMATIC,false);



        OfferDto offerDto11 = offerService.createOffer(offerDto1);
        OfferDto offerDto22 = offerService.createOffer(offerDto2);
        OfferDto offerDto33 = offerService.createOffer(offerDto3);
        OfferDto offerDto44 = offerService.createOffer(offerDto4);
        OfferDto offerDto55 = offerService.createOffer(offerDto5);


    }


}
