package lab9;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class Ex2 {
    public static void main(String[] args){
        Flux.interval(Duration.ofMillis(250))
                .map(input -> {

                            if(input<3) return "tick " + input;
                            throw new RuntimeException("boom");
        })
                .retry(1)
                .elapsed()
                .subscribe(System.out::println, System.err::println);

        try {
            Thread.sleep(2100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
