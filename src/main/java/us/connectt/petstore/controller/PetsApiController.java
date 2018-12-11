package us.connectt.petstore.controller;

import org.openapitools.api.PetsApi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
public class PetsApiController implements PetsApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        System.out.println("Hello World!");
        return Optional.empty();
    }
}
