package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.net.URI;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
                //create a temple
    }
    @Test
    void testSaveNewBeer() {
        //given
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

        URI uri = client.savedNewBeer(beerDto);

        assertNotNull(uri);

        System.out.println(uri.toString());

    }
    @Test
    void testUpdateBeer(){
        BeerDto beerDto = BeerDto.builder().beerName("HAHA Stop ").build();
        client.updateBeer(UUID.randomUUID(),beerDto);
    }
    @Test
    void testDeleteBeer(){
        client.deleteBeer(UUID.randomUUID());

    }
}