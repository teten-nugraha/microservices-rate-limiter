package id.ten.microservices.ratelimitterpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class ComputeResponse {

    private int input;
    private long output;
    private ResponseType responseType;
    private String message;
}
