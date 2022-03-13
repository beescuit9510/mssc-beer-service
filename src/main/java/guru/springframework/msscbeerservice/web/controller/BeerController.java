package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("{beerId}")
     public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //todo impl

        ResponseEntity<BeerDto> response = new ResponseEntity<>(HttpStatus.OK);

        return response;
    };

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto){
        //todo impl

        ResponseEntity<BeerDto> response = new ResponseEntity<>(HttpStatus.CREATED);

        return response;

    };

    @PutMapping("{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody  BeerDto beerDto){
        //todo impl

        ResponseEntity response = new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return response;

    };
}
